package Strategy;

import java.util.ArrayList;

public class Class {
    private String name;
    private int studentCount = 0;
    private Faculty teacher;
    private String classIdentifier;
    private ArrayList<Exersize> exersizes;

    public Class(String name, Faculty teacher, String classIdentifier) {
        this.name = name;
        this.teacher = teacher;
        this.classIdentifier = classIdentifier;
        this.exersizes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public Faculty getTeacher() {
        return teacher;
    }

    public void setTeacher(Faculty teacher) {
        this.teacher = teacher;
    }

    public String getClassIdentifier() {
        return classIdentifier;
    }

    public void setClassIdentifier(String classIdentifier) {
        this.classIdentifier = classIdentifier;
    }

    public ArrayList<Exersize> getExersizes() {
        return exersizes;
    }

    public void setExersizes(ArrayList<Exersize> exersizes) {
        this.exersizes = exersizes;
    }

    public void incStudentCount() {
        this.studentCount++;
    }

    public double calculateGrade() {
        double grade = 0.0;

        if (this.exersizes.size() == 0) {
            return 0.0;
        }

        for (Exersize exersize : exersizes) {
            grade += exersize.getGrade();
        }

        grade /= this.exersizes.size();

        return grade;
    }
}
