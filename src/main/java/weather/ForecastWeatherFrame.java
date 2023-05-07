package weather;

import javax.inject.Inject;
import javax.swing.*;
import java.awt.*;



public class ForecastWeatherFrame extends JFrame {
    private final TextField location = new TextField("New York");
    private final ForecastWeatherView view;
    private ForecastWeatherController controller;
    @Inject
    public ForecastWeatherFrame(ForecastWeatherView view , ForecastWeatherController controller) {
        this.view = view;
        this.controller = controller;

        setSize(800, 600);
        setTitle("Forecast Weather");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        setContentPane(panel);
        panel.add(view,BorderLayout.CENTER);

        JPanel cityPanel = new JPanel();
        cityPanel.setLayout(new GridLayout(1, 2));

        cityPanel.add(location, BorderLayout.CENTER);
        JButton submit = new JButton("Submit");
        cityPanel.add(submit, BorderLayout.EAST);
        panel.add(cityPanel, BorderLayout.NORTH);

        submit.addActionListener(e -> controller.updateWeather(location.getText()));
        controller.updateWeather(location.getText());

    }

}
