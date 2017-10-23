/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author adithyamorampudi
 */


    /**
     * @param args the command line arguments
     */
    
import java.net.*;
import java.io.*;

public class Server{
	public static void main(String[] args){
	int port = 5678;
	int client = 0;
        String host ="localhost"; 
	try{
		
		InetAddress address = InetAddress.getByName(host);
                Socket socketObj = new Socket(address, port);
                
                System.out.println("Connected");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
