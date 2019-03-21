/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleclasses;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class TheTowerBabylon437 {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner cin = new Scanner(new FileReader("TheTowerOfBabylon437.in"));
        ArrayList<Block> blocks = new ArrayList<>(); 
        ArrayList<Integer> height = new ArrayList<>(); 
        int n, x, y, z;
        int max, cuurentMax; 
        int maxHeightPossible; 
        n = cin.nextInt();
        int caseNo = 1; 
        while(n != 0){
            max = Integer.MIN_VALUE;
            height.clear();
            blocks.clear();
            maxHeightPossible = 6*n; 
            int i; 
            for (i = 0; i < n; i++) {
                x = cin.nextInt(); 
                y = cin.nextInt(); 
                z = cin.nextInt(); 
                //add all the different combination to our array 
                blocks.add(new Block(x, y, z));
                blocks.add(new Block(x, z, y)); 
                blocks.add(new Block(y, x, z)); 
                blocks.add(new Block(y, z, x));
                blocks.add(new Block(z, y, x));
                blocks.add(new Block(z, x, y)); 
            }
            Collections.sort(blocks);
            //System.out.println("Priniting the Blocks ");
            //for(Block b : blocks){
            //    System.out.println(b);
            //}
            //LIS? 
            for (i = 0; i < maxHeightPossible; i++) height.add(1); //base case -> one block only 
            for (i = 0; i < maxHeightPossible; i++){
                cuurentMax = 0; 
                for (int j = 0; j < i; j++) {
                    if(blocks.get(i).x > blocks.get(j).x && blocks.get(i).y > blocks.get(j).y){
                        cuurentMax = Math.max(cuurentMax, height.get(j));
                    } 
                }
                height.set(i, cuurentMax + blocks.get(i).z); 
                max = Math.max(max,  cuurentMax + blocks.get(i).z); 
            }
            System.out.println("Case "+ caseNo + ": " + "maximum height = " + max);
            n = cin.nextInt();
        }
       


        
    }
}

class Block implements Comparable<Block>{
    int x; 
    int y; 
    int z; 
    public Block(int x, int y, int z){
        this.x = x;
        this.y = y; 
        this.z = z; 
    }
    @Override
    public int compareTo(Block o) { 
        //https://medium.freecodecamp.org/utilizing-javas-arrays-sort-for-any-list-of-objects-e3e2db61d70b
            if(this.x!=o.x){return this.x-o.x;}
            if(this.y!=o.y){return this.y-o.y;}
            return this.z-o.z;
    }

    @Override
    public String toString() {
        return "Block{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
 
    
}
