package gill_p1;
import java.lang.Math;

public class Decrypter {
	public static int[] decrypt(int a[]){
		for(int i=0; i<a.length; i++) {
			a[i]= a[i]-7;
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
		
		for(int i=0; i<a.length; i++) {	
			a[i]= Math.floorMod(a[i], 10);
		}
		return a;
	}
}


