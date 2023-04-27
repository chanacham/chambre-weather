
package weather.forecastClasses;

import weather.chambre.Clouds;
import weather.chambre.Weather;
import weather.chambre.Wind;

public class List {

    private Clouds mClouds;
    private Long mDt;
    private String mDtTxt;
    private Main main;
    private Long mPop;
    private Sys mSys;
    private Long mVisibility;
    private java.util.List<Weather> weather;
    private Wind mWind;

    public Main getMain() {
        return main;
    }

    public java.util.List<Weather> getWeather() {
        return weather;
    }
}
