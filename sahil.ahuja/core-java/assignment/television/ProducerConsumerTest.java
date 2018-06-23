package television;

import java.util.Scanner;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("U R the producer");

		System.out.println("enter the length of array");
		int length = sc.nextInt();
		GenerateTv gt = new GenerateTv(length);
		System.out.println("Due to some problem The size of array is 5");
		Shared sh = new Shared(gt);
		Producer p = new Producer(sh);
		Consumer c = new Consumer(sh);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();

	}

}
