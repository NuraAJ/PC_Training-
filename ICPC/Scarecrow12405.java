/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scarecrow12405;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class Scarecrow12405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("Scarecrow12405.in"));
        int T = in.nextInt();
        int N, Scarecrow;
        String field; 
        char[] fieldChars; 
        for (int i = 1; i <= T; i++) {
            Scarecrow = 0; 
            N = in.nextInt();
            in.nextLine(); 
            field = in.nextLine(); 
            fieldChars = field.toCharArray();
            for (int j = 0; j < N; j++) {
                if(fieldChars[j] == '.'){
                   
                    fieldChars[j] = '#';
                    if(j+1 < N) fieldChars[j+1] = '#';
                    if(j+2 < N) fieldChars[j+2] = '#';
                    Scarecrow++;
                }
            }
            System.out.println("Case "+ i+ ": " + Scarecrow);
            
        }
    }
    
}
