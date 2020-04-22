
package myfirstjava;

import static java.lang.Math.tan;
import java.util.Scanner;

public class MyFirstJava {
    public static void count(String x){
        char[]ch = x.toCharArray();
        int letter = 0;
        for(int i = 0;i < x.length();i++){
            if(Character.isLetter(ch[i])){
                letter++;
            }
        }
        System.out.println("Letters: "+letter);
        
    }
    

    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String test = "Hey my name is Shishi";
            count(test);    
          
        
        
        
        
    }
    
}
