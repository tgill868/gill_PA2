package gill_p1;

import java.util.Scanner;
import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Press 1 for Encryption Technology or 2 for Decrytpion Technology: ");
	
	int choice = input.nextInt();
	

	if (choice==1) {
		int[] a = new int[4];
		System.out.println("Encryption Selected Enter Each Digit Seperately: ");
		
		for(int i=0; i<4; i++) {
		a[i]= input.nextInt();
		}
	      Encrypter.encrypt(a);
	    
	    for(int i=0; i<4; i++) {
	    	System.out.println(a[i]);
	    }
	    }
	if(choice==2) {
		int[] a = new int[4];
		System.out.println("Decryption Selected Enter Each Digit Seperately: ");
		
		for(int i=0; i<4; i++) {
			a[i]= input.nextInt();
			}
		      Decrypter.decrypt(a);
		    
		    for(int i=0; i<4; i++) {
		    	System.out.println(a[i]);
		    }
		    }

}
}

