
package serverclientprogram;
import java.net.*;
import java.io.*;
public class Server {
    public static void main (String[] args)throws IOException{
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();
        System.out.println("client connected");
        
        //on command prompt
        //execute javac client.java , javac server.java
        // execute java client, java server...on paralle command prompts
        
        //reading data from the client
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        
         String str = bf.readLine();
         System.out.println("client: "+ str);
         
         //rerun executing code on command prompt
         
         //Two way communication --> client to server. server to client
         
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("yes");
        pr.flush();
    }
}
