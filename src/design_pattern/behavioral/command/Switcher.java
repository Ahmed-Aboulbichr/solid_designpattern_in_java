package design_pattern.behavioral.command;


import java.util.ArrayList;
import java.util.List;

// invoker
public class Switcher {

    private List<Command> commands;

    public Switcher() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command){
        this.commands.add(command);
    }

    public void executeCommands(){
        commands.forEach(Command::execute);
    }
}
