package rhombusAndSquare;

public class HollowRhombus {

	public static void main(String[] args) {
		int row;
		int frontSpace;
		int star;
		int forntSpaceIncreamentor=0;
		for(row=1;row<=5;row++){
			if((row==1)||(row==5)){
				for(frontSpace=0;frontSpace<forntSpaceIncreamentor;frontSpace++){
					System.out.printf(" ");
				}
				for(star=1;star<=5;star++){
					System.out.printf("*");
				}
			}
			else{
				for(frontSpace=0;frontSpace<forntSpaceIncreamentor;frontSpace++){
					System.out.printf(" ");
				}
				for(star=1;star<=5;star++){
					if((star==1)||(star==5)){
						System.out.printf("*");
					}
					else{
						System.out.printf(" ");
					}
				}
				
			}
			forntSpaceIncreamentor++;
			System.out.printf("\n");
		}

	}

}
