/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jillridesagain507;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class JillRidesAgain507 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    /*
    we will be using Jay Kadane’s O(n) algorithm 
    
    */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
                Scanner in = new Scanner(new FileReader("JillRidesAgain507.in"));
                int b = in.nextInt();
                int s, n, sum, CurrentMax; 
                int start =0, finalStart=0, finalEnd=0;
                for (int j = 1; j <= b; j++) {
                    s = in.nextInt();
                    start =0; 
                    finalStart=0; 
                    finalEnd=0;
                    sum=0;
                    CurrentMax = 0; 
                    for (int i = 1; i < s; i++) {
                        n = in.nextInt();
                        sum += n; 
                        if(sum < 0) {
                            start = i;
                            sum = 0;
                        }
                        if(sum > CurrentMax || (sum == CurrentMax && i - start > finalEnd - finalStart) ){
                            CurrentMax = sum; //ans = max(ans, sum);
                            finalEnd = i; 
                            finalStart = start;
                        }
                        
                    }
                    if(CurrentMax > 0) System.out.printf("The nicest part of route %d is between stops %d and %d\n", j, finalStart + 1, finalEnd + 1);
                    else System.out.printf("Route %d has no nice parts\n");
            
                }
                
    }
                

    
    
}
