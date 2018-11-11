package lab.command.onBoard.commands;


import lab.command.onBoard.Log;
import lab.command.onBoard.receiver.RightIndicator;

/**
 * Lab 7
 * @author egs
 */
public class RightIndicatorOnCommand implements Command {

	RightIndicator rightIndicator;

	public RightIndicatorOnCommand(RightIndicator rightIndicator) {
		this.rightIndicator = rightIndicator;
	}

	public void execute() {
		rightIndicator.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
