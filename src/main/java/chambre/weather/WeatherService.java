package chambre.weather;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("/data/2.5/weather?appid=ad99288cc4c0b1d1b4679643ad72edc4&units=imperial")
    Observable<CurrentWeather> getCurrentWeather(@Query("q") String location);
}
