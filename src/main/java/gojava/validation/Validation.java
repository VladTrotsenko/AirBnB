package gojava.validation;

import gojava.model.Apartment;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by root on 04.11.15.
 */
public class Validation {

    public static boolean isValidName(String name) {

        if(name != null && !consistDigits(name)) {
            return true;
        }

        return false;
    }

    // TODO : Add InternetAdress class to validate email better
    public static boolean isValidEmail(String email) {

        if(email != null && email.contains("@gmail.com"))
            return true;

        else {
            return false;
        }
    }

    public static boolean isValidDate(LocalDate startDate, LocalDate endDate) {

        if (startDate.compareTo(endDate) > 0) {
            return false;
        }
        return true;
    }

    public static boolean isValidReservationDate(Apartment apartment, Date startDate, Date endDate) {

        if ((startDate.compareTo(apartment.getBegin()) < 0) ||
                (endDate.compareTo(apartment.getEnd()) > 0)) {
            return false;
        }
        return true;
    }

    // method to check whether some string consist Numbers or not
    private static boolean consistDigits(String str) {

        if(str.matches(".*\\d.*")){
            return true;
        } else{
            return false;
        }
    }
}