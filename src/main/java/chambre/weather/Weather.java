package chambre.weather;

public class Weather{
    private double id;
    private String main;
    private String description;
    private String icon;

    public double getId(){
        return id;
    }
    public void setId(int input){
        this.id = input;
    }
    public String getMain(){
        return main;
    }
    public void setMain(String input){
        this.main = input;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String input){
        this.description = input;
    }
    public String getIcon(){
        return icon;
    }
    public void setIcon(String input){
        this.icon = input;
    }
}
