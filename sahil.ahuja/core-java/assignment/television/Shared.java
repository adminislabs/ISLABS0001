package television;

import java.util.Scanner;

public class Shared {

	GenerateTv gt;
    
	Shared(GenerateTv gt) {
		this.gt = gt;
	}

	public void produce() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (gt.top == gt.length - 1) {
					wait();
				} else {
					gt.top++;
					System.out.println("Enter the modelnumber and inches of tv u want to produce on index number"+gt.top);
					Scanner sc = new Scanner(System.in);
					String modelnumber = sc.next();
					int inches = sc.nextInt();
					Tv tv = new Tv();
					tv.setModelnumber(modelnumber);
					tv.setInches(inches);
					
					gt.arr[gt.top] = tv;

					notify();
					Thread.sleep(1000);

				}
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				if (gt.top == -1) {
					wait();
				} else {
					Tv tv = gt.arr[gt.top];
					System.out.println("Consumer consumed tv of modelnumber " + tv.getModelnumber() + " and of inches "
							+ tv.getInches()+" from index number "+ gt.top);
					gt.top--;
					notify();
					Thread.sleep(1000);
				}
			}

		}
	}
}
