/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automaticanswer11547;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class AutomaticAnswer11547 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("AutomaticAnswer11547.in"));
        int t = in.nextInt(); 
        int num; 
        for (int i = 0; i < t; i++) {
            num = in.nextInt(); 
            num *= 567;
            num /= 9;
            num += 7492;
            num *= 235;
            num /= 47;
            num -= 498;
            num /= 10; 
            
            System.out.println(Math.abs(num % 10));
        }
    }
    
}
