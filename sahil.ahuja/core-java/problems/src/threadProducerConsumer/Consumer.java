package threadProducerConsumer;

public class Consumer extends Thread {
	SharedVariable sh;
	String name;

	public Consumer(SharedVariable sh, String name) {
		this.sh = sh;
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			synchronized (sh) {
				int value = sh.getVariable();
				// System.out.println("name=" + name + "value=" + value);
				if (name == "c1") {
					int square = (value * value);
					int cube = (value * value * value);
					System.out.println("This is Customer " + name + " and printing square=" + square + " and cube="
							+ cube + " of number=" + value);
				} else {
					System.out.println("This is customer " + name + " and printing..");
					for (int k = value; k <= value + 9; k++) {
						System.out.print(k + " ");
					}
					System.out.print("\n");
				}
			}
		}
	}

}
