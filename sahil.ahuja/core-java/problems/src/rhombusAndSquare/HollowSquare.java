package rhombusAndSquare;

public class HollowSquare {

	public static void main(String[] args) {
		int row;
		int star;
		for(row=1;row<=5;row++){
			if(row==1||row==5){
				for(star=1;star<=5;star++){
					System.out.printf("*");
				}
			}
			else{
				for(star=1;star<=5;star++){
					if((star==1)||(star==5)){
						System.out.printf("*");
					}
					else{
						System.out.printf(" ");
					}
				}
			}
		System.out.printf("\n");
		}
		

	}

}
