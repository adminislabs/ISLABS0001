package conversions;

import java.util.ArrayList;

public class HexadecimalToBinary {

	public ArrayList hexadecimalbinary(ArrayList binary,int decimal){
		ArrayList temp=new ArrayList();
		while(decimal>0){
			temp.add(0,decimal%2);
			decimal=decimal/2;
		}
		int k=temp.size();
		if(k==2){
			temp.add(0,0);
			temp.add(0,0);
		}
		else if(k==3){
			temp.add(0,0);
		}
		binary.addAll(temp);
		return binary;
	}
	public ArrayList hexadecimaltoocatal(ArrayList binary){
		int k=binary.size();
		ArrayList octal=new ArrayList();
		//ArrayList temp1=new ArrayList();
		 if((k%3)==1){
			binary.add(0, 0);
			binary.add(0, 0);
			}
		else if((k%3)==2){
			binary.add(0, 0);
		}
		else{
		 for(int j=0;j<binary.size();j=j+3){
			int oc=4*(int)binary.get(j)+2*(int)binary.get(j+1)+1*(int)binary.get(j+2);
			 octal.add(oc);
			 
		 }}
		return octal;
	}
}
