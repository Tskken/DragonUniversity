package Observer;

import Command.JoinClass;
import Strategy.Student;

public class StudentPortal implements Observer {
    private Student student;

    public StudentPortal(Student student) {
        this.student = student;
    }

    public void joinClass() {
        this.student.doAction(new JoinClass());
    }

    @Override
    public void update() {

    }
}
