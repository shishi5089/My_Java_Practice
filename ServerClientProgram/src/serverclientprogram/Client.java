
package serverclientprogram;
import java.net.*;
import java.io.*;


public class Client {
    public static void main(String[] args)throws IOException {
        Socket s = new Socket("localhost",4999);
        
        //sending data from client to server
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("Is it woring?");
        pr.flush();
        
        //Two way communication --> client to server. server to client
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        
         String str = bf.readLine();
         System.out.println("server: "+ str);
    }   
    
}
