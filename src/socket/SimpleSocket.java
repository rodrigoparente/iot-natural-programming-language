package com.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
 
 
public class SimpleSocket
{
  public void actFuncNoArgs(int deviceAddr, int funcID) {
    String serverName = "192.168.0.1";
    int port = 5456;
    
    try {
      System.out.println("Connecting to " + serverName + " on port " + port);
      Socket client = new Socket(serverName, port);
      
      System.out.println("Just connected to " + client.getRemoteSocketAddress());
      OutputStream os = client.getOutputStream();
      
      ByteBuffer b = ByteBuffer.allocate(8);
      
      b.putInt(0, deviceAddr);
      b.putInt(4, funcID);
      
      byte[] result = b.array();
      
      os.write(result, 0, 8);
      
      client.close();
    }
    catch (IOException e) {
      
      e.printStackTrace();
    } 
  }
}