/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luggage10664;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class Luggage10664 {

    /**
     * This problem can be modeled as a knapsack problem 
     */

    public static int knapsack(int[] A, int weights){
        int w; 
        int[][] knapSackWeights = new int[A.length+1][weights+1];
        
        for (int i = 0; i <= A.length; i++) {
            for (int j = 0; j <= weights; j++) {
                if(i == 0 || j == 0) knapSackWeights[i][j] =0;
                else if(A[i-1] <= j) knapSackWeights[i][j] = Math.max(A[i-1] + knapSackWeights[i-1][j - A[i-1]], knapSackWeights[i-1][j]);
                else knapSackWeights[i][j] = knapSackWeights[i-1][j];
            }
        }
        return knapSackWeights[A.length][weights];
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("Luggage10664.in"));
        int sumWeights, w, m = in.nextInt();
        in.nextLine();
        String line;
        int [] Weights;
        
        for (int u = 0; u < m; u++) {
            line = in.nextLine(); 
            sumWeights =0;
            String[] W=line.split("\\s");
            Weights = new int[W.length]; 
            for(int j = 0 ; j < W.length ; j ++){
                w = Integer.parseInt(W[j]);
                Weights[j] = w;
                sumWeights+=w;
            }
            if(sumWeights % 2 != 0) System.out.println("NO");
            
            else{
                sumWeights/=2;
                if(knapsack(Weights, sumWeights) == sumWeights) System.out.println("YES");
                else System.out.println("NO");
            }

        }

    }
    
}
