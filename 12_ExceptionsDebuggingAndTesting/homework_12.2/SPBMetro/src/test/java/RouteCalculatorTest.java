import core.Line;
import core.Station;
import junit.framework.TestCase;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.lang.reflect.Array;
import java.util.*;

public class RouteCalculatorTest extends TestCase {


    StationIndex stationIndex;
    RouteCalculator routeCalculator;

    @Override
    protected void setUp() throws Exception {

        Line line1 = new Line(1, "Красная");
        Line line2 = new Line(2, "Зеленая");
        Line line3 = new Line(3, "Фиолетовая");

        line1.addStation(new Station("Площадь Ленина", line1));
        line1.addStation(new Station("Чернышевская", line1));
        line1.addStation(new Station("Площадь восстания", line1));
        line1.addStation(new Station("Владимирская", line1));
        line1.addStation(new Station("Пушкинская", line1));
        line1.addStation(new Station("Технологический институт", line1));
        line1.addStation(new Station("Балтийская", line1));

        line2.addStation(new Station("Василеостровская", line2));
        line2.addStation(new Station("Гостиный двор", line2));
        line2.addStation(new Station("Маяковская", line2));
        line2.addStation(new Station("Площадь Александр Невского", line2));

        line3.addStation(new Station("Адмиралтейская", line3));
        line3.addStation(new Station("Садовая", line3));
        line3.addStation(new Station("Звенигородская", line3));
        line3.addStation(new Station("Обводный канал", line3));
        line3.addStation(new Station("Волковская", line3));

        stationIndex = new StationIndex();


        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);

        for (Station s : line1.getStations()) {
            stationIndex.addStation(s);
        }

        for (Station s : line2.getStations()) {
            stationIndex.addStation(s);
        }

        for (Station s : line3.getStations()) {
            stationIndex.addStation(s);
        }

        ArrayList<Station> connection1 = new ArrayList<>();
        connection1.add(stationIndex.getStation("Площадь восстания"));
        connection1.add(stationIndex.getStation("Маяковская"));

        ArrayList<Station> connection2 = new ArrayList<>();
        connection2.add(stationIndex.getStation("Пушкинская"));
        connection2.add(stationIndex.getStation("Звенигородская"));

        stationIndex.addConnection(connection1);
        stationIndex.addConnection(connection2);

        routeCalculator = new RouteCalculator(stationIndex);

    }

    public void testGetRouteOnTheLine() {
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.getStation("Чернышевская"),
                stationIndex.getStation("Балтийская"));
        List<Station> expected = Arrays.asList(stationIndex.getStation("Чернышевская"),
                stationIndex.getStation("Площадь восстания"),
                stationIndex.getStation("Владимирская"),
                stationIndex.getStation("Пушкинская"),
                stationIndex.getStation("Технологический институт"),
                stationIndex.getStation("Балтийская"));
        assertEquals(expected, actual);
    }

    public void testGetShortestRouteOne() {
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.getStation("Адмиралтейская"),
                stationIndex.getStation("Владимирская"));
        List<Station> expected = Arrays.asList(stationIndex.getStation("Адмиралтейская"),
                stationIndex.getStation("Садовая"),
                stationIndex.getStation("Звенигородская"),
                stationIndex.getStation("Пушкинская"),
                stationIndex.getStation("Владимирская"));
        assertEquals(expected, actual);
    }

    public void testGetShortestRouteTwo() {
        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.getStation("Обводный канал"), stationIndex.getStation("Василеостровская"));
        List<Station> expected = Arrays.asList(stationIndex.getStation("Обводный канал"),
                stationIndex.getStation("Звенигородская"),
                stationIndex.getStation("Пушкинская"),
                stationIndex.getStation("Владимирская"),
                stationIndex.getStation("Площадь восстания"),
                stationIndex.getStation("Маяковская"),
                stationIndex.getStation("Гостиный двор"),
                stationIndex.getStation("Василеостровская"));
        assertEquals(expected, actual);
    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(routeCalculator.getShortestRoute(stationIndex.getStation("Адмиралтейская"), stationIndex.getStation("Владимирская")));
        double expected = 11;
        assertEquals(expected, actual);
    }


    @Override
    protected void tearDown() throws Exception {

    }
}
