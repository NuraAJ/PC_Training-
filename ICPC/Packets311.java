/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packets311;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
public class Packets311 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
            int p1, p2, p3, p4, p5, p6;
            Scanner in = new Scanner(new FileReader("Packets311.in"));
            p1 = in.nextInt();
            p2 = in.nextInt();
            p3 = in.nextInt();
            p4 = in.nextInt();
            p5 = in.nextInt();
            p6 = in.nextInt();
            //in.nextLine();
            int noParcels = 0; 
            while((p1+ p2+ p3+ p4 + p5 + p6)>0){
                in.nextLine();
                noParcels = 0;
                noParcels+= p6; //Cannot take anything else 
                noParcels+= p5; //we have empty spcae we can utalize with paceles of size 1 (for every p5) 
                p1 = p1 - (p5 * 11); 
                
                noParcels+= p4; //we have empty spcae we can utalize with paceles of size 2 (for every p4) 
                p2 = p2 - (p4 * 5); 
                
                //We need to handle the 3x3 
                //We will only need a new one if we have 4 of them -> fills a box ! 
                noParcels += (p3/4); 
                //If we have leftovers? fill a pracel and take care of 1 & 2 on the way. 
                if(p3 % 4 != 0){
                    if(p3 % 4 == 1){
                        p2-= 5; 
                        p1-= 7; 
                    }
                    else if(p3 % 4 == 2){
                        p2-= 3; 
                        p1-= 6;
                    }
                    else if(p3 % 4 == 3){
                        p2-= 1; 
                        p1-= 5;
                    }
                    noParcels++; //for this box
                }
                //Now we check for 2 .. if anything remains
                //we will follow the same approach as in 3x3 
                if(p2>0){
                    noParcels += (p2/9);
                    if(p2 % 9 > 0){
                        //fill it with the p1 
                        //find how many remains 
                        p1 = p1 - (36 - ((p2 % 9) * 4));
                        noParcels++; //for this box
                   }
                    else if(p2<0){
                        p1 -= (-p2) * 4; //if the box is not completey filled
                    }
                    //Deal with the reminder of p1
                    if (p1 > 0) { // fill 36 of b1 into the box
                        noParcels += p1 / 36;
                        if (p1 % 36 > 0) { // if there are left over, then put all of them into the new box
                            noParcels++;
                        }
                    }
                }
                System.out.println(noParcels);
                
                
                //Reading the next case 
                p1 = in.nextInt();
                p2 = in.nextInt();
                p3 = in.nextInt();
                p4 = in.nextInt();
                p5 = in.nextInt();
                p6 = in.nextInt();
                //System.out.println("Values: "+p1+ p2+p3+p4+p5+p6);
               
            }
    }
    
}
