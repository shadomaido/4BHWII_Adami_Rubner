package Models;

public class ColorSignalDisplay implements WeatherObserver{

    @Override
    public void update(double temperature, double humidity) {
        String color = determineColor(temperature, humidity);
        System.out.println("Farbsignalanzeige: " + color);
    }

    private String determineColor(double temperature, double humidity){
        if(temperature > 25 && humidity <50){
            return "ROT";
        } else if (temperature < 10 && humidity > 70){
            return "BLAU";
        } else{
            return  "GRÜN";
        }
    }
}
