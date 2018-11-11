package lab.command.car;

public class RightCommand implements Command {
    Car rightCommand;

    public RightCommand(Car car) {
        this.rightCommand = car;
    }

    @Override
    public void execute() {
        this.rightCommand.right();
    }

    @Override
    public void undo() {
        this.rightCommand.left();
    }
}
