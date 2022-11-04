package org.glaz.observer.subject;

import org.glaz.observer.observers.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
