package Command;

import Strategy.Person;

public interface Command {
    void execute(Person person);
}
