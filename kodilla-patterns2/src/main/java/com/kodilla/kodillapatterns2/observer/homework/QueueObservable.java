package com.kodilla.kodillapatterns2.observer.homework;

public interface QueueObservable {
    void registerObserver(MentorObserver observer);
    void notifyObservers();
}
