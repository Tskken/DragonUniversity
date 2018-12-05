package Observer;

import java.awt.desktop.OpenFilesHandler;
import java.util.ArrayList;

public class TeacherPortal implements Observable {
    private ArrayList<Observer> observers;

    public TeacherPortal() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }
}
