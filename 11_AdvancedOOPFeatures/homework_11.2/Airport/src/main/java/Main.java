import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        findPlanesLeavingInTheNextTwoHours(airport).forEach(System.out::println);
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR, +2);
        Date dateTwoHourAdd = calendar.getTime();
        Date dateNow = new Date();

        return airport.getTerminals().stream()
                .flatMap(terminals -> terminals.getFlights().stream())
                .filter(flight -> flight.getDate().after(dateNow) && flight.getDate().before(dateTwoHourAdd))
                .filter(f -> f.getType() == Flight.Type.DEPARTURE)
                .collect(Collectors.toList());
    }
}