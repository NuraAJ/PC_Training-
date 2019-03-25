/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indistinguishableblock3247;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 *  * This is an application of Partitions of Integers. 
 * Although there is no exact formula, we can approximate the number or generate all partitions (my method)
 * Problem was retrieved from https://icpcarchive.ecs.baylor.edu/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=1248
 */
public class IndistinguishableBlock3247 {
static int tableData[][]= new int[120][120]; //Size is from the problem 
    public static int calculateArrangments(int number, int subNumber){
        
        if (subNumber==0)
            return 0;
        if (number==0)
            return 1;
        if (number<0)
            return 0;
        //Either we take the number or we don't , we loop over the subsets 
        return calculateArrangments(number,subNumber-1) + calculateArrangments(number-subNumber,subNumber); 
    }
    public static int calculateArrangmentsDP(int number, int subNumber){
        if (subNumber==0)
            return 0;
        if (number==0)
            return 1;
        if (number<0)
            return 0;
        
        if (tableData[number][subNumber]!=0) return tableData[number][subNumber];

        tableData[number][subNumber]=calculateArrangmentsDP(number,subNumber-1) + calculateArrangmentsDP(number-subNumber,subNumber);
    
        return tableData[number][subNumber];  
    }
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner cin = new Scanner(new FileReader("IndistinguishableBlock3247.in"));
        int x  = cin.nextInt(); 
        while(x != -1){
            System.out.printf("%d => %d\n", x, calculateArrangments(x, x));
            //System.out.println("The number of paritions = " + calculateArrangmentsDP(x, x));
           x  = cin.nextInt();  
        }
    }
    
}