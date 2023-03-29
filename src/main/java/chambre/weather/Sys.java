package chambre.weather;

public class Sys {
    private double type;
    private double id;
    private String country;
    private double sunrise;
    private double sunset;

    public double getType() {
        return type;
    }

    public void setType(int input) {
        this.type = input;
    }

    public double getId() {
        return id;
    }

    public void setId(int input) {
        this.id = input;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String input) {
        this.country = input;
    }

    public double getSunrise() {
        return sunrise;
    }

    public void setSunrise(int input) {
        this.sunrise = input;
    }

    public double getSunset() {
        return sunset;
    }

    public void setSunset(int input) {
        this.sunset = input;
    }
}
