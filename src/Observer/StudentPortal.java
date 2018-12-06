package Observer;

import Command.JoinClass;
import Momento.Registra;
import Strategy.BasicTranscript;
import Strategy.Class;
import Strategy.Student;
import Strategy.Transcript;

public class StudentPortal implements Observer {
    private Student student;

    public StudentPortal(Student student) {
        this.student = student;
    }

    public void joinClass(Class cl) {
        this.student.doAction(new JoinClass(), cl);
    }

    @Override
    public void update(Registra registra) {
        Transcript transcript = registra.getStudentTranscript(student.getName());
        student.setBasicTranscript(transcript);
    }
}
