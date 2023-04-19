
package weather.currentClasses;

import weather.Clouds;
import weather.Coord;
import weather.Weather;
import weather.Wind;

import java.util.List;

public class CurrentWeather {

    private String mBase;
    private Clouds mClouds;
    private Long mCod;
    private Coord mCoord;
    private Long mDt;
    private Long mId;
    private Main mMain;
    private String mName;
    private Sys mSys;
    private Long mTimezone;
    private Long mVisibility;
    private List<Weather> mWeather;
    private Wind mWind;
}
