
public class HollowMirroredSquare
{
	
		public static void main(String[] args) {
			int row;
			int loop;
			for(row=1;row<=5;row++){
				if(row==1||row==5){
					for(loop=1;loop<=5;loop++){
						System.out.printf("*");
					}
				}
				else{
					for(loop=1;loop<=5;loop++){
						if((loop==1)||(loop==5)){
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
