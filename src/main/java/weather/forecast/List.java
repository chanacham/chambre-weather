
package weather.forecast;

import weather.sharedclasses.Clouds;
import weather.sharedclasses.Weather;
import weather.sharedclasses.Wind;

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
