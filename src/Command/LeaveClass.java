package Command;

import Strategy.Class;
import Strategy.Person;

public class LeaveClass implements Command {
    @Override
    public void execute(Person person, Class cl) {
        person.removeClass(cl);
    }
}
