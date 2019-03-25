/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtointermediatemath10773;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class BacktoIntermediateMath10773 {

    /**
     * In this question it was ambiguous if we can say the difference is zero if both ways are the same or if we should say can't determine
     * This solution will print can't determine if both ways take the same time
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner cin = new Scanner(new FileReader("BacktoIntermediateMath10773.in"));
        int n = cin.nextInt(); 
        double d, v, u, firstWay, secondWay; 
        for (int i = 1; i <= n; i++) {
            d = cin.nextDouble();
            v = cin.nextDouble();
            u = cin.nextDouble();
            
            if(v >= u /*flow is larger*/){
                System.out.printf("Case %d: can't determine\n", i);
            }
            else{
                firstWay = d / u; 
                //straight line that perpendicular with the riverside
                //Formula: https://demonstrations.wolfram.com/LengthOfThePerpendicularFromAPointToAStraightLine/#more 
                secondWay = d/Math.sqrt(Math.pow(u, 2)- Math.pow(v, 2));
                if(firstWay == secondWay)
                    System.out.printf("Case %d: can't determine\n", i);
                else
                    System.out.printf("Case %d: %.3f\n", i , Math.abs(firstWay -secondWay));
            }
            
            
        }
    }
    
}
