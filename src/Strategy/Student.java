package Strategy;

import Command.Command;

public class Student extends Person {
    private String major = "";
    private int year = 0;
    private BasicTranscript basicTranscript;

    public Student(String name) {
        this.setName(name);
        this.basicTranscript = new BasicTranscript();
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

    public BasicTranscript getBasicTranscript() {
        return this.basicTranscript;
    }

    @Override
    public void doAction(Command command, Class cl) {
        command.execute(this, cl);
    }

    @Override
    public void addClass(Class newClass) {
        this.basicTranscript.addClass(newClass);
        newClass.incStudentCount();
    }

    @Override
    public void removeClass(Class removedClass) {
        this.basicTranscript.removeClass(removedClass);
    }

    @Override
    public Class getClass(String cl) {
        return this.basicTranscript.getClass(cl);
    }

    @Override
    public double grade(Person person, Class cl) {
        return this.basicTranscript.calculateGrade();
    }
}
