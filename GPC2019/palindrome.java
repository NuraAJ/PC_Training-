import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class palindrome {
    //Method to convert a number from base 10 to a given base 
    public static int changeBase(int num, int base){
        int newNumber = 0; 
        while(num > 0){
            newNumber = newNumber * 10 + num %base;
            num/=base;
        }
        return newNumber;
    }
    public static boolean isPalindrom(int x){
        int original = x ;
        int reverse =0 ; 
        while(x != 0){
            reverse = reverse * 10 + x % 10; 
            x/= 10;
        }
        if(reverse == original) return true;
        else return false; 
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new FileReader("palindrome.in"));
        int n, base;
        n = cin.nextInt();
        base = cin.nextInt(); 
        int newNumber;
        while(n!= 0 && base != 0){
            if(base == 10){
                if((isPalindrom(n))) System.out.println("Yes");
                else System.out.println("No");
            }
            else{
                //We need to convert 
                newNumber = changeBase(n, base);
                if((isPalindrom(newNumber))) System.out.println("Yes");
                else System.out.println("No");
            }
            n = cin.nextInt();
            base = cin.nextInt(); 
        }
    }
    
}
