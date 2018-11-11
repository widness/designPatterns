package lab.command.onBoard.commands;


import lab.command.onBoard.Log;
import lab.command.onBoard.receiver.SpeedControl;

/**
 * Lab 7
 * @author egs
 */
public class SpeedControlOffCommand implements Command {

	SpeedControl speedControl;
	
	public SpeedControlOffCommand(SpeedControl speedControl) {
		this.speedControl = speedControl;
	}

	public void execute() {
		speedControl.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
