package weather;

import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.*;
import java.awt.*;



public class ForecastWeatherFrame extends JFrame {
    private final TextField location;
    private final ForecastWeatherView view;
    private ForecastWeatherController controller;
    private CurrentWeatherController currentWeatherController;

    @Inject
    public ForecastWeatherFrame(ForecastWeatherView view,
                                ForecastWeatherController controller,
                                CurrentWeatherController currentWeatherController,
                                @Named("imageLabel") JLabel imageLabel,
                                @Named("degreesLabel") JLabel degreesLabel) {
        this.view = view;
        this.controller = controller;
        this.currentWeatherController = currentWeatherController;

        setSize(800, 600);
        setTitle("Forecast Weather");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel northPanel = new JPanel(new BorderLayout());
        location = new TextField("New York");
        JButton submitButton = new JButton("Submit");
        northPanel.add(location, BorderLayout.CENTER);
        northPanel.add(submitButton, BorderLayout.EAST);
        northPanel.add(location, BorderLayout.CENTER);
        northPanel.add(submitButton, BorderLayout.EAST);

        JPanel currentWeatherPanel = new JPanel();
        currentWeatherPanel.add(imageLabel);
        currentWeatherPanel.add(degreesLabel);
        northPanel.add(currentWeatherPanel, BorderLayout.SOUTH);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(view, BorderLayout.CENTER);
        panel.add(northPanel, BorderLayout.NORTH);

        setContentPane(panel);

        submitButton.addActionListener(e -> {
            controller.updateWeather(location.getText());
            currentWeatherController.updateWeather(location.getText());
        });
        controller.updateWeather(location.getText());
        currentWeatherController.updateWeather(location.getText());

    }

}
