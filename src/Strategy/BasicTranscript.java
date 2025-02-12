package Strategy;

import java.util.ArrayList;

public class BasicTranscript implements Transcript {
    private ArrayList<Class> classes;
    private double totalGrade = 0.0;

    public BasicTranscript() {
        this.classes = new ArrayList<>();
    }

    public void addClass(Class newClass) {
        this.classes.add(newClass);
    }

    public void removeClass(Class removeClass) {
        this.classes.remove(removeClass);
    }

    public Class getAClass(String name) {
        for (Class cl: this.classes) {
            if (cl.getName() == name) {
                return cl;
            }
        }

        return null;
    }

    @Override
    public double calculateGrade() {
        if (this.classes.size() == 0) {
            return this.totalGrade;
        }

        for (Class cl : this.classes) {
            this.totalGrade += cl.calculateGrade();
        }

        this.totalGrade /= classes.size();

        return this.totalGrade;
    }

    @Override
    public String toString() {
        return "BasicTranscript{" +
                "classes=" + classes +
                ", totalGrade=" + totalGrade +
                '}';
    }
}
