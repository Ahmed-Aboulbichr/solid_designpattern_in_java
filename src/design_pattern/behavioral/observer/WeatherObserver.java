package design_pattern.behavioral.observer;

public class WeatherObserver implements Observer{

    private int preasure;
    private int temperature;
    private int humidity;
    private Subject subject;

    public WeatherObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(int preasure, int temperature, int humidity) {
        this.preasure = preasure;
        this.temperature = temperature;
        this.humidity = humidity;

        showData();
    }

    private void showData() {
        System.out.println("WeatherObserver{" +
                "preasure=" + preasure +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}');
    }

}
