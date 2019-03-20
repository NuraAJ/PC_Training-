/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge10037;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class Bridge10037 {

    /**
     * @param args the command line arguments
     */
    public static int time(ArrayList<Integer> speeds){
        if(speeds.size() == 1) return speeds.get(0); 
        if(speeds.size() == 2) return speeds.get(1); 
        if(speeds.size() == 2) return speeds.get(0) + speeds.get(1) + speeds.get(2); 
        return -1; 
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("Bridge10037.in"));
        int T = in.nextInt();
        int n, speed, time; 
        int [] speedsArray; 
        for (int i = 1; i <= T; i++) {
            in.nextLine();
            n = in.nextInt();
            speedsArray = new int[n+1]; 
            for (int j = 1; j <= n; j++) {
                speed = in.nextInt();
                in.nextLine();
                speedsArray[j] = speed; 
            }
            Arrays.sort(speedsArray);
            time = 0;
            //if we have 1 or 2 or 3 people then one optimal solution !
            //if we have more than 3 (4 or more) we have 2 solutions. 
            //we want to move 2 ppl at iteration 
            //we will work with fastest 2 &  slowest 2
            /*
            1) The fastest member goes back and forth (twice)
                * The fastest member takes the slowest member across and comes back - time = a + A
                * To take the two slowest - time = 2 * A + a + b
            OR 
            2) The two fastest members go, allowing the two slowest two to go together
                * A and B go to the other side - time = B
                * A goes back - time = A
                * a and b cross - time = a
                * B goes back - time = B
                time needed: 2*B + A + a
            
            compare 1 & 2 and take the faster one 
            if (2*A + a + b < 2*B + A + a) 
            then we contniue until we have 3 or less people 
            */
            //check the base 
            int passingers = n;
            int t1, t2;
            while(passingers>=4){
                t1 = speedsArray[2] + speedsArray[1] + speedsArray[passingers] + speedsArray[2];
                t2 = speedsArray[passingers] + speedsArray[1] + speedsArray[passingers - 1] + speedsArray[1];
                if(t1 < t2){
                    time += t1;
                    System.out.println(speedsArray[1]+ " "+speedsArray[2]);
                    System.out.println(speedsArray[1]);
                    System.out.println(speedsArray[passingers - 1]+" "+speedsArray[passingers]);
                    System.out.println(speedsArray[2]);
                }
                else{
                    time += t2;
                    System.out.println(speedsArray[1]+ " "+speedsArray[passingers]);
                    System.out.println(speedsArray[1]); 
                    System.out.println(speedsArray[1]+ " "+speedsArray[passingers-1]);
                    System.out.println(speedsArray[1]);
                }
                passingers-=2; 
            }
            switch (passingers) {
                case 3:
                    System.out.println(speedsArray[1] +" "+  speedsArray[2]);
                    System.out.println(speedsArray[1]);
                    System.out.println(speedsArray[1] + " "+ speedsArray[3]);
                    time += speedsArray[1] + speedsArray[2] + speedsArray[3];
                    break;
                case 2:
                    System.out.println(speedsArray[1] + " "+ speedsArray[2]);
                    time += speedsArray[2];
                    break;
                case 1:
                    System.out.println(speedsArray[1]); 
                    time += speedsArray[1];
                    break;
            }
            System.out.println("Time = " + time);
            
            
        }
    }
    
}
