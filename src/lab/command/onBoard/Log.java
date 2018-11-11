package lab.command.onBoard;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

/**
 * Lab 7
 * @author egs
 */
public class Log {
	
	public static void writeLog(String txt)
	{

		String destination = "Ex2Cars_log.txt";
		
		FileWriter writer = null;

		try{
			writer = new FileWriter(destination, true);
			writer.write(String.valueOf(new Timestamp(System.currentTimeMillis())));
		    writer.write(txt);
		    writer.write("\n");
		}
		
		catch(IOException ex){
			ex.printStackTrace();
		}
		
		finally{
		  if(writer != null){
			  try{
				  writer.close();
			  }
			  catch(IOException ex){
				  ex.printStackTrace();
			  }
		  }
		}
	}
}
