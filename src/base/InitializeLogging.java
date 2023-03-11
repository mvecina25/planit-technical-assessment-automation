package base;

//import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class InitializeLogging {
	
	public static Logger log = LogManager.getLogger("Regression");
	
	//Static Block
	static {
		
		// PropertiesConfigurator is used to configure logger from properties file
		PropertyConfigurator.configure("./src\\report\\log4j.properties");

		// Log the message to file
		log.trace("Logging Initialized");
	}
}
