/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretresearch621;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class SecretResearch621 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("SecretResearch621.in"));
        int n = in.nextInt();
        String code; 
        for (int i = 0; i < n; i++) {
            code = in.next(); 
            if(code.equals("1") || code.equals("4") || code.equals("78")){
                System.out.println("+");
            }
            else if(code.contains("35")){
                System.out.println("-");
            }
            else if(code.contains("9") && code.contains("4")){
                System.out.println("*");
            }
            else if(code.contains("190")){ // not necessary 
                System.out.println("?");
            }
        }

    }
    
}
