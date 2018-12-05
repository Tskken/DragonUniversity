package Strategy;

import Command.Command;

public class Student extends Person {
    private String major = "";
    private int year = 0;
    private Transcript transcript;

    public Student() {
        this.transcript = new Transcript();
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

    @Override
    public void doAction(Command command) {
        command.execute(this);
    }

    @Override
    public void addClass(Class newClass) {
        this.transcript.addClass(newClass);
    }

    @Override
    public void removeClass(Class removedClass) {
        this.transcript.removeClass(removedClass);
    }
}
