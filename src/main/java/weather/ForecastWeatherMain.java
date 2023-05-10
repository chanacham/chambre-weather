package weather;
import weather.dagger.DaggerForecastWeatherComponent;
import weather.dagger.ForecastWeatherComponent;
public class ForecastWeatherMain {
    public static void main(String[] args) {
        ForecastWeatherComponent component = DaggerForecastWeatherComponent
                .builder()
                .build();
        ForecastWeatherFrame frame = component.providesForecastWeatherFrame();
        frame.setVisible(true);
    }
}
