package primeThreads.threadMgmt;

import java.io.BufferedReader;

import primeThreads.store.Results;
import primeThreads.util.FileProcessor;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

/**
 * @author Hari
 *
 */
public class WorkerThread implements Runnable {

	private FileProcessor fileProcessor;
	private IsPrime isPrime;
	private Results results;
	private String inputFileName;
	BufferedReader bufferedReader;
	
	public WorkerThread(FileProcessor fp, IsPrime isPrime, Results results,String filename) {
		Logger.writeMessage("WorkerThread constructor is called",DebugLevel.CONSTRUCTOR);
		this.fileProcessor = fp;
		this.isPrime = isPrime;
		this.results = results;
		this.inputFileName = filename;
	}
	
	public WorkerThread() {

	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 * Run method for the threads
	 */
	public void run() {
		Logger.writeMessage("Run method for WorkerThread is called", DebugLevel.RUN);
		String currentLine = null;
		boolean isPrimeNumber = false;
			while ((currentLine = fileProcessor.readLineFromFile()) != null) {
				isPrimeNumber = isPrime.isPrimeNumber(Integer
						.parseInt(currentLine));
				if (isPrimeNumber)
					results.savePrimeNumber(Integer.parseInt(currentLine));
			}

	}

}