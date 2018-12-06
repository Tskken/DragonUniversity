package Strategy;

public class Quiz implements Exersize {
    private String name;
    private double grade = 0.0;

    public Quiz(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "name='" + name + '\'' +
                '}';
    }
}
