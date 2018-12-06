package Observer;

import Momento.Registra;
import Strategy.Faculty;

import java.awt.desktop.OpenFilesHandler;
import java.util.ArrayList;

public class TeacherPortal implements Observable {
    private ArrayList<Observer> observers;
    private Faculty teacher;
    private Registra registra;

    public TeacherPortal(Faculty teacher, Registra registra) {
        this.teacher = teacher;
        this.registra = registra;
        this.observers = new ArrayList<Observer>();
    }

    public Faculty getTeacher() {
        return teacher;
    }

    public void setTeacher(Faculty teacher) {
        this.teacher = teacher;
    }

    public Registra getRegistra() {
        return registra;
    }

    public void setRegistra(Registra registra) {
        this.registra = registra;
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
            ob.update(registra);
        }
    }
}
