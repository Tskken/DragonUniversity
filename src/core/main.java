package core;

import Strategy.Class;
import Strategy.Faculty;
import Strategy.Student;

public class main {
    public static void main(String[] args) {
        Faculty teacher1 = new Faculty("teacher1");
        Student student1 = new Student("student1");

        Class class1 = new Class("testclass1", teacher1, "tc-01-00");
        Class class2 = new Class("testclass2", teacher1, "tc-02-00");

        teacher1.addClass(class1);
        teacher1.addClass(class2);

        student1.addClass(class1);
        class1.incStudentCount();

        teacher1.grade(student1, class1);
    }
}