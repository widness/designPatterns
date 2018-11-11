package lab.command.onBoard.commands;

import lab.command.onBoard.Log;
import lab.command.onBoard.receiver.LeftIndicator;

/**
 * Lab 7
 * @author egs
 */
public class LeftIndicatorOffCommand implements Command {

	LeftIndicator leftIndicator;
	
	public LeftIndicatorOffCommand(LeftIndicator leftIndicator) {
		this.leftIndicator = leftIndicator;
	}

	public void execute() {
		leftIndicator.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
