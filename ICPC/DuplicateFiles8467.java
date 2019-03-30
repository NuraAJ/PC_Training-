/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicatefiles8467;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author nura ahmed 
 */
public class DuplicateFiles8467 {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner cin = new Scanner(new FileReader("DuplicateFiles8467.in"));
        TreeMap<String, Integer> files = new TreeMap<>();
        TreeSet<Integer> ts1 = new TreeSet<Integer>(); 
        int T = cin.nextInt(); 
        int n; 
        String name;
        int ID; 
        int tempID;
        for (int i = 0; i < T; i++) {
            n = cin.nextInt(); 
            for (int j = 0; j < n; j++) {
                name = cin.next(); 
                ID = cin.nextInt(); 
                if(!files.containsKey(name)){
                    files.put(name, ID);
                }
                else{
                    tempID = files.get(name); 
                    if(tempID > ID){
                        files.put(name, ID);
                    }
                }
            }
            for (Integer num : files.values()) {
                ts1.add(num);
            }
            for (Integer num : ts1) {
                System.out.print(num + " ");
            }
            System.out.println("");
            files.clear();
            ts1.clear();
        }
    }
    
}
