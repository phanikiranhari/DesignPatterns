package primeThreads.driver;
import primeThreads.store.Results;
import primeThreads.threadMgmt.CreateWorkers;
import primeThreads.util.FileProcessor;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;


/**
 * @author Hari
 * Main method of Driver class
 * Validation of command line arguments is done here
 * And also the validity of each argument is checked
 */
public class Driver {
	public static void main(String args[]) {
		int debugValue = 0;
		int noOfThreads = 0;
		String inputFileName = "";
		boolean isThreadCountCorrect = false;
		boolean isDebugCountCorrect = false;
	if (args != null && args.length == 3) {
			try {
				inputFileName = args[0];
				noOfThreads = Integer.parseInt(args[1]);
				debugValue = Integer.parseInt(args[2]);
				if (noOfThreads > 0 && noOfThreads < 6) {
					isThreadCountCorrect = true;
				}
				if (debugValue >= 0 && debugValue < 5) {
					isDebugCountCorrect = true;
				}
			} catch (NumberFormatException e) {
				Logger.setDebugValue(DebugLevel.ERROR);
				Logger.writeMessage("Debug value and num of threads should be integers", DebugLevel.ERROR);
				System.exit(0);
			}
			if (!isThreadCountCorrect) {
				Logger.setDebugValue(DebugLevel.ERROR);
				Logger.writeMessage("Error : No of threads should be between 1 and 5 inclusive", DebugLevel.ERROR);
				System.exit(0);
			} else if (!isDebugCountCorrect) {
				Logger.setDebugValue(DebugLevel.ERROR);
				Logger.writeMessage("Error : Debug value should be between 0 and 4 inclusive", DebugLevel.ERROR);
				System.exit(0);
			} else {
				Logger.setDebugValue(debugValue);
				FileProcessor fp = new FileProcessor(inputFileName);
				IsPrime isPrime = new IsPrime();
				Results results = new Results();
				CreateWorkers createWorkers = new CreateWorkers(fp, isPrime,
						results, inputFileName);
				createWorkers.startWorkers(noOfThreads);
				results.writeSumToScreen();
			}
		}else{
			Logger.setDebugValue(DebugLevel.ERROR);
			Logger.writeMessage("Please give exactly 3 arguments from the command line", DebugLevel.ERROR);
			System.exit(0);
		}
	} // end main(...)

} // end public class Driver

