/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diapers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class Diapers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("diapers.in"));
        int T = in.nextInt(); 
        int B, D;
        for (int i = 1; i <= T; i++) {
            B = in.nextInt();
            D = in.nextInt(); 
            System.out.println(i + ". " + B/D);
        }
    }
    
}
