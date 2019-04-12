//Program to demonstrate the Server for UDP communicaiton
import java.net.*;
import java.util.*;
import java.lang.*;
import java.io.*;
class Udpserver
{
 public static void main(String args[])
 {
    try
   {
      
    DatagramSocket serversoc=new DatagramSocket(5678);
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

    String s;
   while(true)
   {
    byte[] send_data=new byte[100];
    byte[] recv_data=new byte[100];


    DatagramPacket recv_pack=new DatagramPacket(recv_data,recv_data.length);
    serversoc.receive(recv_pack);
    s=new String(recv_pack.getData());
    System.out.println("From client:"+s);

    System.out.println("Enter String");
    s=in.readLine();
    if(s.equals("bye"))
    {
    serversoc.close();
     }
    

    send_data =s.getBytes();
    InetAddress addr=recv_pack.getAddress();
    int port=recv_pack.getPort();
    DatagramPacket send_pack=new DatagramPacket(send_data,send_data.length,addr,port);
    serversoc.send(send_pack);
 
 

 }
}
catch(Exception e){}
}
}
