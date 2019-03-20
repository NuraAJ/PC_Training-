/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridsuccessors11581;

import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class GridSuccessors11581 {

    /**
     * @param args the command line arguments
     */
    public static int[][] grid = new int[3][3]; 
    public static void sum(){
        int[][] sumArray = new int[3][3];

	sumArray[0][0] = (grid[0][1] + grid[1][0]) % 2;
	sumArray[0][1] = (grid[0][0] + grid[1][1] + grid[0][2]) % 2;
	sumArray[0][2] = (grid[0][1] + grid[1][2]) % 2;

	sumArray[1][0] = (grid[0][0] + grid[1][1] + grid[2][0]) % 2;
	sumArray[1][1] = (grid[0][1] + grid[1][0] + grid[1][2] + grid[2][1]) % 2;
	sumArray[1][2] = (grid[1][1] + grid[0][2] + grid[2][2]) % 2;

	sumArray[2][0] = (grid[2][1] + grid[1][0]) % 2;
	sumArray[2][1] = (grid[2][0] + grid[1][1] + grid[2][2]) % 2;
	sumArray[2][2] = (grid[2][1] + grid[1][2]) % 2;
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                grid[i][j] = sumArray[i][j];
            }
        }

    }
    public static boolean check(){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                if(grid[i][j]>0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                grid[i][j] = input.nextInt(); 
            }
        }
        
       //We want to stop when all is zero 
        int iterations = -1;
        while (!check()) {
            sum();
            iterations++;
        }
        System.out.println(iterations);
    }
    
}
