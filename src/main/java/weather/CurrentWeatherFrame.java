package weather;

import io.reactivex.rxjava3.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import weather.forecastClasses.FiveDayForecast;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.SystemColor.text;

public class CurrentWeatherFrame extends JFrame {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build();
    WeatherService service = retrofit.create(WeatherService.class);
    private String location = "New York";
    FiveDayForecast fiveDayForecast = service.getFiveDayForecast(location).blockingFirst();

    public CurrentWeatherFrame() {
        setSize(800, 600);
        setTitle("Current Weather");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        CurrentWeatherView view = new CurrentWeatherView();
        view.setFiveDayForecast(fiveDayForecast);
        panel.add(view);

        JPanel cityPanel = new JPanel();
        cityPanel.setLayout(new GridLayout(1, 2));

        TextField cityInput = new TextField(1);
        cityInput.setSize(new Dimension(100, 100));
        cityPanel.add(cityInput, 0);

        Button button = new Button("Submit");
        button.setSize(new Dimension(10, 10));
        button.addActionListener(e -> {
            button.requestFocus();
            setLocation(cityInput.getText());

            updateWeather(view);
        });
        cityPanel.add(button, 1);

        panel.add(cityPanel, BorderLayout.NORTH);
        setContentPane(panel);
    }

    public void updateWeather(CurrentWeatherView view) {
        service.getFiveDayForecast(location)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(view::setFiveDayForecast,
                        Throwable::printStackTrace);
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
