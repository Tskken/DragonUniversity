package Command;

import Strategy.Class;
import Strategy.Person;

public interface Command {
    void execute(Person person, Class cl);
}
