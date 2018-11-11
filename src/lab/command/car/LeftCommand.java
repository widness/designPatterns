package lab.command.car;

public class LeftCommand implements Command {
         Car leftCommand;

public LeftCommand(Car car) {
        this.leftCommand = car;
        }

@Override
public void execute() {
        this.leftCommand.left();
        }

@Override
public void undo() {
        this.leftCommand.right();
        }
        }
