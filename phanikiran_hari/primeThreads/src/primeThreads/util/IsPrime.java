package primeThreads.util;

import primeThreads.util.Logger.DebugLevel;

/**
 * @author Hari
 *
 */
public class IsPrime {

	/**
	 * 
	 * @param integer to check if a prime or not
	 * @param 
	 * @return true or false;
	 */
	public boolean isPrimeNumber(int number) {
		return (number % 2 == 0 ? false : true);
	}
	
	public IsPrime(){
		Logger.writeMessage("IsPrime constructor is called",DebugLevel.CONSTRUCTOR);
	}
}
