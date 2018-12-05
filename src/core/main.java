package core;

import Command.JoinClass;
import Momento.Caretaker;
import Momento.RegistraRecord;
import Strategy.Class;
import Strategy.Faculty;
import Strategy.Student;

public class main {
    public static void main(String[] args) {
        Faculty teacher1 = new Faculty("teacher1");
        Student student1 = new Student("student1");
        Caretaker caretaker = new Caretaker();

        Class class1 = new Class("testclass1", teacher1, "tc-01-00");
        Class class2 = new Class("testclass2", teacher1, "tc-02-00");

        teacher1.doAction(new JoinClass(), class1);
        teacher1.doAction(new JoinClass(), class2);

        student1.doAction(new JoinClass(), class1);

        teacher1.grade(student1, class1);


    }
}