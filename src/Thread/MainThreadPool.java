/**
 * 
 */
package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author gopaljaiswal
 *
 */
public class MainThreadPool {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable woRunnable = new WokerService("" + i);
			executorService.execute(woRunnable);
		}

		executorService.shutdown();
		while (!executorService.isTerminated()) {

		}
		System.out.println("finished");
	}

}
