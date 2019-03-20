/*
 * To change this license header, choose License Headers input Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template input the editor.
 */
package hardwoodspecies;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author hessa
 */
public class HardwoodSpecies10226 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       // List of Conquests
       Scanner input = new Scanner(new FileReader("HardwoodSpecies.in"));
       int T = input.nextInt();
       String str = input.nextLine();
       String name;
       int counter = 0;
       TreeMap<String,Integer> trees = new TreeMap<>();
        for (int i = 0; i < T; i++) {
            name = input.nextLine();
            if (trees.containsKey(name))
                trees.put(name, trees.get(name)+1);
            else 
                 trees.put(name, 1);
        }
        Set<String> keys = trees.keySet();
        keys.forEach((key) -> {
            float num = (float)trees.get(key)/T * 100;
            System.out.printf("%s %.4f\n", key, num);
        });
    }
}
