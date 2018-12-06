package Strategy;

public class Test implements Exersize {
    private String name;
    private double grade = 0.0;

    public Test(String name) {
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