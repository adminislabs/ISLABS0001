package threadProducerConsumer;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		SharedVariable sh = new SharedVariable();
		Producer p = new Producer(sh);
		Consumer c1 = new Consumer(sh, "c1");
		Consumer c2 = new Consumer(sh, "c2");
		p.start();
		c1.start();
		c2.start();
		try {
			p.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			c1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			c2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
