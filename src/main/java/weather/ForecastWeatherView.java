package weather;

import weather.forecast.FiveDayForecast;
import weather.forecast.List;

import javax.swing.*;
import java.awt.*;

import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
public class ForecastWeatherView extends JComponent {
    @Inject
    public ForecastWeatherView() {
    }

    private FiveDayForecast fiveDayForecast;

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        int height = getHeight();
        g.translate(0, height);

        if(fiveDayForecast != null){
            java.util.List<List> forecastList = fiveDayForecast.getList();

            for (int i = 0; i < forecastList.size() -1 ; i++) {

                int temp = forecastList.get(i).getMain().getTemp().intValue();
                int nextTemp = forecastList.get(i + 1).getMain().getTemp().intValue();

                g.drawLine(i * 20, -temp * 5, (i + 1) * 20, -nextTemp * 5);
            }
        }
    }

    public void setFiveDayForecast(FiveDayForecast forecast) {
        this.fiveDayForecast = forecast;
        repaint();
    }
}
