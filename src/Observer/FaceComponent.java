/*
package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class FaceComponent implements Observer {
    private List<Observer> observers = new ArrayList<>();

    public FaceComponent() {}

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Object object) {
        System.out.println(object);
        for(Observer observer: observers) {
            observer.handleEvent(object);
        }
    }

}

*/
