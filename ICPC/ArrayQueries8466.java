/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayqueries8466;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class ArrayQueries8466 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new FileReader("ArrayQueries8466.in"));
        int T = cin.nextInt(); 
        int N, Q; 
        int L, R, X, type; 
        //ArrayList<Integer> numbers = new ArrayList<>(); 
        double[] numbers;
        for (int i = 0; i < T; i++) {
            N = cin.nextInt(); 
            Q = cin.nextInt(); 
            numbers = new double[N+1];
            for (int j = 1; j <= N; j++) {
                numbers[j] = cin.nextDouble();
            }
            //Quereies 
            for (int j = 0; j < Q; j++) {
                type = cin.nextInt(); 
                switch(type){
                    case 1: 
                        L = cin.nextInt(); 
                        R = cin.nextInt(); 
                        for (int k = L; k <= R; k++) {
                            numbers[k] = Math.floor(Math.sqrt(numbers[k]));
                        }
                        break; 
                    case 2: 
                        L = cin.nextInt(); 
                        R = cin.nextInt();
                        double sum = 0; 
                        for (int k = L; k <= R; k++) {
                            sum+= numbers[k];
                        }
                        System.out.println((int)sum);
                        break; 
                        
                    case 3: 
                        L = cin.nextInt(); 
                        R = cin.nextInt();
                        X = cin.nextInt();
                        for (int k = L; k <= R; k++) {
                            numbers[k] += X;
                        }
                        break; 
                }
            }
            //numbers.clear();
            
        }
    }
    
}
