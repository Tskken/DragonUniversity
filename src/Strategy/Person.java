package Strategy;

import Command.Command;

import java.lang.reflect.Type;
import java.util.ArrayList;

public abstract class Person {
    private String name = "";
    private int age = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void doAction(Command command, Class cl);
    public abstract void addClass(Class newClass);
    public abstract void removeClass(Class removedClass);
    public abstract Class getClass(String cl);
    public abstract double grade(Person person, Class cl);
}
