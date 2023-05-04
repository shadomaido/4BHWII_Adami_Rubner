public class Data {

    private double temperature;
    private int humidity;

    public Data(double temperature, int humidity){
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getData(){
        return "\nTemperature: " + this.temperature + "°" + "\nHumidity: " + this.humidity + "%\n";
    }

}
