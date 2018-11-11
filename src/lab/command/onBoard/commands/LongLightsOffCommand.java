package lab.command.onBoard.commands;


import lab.command.onBoard.Log;
import lab.command.onBoard.receiver.LongLights;

/**
 * Lab 7
 * @author egs
 */
public class LongLightsOffCommand implements Command {

	LongLights longLights;
	
	public LongLightsOffCommand(LongLights longLights) {
		this.longLights = longLights;
	}

	public void execute() {
		longLights.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
