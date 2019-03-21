/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesteddolls11368;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nouraahmed
 */
class NestedDolls11368 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Doll> dolls = new ArrayList<>(); 
    static int maxNoPossible;
    static ArrayList<Integer> noDolls = new ArrayList<>();
    static int globalMax; 
    
    public static void LISDoll(){
        ArrayList<Doll> dollsIn = new ArrayList<>(); 
        dollsIn.add(dolls.get(0));
        for (int i = 1; i < maxNoPossible; i++) {
            //Now we search for the next fit doll -> based on the height 
            //height greater than the next but smallest among the remanining 
            int l = 0, r = dollsIn.size()-1; 
            while(l <= r){
                int mid = (l+r)/2; 
                if(dollsIn.get(mid).h <= dolls.get(i).h){
                    l = mid + 1;
                }
                else{
                    r = mid -1;
                }
            }
            if(l == dollsIn.size()){
                dollsIn.add(dolls.get(i));
            }
            else{
            dollsIn.set(l, dolls.get(i));
            }
        }
        System.out.println(dollsIn.size());
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner cin = new Scanner(new FileReader("NestedDolls11368.in"));
        
         
        int t= cin.nextInt(); //no test cases 
        int m, maxR; 
        for (int i = 0; i < t; i++) {
            m = cin.nextInt();
            dolls.clear();
            maxNoPossible = m; 
            for (int j = 0; j < m; j++) {
                dolls.add(new Doll(cin.nextInt(), cin.nextInt()));
            }
            // sort the dolls in descending order
            Collections.sort(dolls);
//            for(Doll d: dolls){
//                System.out.println(d);
//            }
            LISDoll();
        }
    }
    
}

class Doll implements Comparable<Doll>{
    int w; 
    int h; 

    public Doll(int x, int y){
        this.w = x;
        this.h = y; 
    }
    @Override
    public int compareTo(Doll o) { 
        //https://medium.freecodecamp.org/utilizing-javas-arrays-sort-for-any-list-of-objects-e3e2db61d70b
            if(this.w!=o.w){return o.w-this.w;}
            return this.h-o.h;
    }

    @Override
    public String toString() {
        return "Doll{" + "w=" + w + ", h=" + h + '}';
    }
    
    
}