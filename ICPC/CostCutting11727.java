/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costcutting11727;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class CostCutting11727 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("CostCutting11727.in"));
        int t = in.nextInt();
        int [] salaries = new int[3]; 
        int num1, num2, num3; 
        for (int i = 1; i <= t; i++) {
            salaries[0] = in.nextInt();
            salaries[1] = in.nextInt();
            salaries[2] = in.nextInt();
            Arrays.sort(salaries);
            System.out.println("Case " + i + ": " + salaries[1]);
        }
    }
    
}
