/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newspaper11340;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author nouraahmed
 */
public class Newspaper11340 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new FileReader("Newspaper.in"));
        int value, M, K, N = input.nextInt();
        char character;
        float sum;
        String line;
        TreeMap<Character,Integer> prices = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            K = input.nextInt();
            sum = 0; 
            for (int j = 0; j < K; j++) {
                character = input.next().charAt(0);
                value = input.nextInt();
                prices.put(character, value);
               // System.out.println("Char: " + character + " Value: "+ value);
            }
            M = input.nextInt();//There is a problem in here
            input.nextLine();
           // System.out.println("M= " + M);
            //I'll read it line by line and accoumlate the values directly 
            for (int j = 0; j < M; j++) {
                line = input.nextLine();
                for (int k = 0; k < line.length(); k++) {
                    if (prices.containsKey(line.charAt(k))){
                        //System.out.println("Found a char: " + line.charAt(k) + " the value is: " + prices.get(line.charAt(k)));
                        sum+= prices.get(line.charAt(k)); 
                        //System.out.println("Sum = " + sum);
                    }
                    
                }
            }
            sum/=100;
            System.out.printf("%.2f$\n", sum);
            //Clear the tree 
            prices.clear();
        }
    }
    
}
