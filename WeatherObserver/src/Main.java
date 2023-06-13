import Models.ColorSignalDisplay;
import Models.ConcreteWeatherStation;
import Models.ScreenDisplay;

public class Main {
    public static void main(String[] args) {
        ConcreteWeatherStation weatherStation = new ConcreteWeatherStation();

        ScreenDisplay screenDisplay = new ScreenDisplay();
        ColorSignalDisplay colorSignalDisplay = new ColorSignalDisplay();

        weatherStation.addObserver(screenDisplay);
        weatherStation.addObserver(colorSignalDisplay);


        //Push---
        weatherStation.setMeasurements(22.5, 40.2);

        //Pull-Variante
        weatherStation.setMeasurements(16.2,75.8);

        weatherStation.removeObserver(screenDisplay);

        //PUSH--Variante (ohne Bildschirmanzeige)
        weatherStation.setMeasurements(20.9, 55.8);

    }
}
