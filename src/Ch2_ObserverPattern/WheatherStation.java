package Ch2_ObserverPattern;

import Ch2_ObserverPattern.observers.CurrentConditionsDisplay;
import Ch2_ObserverPattern.subjects.WeatherData;

public class WheatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        weatherData.registerObserver(currentConditionsDisplay);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
