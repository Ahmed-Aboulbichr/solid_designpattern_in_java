package design_pattern.behavioral.command;

public class App {

    /***
     * 4 components : command, receiver, invoker and client
     *      command : knows about receiver and invokes a method of the receiver Values
     *                for parameters of the receiver method are stored in the command.
     *      Receiver: does the work itself
     *      Invoker : know how to execute a command, and optionally does bookkeeping about
     *                the command execution
     */

    public static void main(String[] args) {

        Switcher switcher = new Switcher();

        Light light = new Light();
        TurnOnCommand onCommand = new TurnOnCommand(light);
        TurnOffCommand offCommand = new TurnOffCommand(light);

        switcher.addCommand(onCommand);
        switcher.addCommand(offCommand);

        switcher.executeCommands();
    }
}
