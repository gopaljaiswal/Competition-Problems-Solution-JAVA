/**
 * 
 */
package Thread;

/**
 * @author gopaljaiswal
 *
 */
public class WokerService implements Runnable {

	private String cmd;

	public WokerService(String cmd) {
		super();
		this.cmd = cmd;
	}

	@Override
	public void run() {
		System.out.println("Start " + Thread.currentThread().getName()
				+ " start command : " + cmd);

		processCmd();

		System.out.println("End " + Thread.currentThread().getName()
				+ " end command");
	}

	public void processCmd() {

		try {
			Thread.sleep(100L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
