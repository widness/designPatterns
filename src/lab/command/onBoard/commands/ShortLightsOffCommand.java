package lab.command.onBoard.commands;


import lab.command.onBoard.Log;
import lab.command.onBoard.receiver.ShortLights;

/**
 * Lab 7
 * @author egs
 */
public class ShortLightsOffCommand implements Command {

	ShortLights shortLights;
	
	public ShortLightsOffCommand(ShortLights shortLights) {
		this.shortLights = shortLights;
	}

	public void execute() {
		shortLights.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
