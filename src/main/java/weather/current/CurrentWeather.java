
package weather.current;

import weather.sharedclasses.Clouds;
import weather.sharedclasses.Coord;
import weather.sharedclasses.Weather;
import weather.sharedclasses.Wind;

import java.util.List;

public class CurrentWeather {

    private String base;
    private Clouds clouds;
    private Long cod;
    private Coord coord;
    private Long dt;
    private Long id;
    private Main main;
    private String name;
    private Sys sys;
    private Long timezone;
    private Long visibility;
    private List<Weather> weather;
    private Wind wind;

    public Main getMain() {
        return main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Long getCod() {
        return cod;
    }

    public Coord getCoord() {
        return coord;
    }

    public Long getDt() {
        return dt;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Sys getSys() {
        return sys;
    }

    public Long getTimezone() {
        return timezone;
    }

    public Long getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return wind;
    }
}
