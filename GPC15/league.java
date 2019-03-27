/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaguegpc15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Nura Ahmed
 */
public class LeagueGPC15 {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
                Scanner cin = new Scanner(new FileReader("league.in"));
                int n = cin.nextInt(); 
                int teams;
               // try{    
                 //   FileWriter fw=new FileWriter("league.out");     
                    for (int i = 1; i <= n; i++) {
                        teams = cin.nextInt(); 
                        teams--;
                        System.out.printf("%d. %d\n", i, teams);
                       // fw.write(i +". "+ teams +"\n"); 
                    }
                   // fw.close();    
//                }
//                catch(Exception e){
//                    System.out.println(e);
//                } 
                       

    }
    
}
