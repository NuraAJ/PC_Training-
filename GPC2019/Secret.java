/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secret;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author nura ahmed
 */
public class Secret {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new FileReader("secret.in"));
        int T = in.nextInt();
        String secret, result, substing=""; 
        for (int i = 1; i <= T; i++) {
            secret = in.next();
            result = ""; 
            for (int j = 0; j < secret.length(); j++) {
                if(Character.isDigit(secret.charAt(j))){
                    //check if it is even or odd
                    if(Integer.parseInt(String.valueOf(secret.charAt(j))) % 2 == 0){
                        //add to left
                        result = substing + result;
                        substing="";
                    }
                    else{
                        //add to right
                        result+=substing; 
                        substing="";
                    }
                    
                }
                else{
                    substing+=secret.charAt(j);
                }
            }
            System.out.println(i +". " + result);
        }
    }
    
}
