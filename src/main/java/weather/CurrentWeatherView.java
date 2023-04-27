package weather;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import weather.forecastClasses.FiveDayForecast;
import weather.forecastClasses.List;
import weather.forecastClasses.Main;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;


public class CurrentWeatherView extends JComponent {
    private FiveDayForecast fiveDayForecast;

//    public CurrentWeatherView(FiveDayForecast input) {
//        this.fiveDayForecast = input;
//    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        int height = getHeight();

        //translates the origin to lower left corner
        g.translate(0, height);

        java.util.List<List> forecastList = fiveDayForecast.getList();


        for (int i = 0; i < forecastList.size() - 1; i++) {

            int temp = forecastList.get(i).getMain().getTemp().intValue();
            int nextTemp = forecastList.get(i + 1).getMain().getTemp().intValue();

            g.drawLine(i * 20, -temp * 5, (i + 1) * 20, -nextTemp * 5);
        }
    }

    public void setFiveDayForecast(FiveDayForecast forecast) {
        this.fiveDayForecast = forecast;
        repaint();
    }
}
