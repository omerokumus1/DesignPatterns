package Ch2_ObserverPattern.subjects;

import Ch2_ObserverPattern.observers.Observer;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
