package lab.command.onBoard.commands;

import lab.command.onBoard.Log;
import lab.command.onBoard.receiver.Clutch;

/**
 * Lab 7
 * @author egs
 */
public class ClutchOnCommand implements Command {

	Clutch clutch;

	public ClutchOnCommand(Clutch clutch) {
		this.clutch = clutch;
	}

	public void execute() {
		clutch.on();
		clutch.changeGear(2);
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
