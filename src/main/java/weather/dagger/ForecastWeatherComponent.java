package weather.dagger;

import dagger.Component;
import weather.ForecastWeatherFrame;

import javax.inject.Singleton;

@Singleton
@Component(modules = {OpenWeatherMapServiceModule.class})
public
interface ForecastWeatherComponent {

    ForecastWeatherFrame providesForecastWeatherFrame();

}

