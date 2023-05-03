package weather;

import io.reactivex.rxjava3.schedulers.Schedulers;

public class ForecastWeatherController {
    private CurrentWeatherView view;
    private WeatherService service;

    public ForecastWeatherController(
            CurrentWeatherView view,
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
