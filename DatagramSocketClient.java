package CN;
import java.net.*;
public class DatagramSocketClient {
    public static void main(String[] args) throws Exception{
        String Line="connected with client";
        DatagramSocket clientSocket=new DatagramSocket();
        InetAddress IPAddress=InetAddress.getByName("localhost");
        byte[] sendData=new byte[1024];
          byte[] recieveData=new byte[1024];
          sendData=Line.getBytes();
          DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,IPAddress,9000);
          clientSocket.send(sendPacket);
          System.out.println("Client display terminal");
          while(true)
          {
               DatagramPacket recievePacket=new DatagramPacket( recieveData, recieveData.length);
               clientSocket.receive(recievePacket);
               String messageRecieved=new String(recievePacket.getData(),recievePacket.getOffset(),recievePacket.getLength());
               System.out.println("message typed at server side is"+messageRecieved);
          }
     }
}
