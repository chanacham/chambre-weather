
package weather.forecastClasses;


public class FiveDayForecast {

    private City city;
    private Long cnt;
    private String cod;
    private java.util.List<List> list;
    private Long message;


    public java.util.List<List> getList() {
        return list;
    }
}
