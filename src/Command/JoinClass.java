package Command;

import Strategy.*;
import Strategy.Class;

public class JoinClass implements Command {
    @Override
    public void execute(Person person, Class cl) {
        person.addClass(cl);
    }
}
