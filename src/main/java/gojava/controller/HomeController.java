package gojava.controller;
import gojava.model.Apartment;
import gojava.model.City;
import gojava.model.User;
import gojava.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date; 
import java.util.List;

/**
 * Created by root on 04.11.15.
 */

@Controller
@SessionAttributes({"name", "lastname", "email", "password", "user", "cities"})
public class HomeController {

    @Autowired
    UserService userService;

    @Autowired
    CityService cityService;

    @Autowired
    ApartmentService apartmentService;

    @Autowired
    SearchService searchService;

    @Autowired
    BookingService bookingService;

    @RequestMapping(value = {"/", "home", "index"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getRegistrationPage() {
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView registerUser(@RequestParam("name") String name,
                                     @RequestParam("lastname") String lastname,
                                     @RequestParam("email") String email,
                                     @RequestParam("password") String password,
                                     @RequestParam("confirmPpass") String confirmPassword) {

        ModelAndView modelAndView = new ModelAndView();
        if(password.equals(confirmPassword)) {
            User user = new User(name, password, lastname, email);
            modelAndView.addObject("name", name);
            modelAndView.addObject("lastname", lastname);
            modelAndView.addObject("email", email);
            modelAndView.addObject("password", password);
            userService.registerUser(user);
            modelAndView.setViewName("/login");
        }
        return modelAndView;

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView loginUser(@RequestParam("email") String email,
                                  @RequestParam("password") String password,
                                  HttpSession session) {

        ModelAndView modelAndView = new ModelAndView();
        User user = userService.loginUser(email, password);
        session.setAttribute("user", user);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("/index");
        return modelAndView;
    }

    @RequestMapping(value = "/cities", method = RequestMethod.GET)
    public ModelAndView getAllCities() {
        List<City> cities = cityService.getAllCities();
        return new ModelAndView("/cities", "cities", cities);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUserPage() {
        return "/user";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search(@RequestParam("searchCity") String cityName) {

        ModelAndView modelAndView = new ModelAndView();
        City city = searchService.findCityByName(cityName);
        modelAndView.addObject("city", city);
        modelAndView.setViewName("/city");
        return modelAndView;
    }

    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public ModelAndView getCityInfo(@RequestParam("id") Integer id) {

        ModelAndView modelAndView = new ModelAndView();
        City city = cityService.getCityById(id);
        modelAndView.addObject("city", city);
        return modelAndView;
    }

    @RequestMapping(value = "/apartments", method = RequestMethod.GET)
    public ModelAndView getApartments(@RequestParam("cityId") Integer id) {

        ModelAndView modelAndView = new ModelAndView();
        City city = cityService.getCityById(id);
        List<Apartment> apartments = apartmentService.getApartmentsByCityName(city.getCityName());
        modelAndView.addObject("apartments", apartments);
        return modelAndView;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ModelAndView registerApartment(@RequestParam("apartmentType") String apartmentType,
                                          @RequestParam("cityName") String cityName,
                                          @RequestParam("begin") Date begin,
                                          @RequestParam("end") Date end,
                                          HttpSession httpSession) {

        ModelAndView modelAndView = new ModelAndView();
        User user = (User) httpSession.getAttribute("user");
        Apartment apartment = new Apartment(cityName, apartmentType, begin, end, user.getId());
        apartmentService.registerApartment(apartment);
        userService.becomeHost(user);
        modelAndView.addObject("apartment", apartment);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/apartment", method = RequestMethod.GET)
    public ModelAndView getApartment(@RequestParam("id") Integer id, HttpSession httpSession) {

        ModelAndView modelAndView = new ModelAndView();
        User user = (User) httpSession.getAttribute("user");
        Apartment apartment = apartmentService.getApartmentById(id);

        httpSession.setAttribute("apartment", apartment);

        modelAndView.addObject("apartment", apartment);
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value = "/apartment", method = RequestMethod.POST)
    public ModelAndView bookApartment(@RequestParam("beginBook") Date begin,
                                      @RequestParam("endBook") Date end,
                                      HttpSession httpSession) {

        ModelAndView modelAndView = new ModelAndView();
        Apartment apartment = (Apartment) httpSession.getAttribute("apartment");
        User host = userService.getUserById(apartment.getHostId());
        User client = (User) httpSession.getAttribute("user");
        bookingService.createBooking(host, client, apartment, begin, end);
        modelAndView.setViewName("index");
        return modelAndView;

    }

}
