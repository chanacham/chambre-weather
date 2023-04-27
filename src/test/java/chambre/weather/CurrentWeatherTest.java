package chambre.weather;

import weather.WeatherService;
import weather.currentClasses.CurrentWeather;
import weather.forecastClasses.FiveDayForecast;
import org.junit.jupiter.api.Test;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static org.junit.jupiter.api.Assertions.*;

class CurrentWeatherTest {

    @Test
    public void getCurrentWeather() {
        //given
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        WeatherService service = retrofit.create(WeatherService.class);

        //when
        CurrentWeather weather = service.getCurrentWeather("New York").blockingFirst();

        //then
        assertNotNull(weather);
        assertNotNull(service.getCurrentWeather("New York"));
        assertNotNull(weather.getMain().getHumidity());
    }

    @Test
    public void getFiveDayForecast() {
        //given
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        WeatherService service = retrofit.create(WeatherService.class);

        //when
        FiveDayForecast fiveDayForecast = service.getFiveDayForecast("New York").blockingFirst();

        //then
        assertNotNull(fiveDayForecast);
        assertNotNull(service.getFiveDayForecast("New York"));
        assertNotNull(fiveDayForecast.getList().get(0).getMain().getTemp());
    }
}