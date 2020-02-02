package gill_p1;

public class Encrypter {

public static int[] encrypt(int a[]){
		
		for(int i=0; i<a.length; i++) {	
			a[i]= a[i]+7;
		}
		
		for(int i=0; i<a.length; i++) {
			a[i]= a[i]%10;
		}
	int temp1=0;
	int temp2=0;
	int temp3=0;
	int temp4=0;
	
	temp1 =a[0];
	temp2 =a[1];
	temp3 =a[2];
	temp4 =a[3];
	
	a[0]=temp3;
	a[1]=temp4;
	a[2]=temp1;
	a[3]=temp2;
	
		return a;
	}
		
	}
	 

