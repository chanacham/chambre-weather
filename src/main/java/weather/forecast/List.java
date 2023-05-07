
package weather.forecast;

import weather.sharedclasses.Clouds;
import weather.sharedclasses.Weather;
import weather.sharedclasses.Wind;

public class List {

    private Clouds clouds;
    private Long dt;
    private String dt_txt;
    private Main main;
    private Long pop;
    private Sys sys;
    private Long visibility;
    private java.util.List<Weather> weather;
    private Wind wind;

    public Main getMain() {
        return main;
    }

    public java.util.List<Weather> getWeather() {
        return weather;
    }
}
