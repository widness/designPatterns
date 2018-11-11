package lab.command.onBoard.commands;


import lab.command.onBoard.Log;
import lab.command.onBoard.receiver.ShortLights;

/**
 * Lab 7
 * @author egs
 */
public class ShortLightsOnCommand implements Command {

	ShortLights shortLights;

	public ShortLightsOnCommand(ShortLights shortLights) {
		this.shortLights = shortLights;
	}

	public void execute() {
		shortLights.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
