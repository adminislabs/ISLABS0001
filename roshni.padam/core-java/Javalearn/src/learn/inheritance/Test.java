package learn.inheritance;

public class Test {

	public static void main(String[] args) {
		ScientificCalculator sc= new ScientificCalculator();
		sc.sum(2,7,10,22,4,5,6);
		sc.multiply(8,67);

		System.out.println(sc.sum(2,7,10,22,4,5,6));
		System.out.println(sc.multiply(8,67));
		

	}

}
