package base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class InitializeLogging {
	
	public static Logger log = Logger.getLogger("Regression");
	
	//Static Block
	static {
		
		// PropertiesConfigurator is used to configure logger from properties file
		PropertyConfigurator.configure("./src\\report\\log4j.properties");

		// Log the message to file
		log.trace("Logging Initialized");
	}
}
