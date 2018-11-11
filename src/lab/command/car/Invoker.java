package lab.command.car;

public class Invoker {

    Command[] commands;

    int log;

    public Invoker() {
        commands = new Command[4];
        log = -1; // Unset
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pushKey(int slot) {
        this.setLog(slot);
        commands[slot].execute();
    }

    public void setLog(int slot) {
        log = slot;
    }

    public void undo() {
        if(log < 0 ) {
            System.out.println("Can't undo");
            return;
        }

        commands[log].undo();
    }
}
