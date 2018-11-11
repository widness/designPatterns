package lab.command.car;

public class ForwardCommand implements Command {
    Car forwardCommand;

    public ForwardCommand(Car car) {
        this.forwardCommand = car;
    }

    @Override
    public void execute() {
        this.forwardCommand.forward();
    }

    @Override
    public void undo() {
        this.forwardCommand.backward();
    }
}
