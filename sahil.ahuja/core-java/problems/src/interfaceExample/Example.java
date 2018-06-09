package interfaceExample;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		while(true){
			System.out.println("Enter ur choice");
			System.out.println("1.CDRom");
			System.out.println("2.DVD");
			System.out.println("3.WYnkApp");
			System.out.println("4.EXIT");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				CDRom cd=new CDRom();
				System.out.println("Press 1 to play CD");
				System.out.println("Press 2 to pause CD");
				int k=sc.nextInt();
				if(k==1){
					cd.play();
				}
				else{
					cd.pause();
				}
				break;
			case 2:
				DVD dvd=new DVD();
				System.out.println("Press 1 to play DVD");
				System.out.println("Press 2 to pause DVD");
				int l=sc.nextInt();
				if(l==1){
					dvd.play();
				}
				else{
					dvd.pause();
				}
				break;
			case 3:
				WynkApp wa=new WynkApp();
				System.out.println("Press 1 to play WynkApp");
				System.out.println("Press 2 to pause WynkApp");
				int m=sc.nextInt();
				if(m==1){
					wa.play();
				}
				else{
					wa.pause();
				}
				break;
			case 4:
				java.lang.System.exit(0);
			}
		}
	}

}
