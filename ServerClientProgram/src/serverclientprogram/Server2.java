
package serverclientprogram;
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Server2 {
    public static void main(String[] args)throws UnknownHostException, IOException{
        int number, temp;
        //specify port number as done in client program
        ServerSocket s1 = new ServerSocket(1342);
        //create socket to accept request from incoming client
        Socket ss = s1.accept();
        //accept number which client is passing
        Scanner sc = new Scanner(ss.getInputStream());
        number = sc.nextInt();
        
        //modify number accepted
        temp = number*2;
        
        //pass number to client
        PrintStream p = new PrintStream(ss.getOutputStream());
        p.println(temp);
    }
    
}
