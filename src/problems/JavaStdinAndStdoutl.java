package problems;

import java.util.Scanner;

public class JavaStdinAndStdoutl {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        
        sc.close();
        
        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);
		
	}
}
