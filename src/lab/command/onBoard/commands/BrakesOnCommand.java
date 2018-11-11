package lab.command.onBoard.commands;

import lab.command.onBoard.Log;
import lab.command.onBoard.receiver.Brakes;

/**
 * Lab 7
 * @author egs
 */
public class BrakesOnCommand implements Command {

	Brakes brakes;

	public BrakesOnCommand(Brakes brakes) {
		this.brakes = brakes;
	}

	public void execute() {
		brakes.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
