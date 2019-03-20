/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingthecatcher231;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class TestingTheCATCHER231 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("TestingTheCATCHER231.in"));
        int step1, countSeq, Max, caseNo = 1; 
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        ArrayList<Integer> longestSequence = new ArrayList<Integer>(); 
        while(true){
            numbers.clear();
            longestSequence.clear();
            step1 = in.nextInt(); 
            while(step1 != -1){
                numbers.add(step1);
                step1 = in.nextInt(); 
            }
            if(numbers.isEmpty()) break;

            longestSequence.add(1);
            Max = 1;
            for(int i = 1; i < numbers.size(); i++){
                countSeq = 1; 
                for(int j = 0; j < i; j++){
                    if(numbers.get(j) >= numbers.get(i)){
                        countSeq = Math.max(countSeq, longestSequence.get(j)+1);
                    }
                }
                longestSequence.add(countSeq);
                Max = Math.max(countSeq, Max);
            }
             
           System.out.println("Test #" + caseNo +":");
           System.out.println("  maximum possible interceptions: " +  Max);
           caseNo++;  
        }
    }
    
}
