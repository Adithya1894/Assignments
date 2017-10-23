import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Server
{
 private static int logical_clock = 0;
    private static Socket socket;
 
    public static void main(String[] args)
    {
        try
        {
 
            int port = 25000;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server Started and listening to the port 25000");
 
            //Server is running always. This is done using this while(true) loop
            while(true)
            {
                //Reading the message from the client
                socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                int n = 0;
                while(n < 20){
                int number = br.read();
                 
                System.out.println("Message received from client is " +number);
 
                //Multiplying the number by 2 and forming the return message
                int returnMessage = 11110;
                try
                {
                    //int numberInIntFormat = Integer.parseInt(number);
                    int returnValue = number*2;
                    returnMessage = returnValue;
                }
                catch(NumberFormatException e)
                {
                    //Input was not a number. Sending proper message back to client.
                    //returnMessage = 10;
                }
 
                //Sending the response back to the client.
                /*OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(returnMessage);
                System.out.println("Message sent to the client is "+returnMessage);
                bw.flush();*/
                n++;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //socket.close();
            }
            catch(Exception e){}
        }
    }
}