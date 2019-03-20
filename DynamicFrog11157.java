/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicfrog11157;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class DynamicFrog11157 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //Scanner in = new Scanner(new FileReader("DynamicFrog11157.in"));
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        int N, D; 
        int leap;
        String rock;
        String type; 
        String[] LineRocks;

        //Why not arrays?
        boolean[] used = new boolean[101]; 
        boolean[] small = new boolean[101]; 
        int[] distances = new int[101];
        for (int i = 1; i <= T; i++) {
            //System.out.println("Handling the next case");
            //in.nextLine();
            N = in.nextInt();
            D = in.nextInt();
            //System.out.println("N= "+ N);
            //System.out.println("D= "+D);
            //in.nextLine(); 
            for (int j = 0; j < N; j++) {
                rock = in.next(); 
                //System.out.println("Rock = " + rock);
                LineRocks = rock.split("-");
                type = LineRocks[0];
                distances[j] = Integer.parseInt(LineRocks[1]); 
                //System.out.println("Type = " + type);
                //System.out.println("distn= " +  distances[j]);
                used[j]= false;
                if(type.equals("S")) {small[j]= true;}
                //System.out.println("Done reading this case");
            }
            //in.nextLine();
            //System.out.println("Updating used");
            used[N] = false;
            //System.out.println("Updating small");
            small[N]=false;
            //System.out.println("Updating diatance");
            distances[N]=D; 
            
            //Either Skipp the small in going or coming back
            //System.out.println("Print leap");
            leap = distances[0]; // start from here
            //System.out.println("Leap = "+leap);
            //going to the right
            for (int j = 0; j < N; j++) {
                //System.out.println("Checking used");
                used[j] = true; 
                //going to the next step
                if(!small[j]){
                    leap = Math.max(leap, distances[j + 1] - distances[j]); 
                }
                else{
                    leap = Math.max(leap, distances[j + 2] - distances[j]);
                    ++j;
                }
                
            }
            //coming back 
            for (int j = N; j > 0; j--) {
                if (!used[j - 1] || !small[j - 1]){
                        leap = Math.max(leap, distances[j] - distances[j - 1]);
                }
                else{
                    leap = Math.max(leap, distances[j] - distances[j - 2]);
                    --j;
                }       
                
            }
            System.out.println("Case "+ i+": "+leap);
        }
    }
    
}
