package rhombusAndSquare;

public class FilledRhombus {

	public static void main(String[] args) {
		int row;
		int frontSpace;
		int star;
		int frontSpaceIncreamentor=0;
		for(row=1;row<=5;row++){
			for(frontSpace=0;frontSpace<frontSpaceIncreamentor;frontSpace++){
				System.out.printf(" ");
			}
			for(star=1;star<=5;star++){
				System.out.printf("*");
			}
			frontSpaceIncreamentor=frontSpaceIncreamentor+1;
			System.out.printf("\n");
		}

	}

}
