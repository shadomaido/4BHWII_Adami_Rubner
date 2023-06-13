package Models;

public class ScreenDisplay implements  WeatherObserver{

    @Override
    public void update(double temperature, double humidity) {
        System.out.println("Bildschirmanzeige: ");
        System.out.println("Temperatur: " + temperature);
        System.out.println("Luftfeuchtigkeit: " + humidity);
        System.out.println();
    }


}
