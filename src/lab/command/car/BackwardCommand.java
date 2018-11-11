package lab.command.car;

public class BackwardCommand implements Command {
    Car backwardCommand;

    public BackwardCommand(Car car) {
        this.backwardCommand = car;
    }

    @Override
    public void execute() {
        this.backwardCommand.backward();
    }

    @Override
    public void undo() {
        this.backwardCommand.forward();
    }
}
