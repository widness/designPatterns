package lab.command.onBoard.commands;


import lab.command.onBoard.Log;
import lab.command.onBoard.receiver.SpeedControl;

/**
 * Lab 7
 * @author egs
 */
public class SpeedControlOnCommand implements Command {

	SpeedControl speedControl;

	public SpeedControlOnCommand(SpeedControl speedControl) {
		this.speedControl = speedControl;
	}

	public void execute() {
		speedControl.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
