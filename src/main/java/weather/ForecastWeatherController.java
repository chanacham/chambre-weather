package weather;

import io.reactivex.rxjava3.schedulers.Schedulers;

import javax.inject.Inject;

public class ForecastWeatherController {
    private ForecastWeatherView view;
    private WeatherService service;

    @Inject
    public ForecastWeatherController(
            ForecastWeatherView view,
            WeatherService service
    ){
        this.view = view;
        this.service = service;
    }
    public void updateWeather(String location) {
        service.getFiveDayForecast(location)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(view::setFiveDayForecast,
                        Throwable::printStackTrace);
    }
}
