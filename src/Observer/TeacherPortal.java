package Observer;

import Strategy.Faculty;

import java.awt.desktop.OpenFilesHandler;
import java.util.ArrayList;

public class TeacherPortal implements Observable {
    private ArrayList<Observer> observers;
    private Faculty teacher;

    public TeacherPortal(Faculty teacher) {
        this.teacher = teacher;
    }

    public TeacherPortal() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer ob : this.observers) {
            ob.update();
        }
    }
}
