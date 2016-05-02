package primeThreads.threadMgmt;

import primeThreads.store.Results;
import primeThreads.util.FileProcessor;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;


/**
 * @author Hari
 *
 */
public class CreateWorkers {
	private FileProcessor fileProcessor;
	private IsPrime isPrime;
	private Results results;
	private String inputFileName;

	public CreateWorkers(FileProcessor fp, IsPrime isPrime, Results results,
			String fileName) {
		Logger.writeMessage("CreateWorkers constructor is called",DebugLevel.CONSTRUCTOR);
		this.fileProcessor = fp;
		this.isPrime = isPrime;
		this.results = results;
		this.inputFileName = fileName;
	}

	
	/**
	 * @param noOfThreads
	 * return void
	 */
	public void startWorkers(int noOfThreads) {
		Thread[] threads = new Thread[5];
		for (int i = 0; i < noOfThreads; i++) {
			WorkerThread workerThread = new WorkerThread(fileProcessor, isPrime,
					results, inputFileName);
			threads[i] = new Thread(workerThread);
			threads[i].start();
		}
		for (int j = 0; j < noOfThreads; j++) {
			try {
				threads[j].join();
			} catch (InterruptedException e) {
				Logger.setDebugValue(DebugLevel.ERROR);
				Logger.writeMessage("Error while joining the threads", DebugLevel.ERROR);
				System.exit(0);
			}
		}

	}

	// this class has the method startWokers(...)

}