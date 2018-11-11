package lab.command.onBoard.commands;


import lab.command.onBoard.Log;
import lab.command.onBoard.receiver.LongLights;

/**
 * Lab 7
 * @author egs
 */
public class LongLightsOnCommand implements Command {

	LongLights longLights;

	public LongLightsOnCommand(LongLights longLights) {
		this.longLights = longLights;
	}

	public void execute() {
		longLights.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
