package design_pattern.behavioral.observer;

public class App {
    public static void main(String[] args) {

        WeatherStation subject = new WeatherStation();

        WeatherObserver observer = new WeatherObserver(subject);

        subject.setPressure(5);
        subject.setTemperature(24);
        subject.setHumidity(9);
    }
}
