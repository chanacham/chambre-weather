
package weather.current;

import weather.sharedclasses.Clouds;
import weather.sharedclasses.Coord;
import weather.sharedclasses.Weather;
import weather.sharedclasses.Wind;

import java.util.List;

public class CurrentWeather {

    private String mBase;
    private Clouds mClouds;
    private Long mCod;
    private Coord mCoord;
    private Long mDt;
    private Long mId;
    private Main main;
    private String mName;
    private Sys mSys;
    private Long mTimezone;
    private Long mVisibility;
    private List<Weather> mWeather;
    private Wind mWind;

    public Main getMain() {
        return main;
    }
}
