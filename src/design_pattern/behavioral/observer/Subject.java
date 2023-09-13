package design_pattern.behavioral.observer;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAllObservers();
}
