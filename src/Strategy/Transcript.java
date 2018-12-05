package Strategy;

import java.util.ArrayList;

public class Transcript {
    private ArrayList<Class> classes;
    private double totalGrade = 0.0;

    public Transcript() {
        this.classes = new ArrayList<>();
    }

    public void addClass(Class newClass) {
        this.classes.add(newClass);
    }

    public void removeClass(Class removeClass) {
        this.classes.remove(removeClass);
    }

    
}
