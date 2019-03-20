/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coincollector11264;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class CoinCollector11264 {


    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("CoinCollector11264.in"));
        int T = in.nextInt();
        int n, coin, coinV; 
        ArrayList<Integer> coins = new ArrayList<>(); 
        in.nextLine(); 
        for (int i = 0; i < T; i++) {
            n = in.nextInt();
            in.nextLine(); 
            for (int j = 0; j < n; j++) {
                coins.add(in.nextInt()); 
            }
            //Getting the number of coins 
            coin = 1; //we know the first is one 
            coinV = coins.get(0); 
            for (int j = 1; j < n-1; j++) {
                if (coinV+coins.get(j)< coins.get(j+1)){
                    coinV+=coins.get(j);
                    coin++;
                }  
            }
            coin++;
            System.out.println(coin);
            coins.clear();
        }
    }
    
}
