package weather.dagger;

import dagger.Module;
import dagger.Provides;
import weather.WeatherService;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.swing.*;

@Module
public class OpenWeatherMapServiceModule {

    @Provides
    public WeatherService providesOpenWeatherMapService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        WeatherService service = retrofit.create(WeatherService.class);
        return service;
    }
    @Provides
    @Named("degreesLabel")
    @Singleton
    public JLabel providesDegreesLabel() {
        return new JLabel();
    }

    @Provides
    @Named("imageLabel")
    @Singleton
    public JLabel providesImageLabel() {
        return new JLabel();
    }

}
