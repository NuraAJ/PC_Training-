/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividingcoins562;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class DividingCoins562 {
    //it is basicullay a knapsack problem 
    //the dp array -> 1D is suffiecnt 
    static int[] dp = new int[25000+1];//500*100/2
    public static int coinDivide(int m, int sum, int[] coins){ //can make the A as a class attibute to avoid passing it 
        for(int i = 0; i<= sum; i++) dp[i] = 0;
        
        for(int i = 1; i<= m; i++)
            for(int j = sum; j>0; j--){
                if(coins[i]<= j) dp[j] = Math.max(dp[j], coins[i] + dp[j - coins[i]]);
            }
        return dp[sum];
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new FileReader("DividingCoins562.in"));
        int n = cin.nextInt();
        cin.nextLine();
        int m, diff, sum;
        int [] coins; //maximum will be coins[100] 
        for (int i = 0; i < n; i++) {
            m = cin.nextInt();
            coins = new int[m+1];
            sum = 0; 
            cin.nextLine(); 
            for (int j = 1; j <=m; j++) {
                coins[j] = cin.nextInt();
                sum+=coins[j];

            }
            diff = Math.abs(sum - 2*coinDivide(m, sum/2, coins));//We mulipy by two since we solved the problem for the half case 
            System.out.println(diff); //sum/2 because we'll solve it for one of the men
        }
    }
    
}
