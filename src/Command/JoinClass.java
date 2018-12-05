package Command;

import Strategy.*;
import Strategy.Class;

public class JoinClass implements Command {
    @Override
    public void execute(Person person) {
        Class newClass = new Class("test Class", new Faculty(), "tc-01-00");

    }
}
