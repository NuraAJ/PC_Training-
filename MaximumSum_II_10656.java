/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumsum_ii_10656;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class MaximumSum_II_10656 {

    /*  
    sub-sequence!!
    "In mathematics, a subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements."
    */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("MaximumSum_II_10656.in"));
        int N, num; 
        ArrayList<Integer> numbers = new ArrayList<>();
        N = in.nextInt(); 
        while(N!=0){
            numbers.clear();
            for (int i = 0; i < N; i++) {
              num = in.nextInt(); 
              in.nextLine();
              if(num>0){
                  System.out.print(num + " ");; 
              }
            }
            if(numbers.isEmpty()){
                System.out.print("0");
            }
            
            System.out.println("");
            N = in.nextInt();  
        }
    }
    
}
