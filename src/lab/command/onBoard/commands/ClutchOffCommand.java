package lab.command.onBoard.commands;

import lab.command.onBoard.Log;
import lab.command.onBoard.receiver.Clutch;

/**
 * Lab 7
 * @author egs
 */
public class ClutchOffCommand implements Command {

	Clutch clutch;
	
	public ClutchOffCommand(Clutch clutch) {
		this.clutch = clutch;
	}

	public void execute() {
		clutch.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
