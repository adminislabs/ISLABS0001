package threadProducerConsumer;

public class SharedVariable {
	boolean available = false;
	int item;
	GenerateFiboNumber gn = new GenerateFiboNumber();

	public synchronized void fillVariable(int value) {
		while (available == true) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		item = value;
		available = true;
		notifyAll();
	}

	public synchronized int getVariable() {
		while (available == false) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		available = false;
		notifyAll();
		return item;
	}

}
