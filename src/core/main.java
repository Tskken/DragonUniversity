package core;

import Command.JoinClass;
import Momento.Caretaker;
import Momento.Registra;
import Observer.StudentPortal;
import Observer.TeacherPortal;
import Strategy.*;
import Strategy.Class;

public class main {
    public static void main(String[] args) {
        Faculty teacher1 = new Faculty("teacher1");
        System.out.println("Teacher created: " + teacher1.getName());

        Student student1 = new Student("student1");
        System.out.println("Student crated: " + student1.getName());

        Caretaker caretaker = new Caretaker();
        System.out.println("Created momento caretaker...");
        Registra registra = new Registra();
        System.out.println("Created registra...");

        TeacherPortal teacherPortal = new TeacherPortal(teacher1, registra);
        StudentPortal studentPortal = new StudentPortal(student1);

        Class class1 = new Class("testclass1", teacher1, "tc-01-00");
        System.out.println("Create class 1: " + class1.getName());

        Class class2 = new Class("testclass2", teacher1, "tc-02-00");
        System.out.println("Create class 2: " + class2.getName());

        Exersize exersize1 = new Quiz("testquiz1");
        System.out.println("Create exsersize 1: " + exersize1.getName());

        Exersize exersize2 = new Test("testtest1");
        System.out.println("Create exsersize 2: " + exersize2.getName());

        Exersize exersize3 = new Homework("testhomework1");
        System.out.println("Create exsersize 3: " + exersize3.getName());


        class1.addExercise(exersize1);
        System.out.println("Added exersize1 to class 1: " + class1.getName() + " " + exersize1.getName());

        class1.addExercise(exersize3);
        System.out.println("Added exersize3 to class 1: " + class1.getName() + " " + exersize3.getName());

        class2.addExercise(exersize2);
        System.out.println("Added exersize2 to class 2: " + class2.getName() + " " + exersize2.getName());

        System.out.println("Exersizes for class 1: " + class1.getExersizes().toString());
        System.out.println("Exersizes for class 2: " + class2.getExersizes().toString());

        teacherPortal.addObserver(studentPortal);
        teacherPortal.getTeacher().doAction(new JoinClass(), class1);
        System.out.println("Teacher 1 takes owner ship of class 1: " + teacher1.getClass(class1.getName()).getName());

        teacherPortal.getTeacher().doAction(new JoinClass(), class2);
        System.out.println("Teacher 1 takes owner ship of class 2: " + teacher1.getClass(class2.getName()).getName());

        studentPortal.getStudent().doAction(new JoinClass(), class1);
        System.out.println("Student 1 joins class 1: " + student1.getClass(class1.getName()).getName());

        registra.addStudentTranscript(student1);

        teacherPortal.notifyObserver();

        caretaker.addMomento(registra.createMomento());
        System.out.println("Added current registra to caretaker to record...");

        System.out.println("Caretaker is holding: " + caretaker.toString());
    }
}