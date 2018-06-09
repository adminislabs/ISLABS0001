package threadProducerConsumer;

public class Producer extends Thread {
	int j = 0;
	SharedVariable sh;
	GenerateFiboNumber gn = new GenerateFiboNumber();

	public Producer(SharedVariable sh) {
		this.sh = sh;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			int value = gn.generate(j);
			synchronized (sh) {
				sh.fillVariable(value);
				j++;
				System.out.println("Item produced is" + value);
			}
		}
	}

}
