package Strategy;

import Command.Command;

import java.util.ArrayList;

public class Faculty extends Person {
    private String department = "";
    private int employmentYears = 0;
    private ArrayList<Class> classes;

    public Faculty(String name) {
        this.setName(name);
        this.classes = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmploymentYears() {
        return employmentYears;
    }

    public void setEmploymentYears(int employmentYears) {
        this.employmentYears = employmentYears;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    @Override
    public void doAction(Command command, Class cl) {
        command.execute(this, cl);
    }

    @Override
    public void addClass(Class newClass) {
        this.classes.add(newClass);
    }

    @Override
    public void removeClass(Class removedClass) {
        this.classes.remove(removedClass);
    }

    @Override
    public Class getClass(String cl) {
        for (Class cla : classes) {
            if (cla.getName().equals(cl)) {
                return cla;
            }
        }
        return null;
    }

    @Override
    public double grade(Person person, Class cl) {
        return 0;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "department='" + department + '\'' +
                '}';
    }
}
