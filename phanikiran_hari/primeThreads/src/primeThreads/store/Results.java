package primeThreads.store;

import java.util.Vector;

import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;


public class Results implements StdoutDisplayInterface {
	Vector<Integer> primeNumberVector = new Vector<Integer>(10, 2);
	int sum = 0;

	
	/*
	 * Void method which saves prime number to the data structure
	 */
	public void savePrimeNumber(Integer primeNumber) {
		Logger.writeMessage("Adding the integer " + primeNumber
				+ " to the data structure", DebugLevel.ENTRY);
		Logger.writeMessage(primeNumber + " ", DebugLevel.STORE);
		primeNumberVector.addElement(new Integer(primeNumber));
	}

	
	@Override
	/*
	 * (non-Javadoc)
	 *  writeSumToScreen() out puts the calculated sum to the screen
	 */
	public void writeSumToScreen() {
		sum = 0;
		for (Integer prime : primeNumberVector) {
			sum = sum + prime;
		}
		Logger.writeOutput("The sum of all the prime numbers is: " + sum);

	}
	/*
	 * Constructor for results
	 */
	public Results() {
		Logger.writeMessage("Results constructor is called",
				DebugLevel.CONSTRUCTOR);
	}
}
