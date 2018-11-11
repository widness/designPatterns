package lab.command.onBoard.invoker;


import lab.command.onBoard.commands.Command;
import lab.command.onBoard.commands.NoCommand;

/**
 * Lab 7
 * This is the invoker
 * @author egs
 */
public class OnBoardSystem {

	Command[] onCommands;
	Command[] offCommands;
 
	public OnBoardSystem() {
		onCommands = new Command[7];
		offCommands = new Command[7];
 
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
  
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		onCommands[slot].store();
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		offCommands[slot].store();
	}
  
    @Override
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ On-Board System -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
