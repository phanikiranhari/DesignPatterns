package primeThreads.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import primeThreads.util.Logger.DebugLevel;

/**
 * @author Hari
 *
 */

public class FileProcessor {
	
	private BufferedReader bufferReader;

	/**
	 * This method takes the required parameters viz. filename and buffer reader and
	 * returns the current line from the file.
	 * @param fileName
	 * @param bufferReader
	 * @return the current line from the file
	 */
	public synchronized String readLineFromFile() {
		String currentLine = null;
		try {
			currentLine = bufferReader.readLine();
		} catch (IOException e) {
			Logger.setDebugValue(DebugLevel.ERROR);
			Logger.writeMessage("Exception: Some exception has occured while reading the file", DebugLevel.ERROR);
			System.exit(0);
		}
		return currentLine;
	}
	
	
	public FileProcessor(String fileName){
		try {
			bufferReader = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			Logger.setDebugValue(DebugLevel.ERROR);
			Logger.writeMessage("Error File not found", DebugLevel.ERROR);
			System.exit(0);
		}
		Logger.writeMessage("FileProcessor constructor is called",DebugLevel.CONSTRUCTOR);
		
	}
}
