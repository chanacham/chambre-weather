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
    private JButton submit = new JButton("Submit");
    private TextField location = new TextField("New York");
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build();
    WeatherService service = retrofit.create(WeatherService.class);
    private CurrentWeatherView view = new CurrentWeatherView();

    ForecastWeatherController controller;
    public CurrentWeatherFrame() {
        setSize(800, 600);
        setTitle("Current Weather");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        setContentPane(panel);
        panel.add(view,BorderLayout.CENTER);

        JPanel cityPanel = new JPanel();
        cityPanel.setLayout(new GridLayout(1, 2));

        cityPanel.add(location, BorderLayout.CENTER);
        cityPanel.add(submit, BorderLayout.EAST);
        panel.add(cityPanel, BorderLayout.NORTH);

        controller = new ForecastWeatherController(view,service);

        controller.updateWeather("New York");

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateWeather(location.getText());
            }
        });

    }

}
