package weather;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.junit.jupiter.api.Test;
import weather.current.CurrentWeather;
import weather.forecast.FiveDayForecast;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

        import io.reactivex.rxjava3.core.Observable;
        import io.reactivex.rxjava3.plugins.RxJavaPlugins;
        import io.reactivex.rxjava3.schedulers.Schedulers;
        import org.junit.jupiter.api.Test;
        import weather.forecast.FiveDayForecast;

import javax.swing.*;

import static org.mockito.Mockito.*;

class CurrentWeatherControllerTest {

    static {
        //This enables the service to return immediately.
        RxJavaPlugins.setIoSchedulerHandler(scheduler -> Schedulers.trampoline());
        RxJavaPlugins.setNewThreadSchedulerHandler(scheduler -> Schedulers.trampoline());
    }

    @Test
    void updateWeather()
    {
        //given
        WeatherService service = mock();
        JLabel imageLabel = mock();
        JLabel degreesLabel = mock();
        CurrentWeatherController controller = new CurrentWeatherController(service, imageLabel, degreesLabel);
        CurrentWeather currentWeather = mock();
        Observable<CurrentWeather> observable = Observable.just(currentWeather);
        doReturn(observable).when(service).getCurrentWeather("New York");

        //when
        controller.updateWeather("New York");

        //then
        verify(service).getCurrentWeather("New York");

    }


}