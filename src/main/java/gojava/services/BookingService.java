package gojava.services;

import gojava.dao.ApartmentDAO;
import gojava.dao.ReservationDAO;
import gojava.dao.UserDAO;
import gojava.model.Apartment;
import gojava.model.Reservation;
import gojava.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by root on 18.12.15.
 */
@Component
public class BookingService {

    @Autowired
    UserDAO userDAO;

    @Autowired
    ApartmentDAO apartmentDAO;

    @Autowired
    ReservationDAO reservationDAO;

    public void createBooking(User host, User client, Apartment apartment,
                              Date begin, Date end) {

        Reservation reservation = new Reservation(host.getId(), client.getId(),
                apartment.getId(), begin, end);
        reservationDAO.create(reservation);
        apartmentDAO.updateIsAvailable(apartment, false);
        //TODO: implement logic email sender must send email to host that client wants to book apartment

    }
}
