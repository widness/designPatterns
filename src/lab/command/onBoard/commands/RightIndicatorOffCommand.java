package lab.command.onBoard.commands;


import lab.command.onBoard.Log;
import lab.command.onBoard.receiver.RightIndicator;

/**
 * Lab 7
 * @author egs
 */
public class RightIndicatorOffCommand implements Command {

	RightIndicator rightIndicator;
	
	public RightIndicatorOffCommand(RightIndicator rightIndicator) {
		this.rightIndicator = rightIndicator;
	}

	public void execute() {
		rightIndicator.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
