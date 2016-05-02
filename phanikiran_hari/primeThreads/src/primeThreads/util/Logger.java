package primeThreads.util;

/**
 * @author Hari
 *
 */
public class Logger {

	public static enum DebugLevel {
		FINAL, STORE, ENTRY, RUN, CONSTRUCTOR, ERROR
	};

	private static DebugLevel debugLevel;

	/**
	 * @param integer which denotes the debug level
	 * @return void set the desired debug value
	 */
	public static void setDebugValue(int levelIn) {
		switch (levelIn) {
			case 0 :
				debugLevel = DebugLevel.FINAL;
				break;
			case 1 :
				debugLevel = DebugLevel.STORE;
				break;
			case 2 :
				debugLevel = DebugLevel.ENTRY;
				break;
			case 3 :
				debugLevel = DebugLevel.RUN;
				break;
			case 4 :
				debugLevel = DebugLevel.CONSTRUCTOR;
				break;
			case 5 :
				debugLevel = DebugLevel.ERROR;
				break;
		}
	}
/*
 * @return none;
 */
	public static void setDebugValue(DebugLevel levelIn) {
		debugLevel = levelIn;
	}

	// @return None
	public static void writeMessage(String message, DebugLevel levelIn) {
		if (levelIn == debugLevel)
			System.out.println(message);
	}

	public String toString() {
		return "Debug Level is " + debugLevel;
	}
	
	/*
	 * return none;
	 */
	public static void writeOutput(String message) {
			Logger.writeMessage(message, DebugLevel.FINAL);
	}
}
