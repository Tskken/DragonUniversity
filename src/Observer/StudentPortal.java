package Observer;

import Command.JoinClass;
import Momento.Registra;
import Strategy.Class;
import Strategy.Student;
import Strategy.Transcript;

public class StudentPortal implements Observer {
    private Student student;

    public StudentPortal(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void joinClass(Class cl) {
        this.student.doAction(new JoinClass(), cl);
    }

    @Override
    public void update(Registra registra) {
        Transcript transcript = registra.getStudentTranscript(student.getName());
        student.setTranscript(transcript);

        System.out.println(student.getName() + " currently updated to have this transcript: " + student.getTranscript().toString());
    }
}
