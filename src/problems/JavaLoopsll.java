package problems;

import java.util.Locale;
import java.util.Scanner;

public class JavaLoopsll {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Nick White supported me to the logical for this problem - https://www.youtube.com/results?search_query=java+loops+ii+hackerrank+solution+ 
        
        int t = sc.nextInt();
        int a = 0, b = 0, n = 0;
                
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();       
        
            for (int j = 0; j < n; j++) {
                a += b;
                
                if (j > 0) {
                    System.out.print(" ");
                }
                
                System.out.print(a);
                b = b * 2;
            }
            
            System.out.println();
            
        }
        sc.close();
        
    }
        
    }
