
package serverclientprogram;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client2 {
    public static void main (String[]args) throws UnknownHostException, IOException{
        int number, temp;
        //used to accept number from user
        Scanner sc = new Scanner(System.in);
        //used for comunication between client and server
        Socket s = new Socket("127.0.0.1", 1342);
        //create scanner object to use socket
        Scanner sc1 = new Scanner(s.getInputStream());
        //accept number from user
        System.out.println("Enter number:\n");
        number  = sc.nextInt();
        
        //pass number to server for it to process number entered
        PrintStream p = new PrintStream(s.getOutputStream());
        //print number onto server
        p.println(number);
        //create variable to accept number from server
        temp = sc1.nextInt();
        System.out.println(temp);
        
    }
    
}
