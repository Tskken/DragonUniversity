package Strategy;

import Command.Command;

public class Student extends Person {
    private String major = "";
    private int year = 0;
    private Transcript transcript;

    public Student(String name) {
        this.setName(name);
        this.transcript = new BasicTranscript();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void changeMajor(String newMajor){
        this.major = newMajor;
    }

    public void incYear() {
        this.year++;
    }

    public Transcript getTranscript() {
        return this.transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    @Override
    public void doAction(Command command, Class cl) {
        command.execute(this, cl);
    }

    @Override
    public void addClass(Class newClass) {
        this.transcript.addClass(newClass);
        newClass.incStudentCount();
    }

    @Override
    public void removeClass(Class removedClass) {
        this.transcript.removeClass(removedClass);
    }

    @Override
    public Class getClass(String cl) {
        return this.transcript.getAClass(cl);
    }

    @Override
    public double grade(Person person, Class cl) {
        return this.transcript.calculateGrade();
    }
}
