package television;

public class Consumer extends Thread {
	Shared sh;

	Consumer(Shared sh) {
		this.sh = sh;
	}

	public void run() {
		try {
			sh.consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
