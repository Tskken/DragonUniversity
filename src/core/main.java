package core;

import Command.JoinClass;
import Momento.Caretaker;
import Momento.Registra;
import Momento.RegistraRecord;
import Strategy.*;
import Strategy.Class;

public class main {
    public static void main(String[] args) {
        Faculty teacher1 = new Faculty("teacher1");
        Student student1 = new Student("student1");
        Caretaker caretaker = new Caretaker();
        Registra registra = new Registra();

        Class class1 = new Class("testclass1", teacher1, "tc-01-00");
        Class class2 = new Class("testclass2", teacher1, "tc-02-00");

        Exersize exersize1 = new Quiz("testquiz1");
        Exersize exersize2 = new Test("testtest1");
        Exersize exersize3 = new Homework("testhomework1");

        class1.addExsersive(exersize1);
        class1.addExsersive(exersize3);

        class2.addExsersive(exersize2);

        teacher1.doAction(new JoinClass(), class1);
        teacher1.doAction(new JoinClass(), class2);

        student1.doAction(new JoinClass(), class1);

        teacher1.grade(student1, class1);

        caretaker.addMomento(registra.createMomento());
    }
}