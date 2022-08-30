package problems;

import java.util.Scanner;

public class JavaOutputFormatting {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
	    int max = 3;
	    
	    String vectorStr[] = new String[max];
	    int vector[] = new int[max];
	    
	    for (int i = 0; i < max; i++){
	        vectorStr[i] = sc.next();
	        vector[i] = sc.nextInt();
	    }    
	    
	    System.out.println("================================");
	    for (int i = 0; i < max; i++){
	        System.out.printf("%-15s%03d%n", vectorStr[i], vector[i]);
	    }
	    System.out.println("================================");
	    
	    sc.close();
		
	}
}
