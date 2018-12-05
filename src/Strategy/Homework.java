package Strategy;

public class Homework implements Exersize {
    private String name;
    private double grade = 0.0;

    public Homework(String name) {
        this.name = name;
    }

    @Override
    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double getGrade() {
        return this.grade;
    }
}
