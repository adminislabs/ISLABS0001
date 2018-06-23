package television;

public class Producer extends Thread {

	Shared sh;

	public Producer(Shared sh) {

		this.sh = sh;
	}

	public void run() {
		try {
			sh.produce();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
