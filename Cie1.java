
package cie1;

public class Cie1 {
    static int seq_numc=100;
    static int seq_nums=200;
    static int ack;
    public static void clientFirst(){
//        seq_numc;
        ack=0;
        System.out.println("Client side Packet sent\nSequence number: "+seq_numc+"\nAck number: null");
    }
    public static void serverFirst(){
        ack=101;
        System.out.println("Server side Packet sent\nSequence number: "+seq_nums+"\nAck number: "+ack);
    }
    public static void clientSubsequent(){
        seq_numc+=1;
        ack=seq_nums+1;
        System.out.println("client side Packet sent\nSequence number: "+seq_numc+"\nAck number: "+ack);
    }
    public static void serverSubsequent(){
        seq_nums+=1;
        ack=seq_numc+1;
        System.out.println("Server side Packet sent\nSequence number: "+seq_nums+"\nAck number: "+ack);
    }
    public static void main(String[] args) {
        clientFirst();
        serverFirst();
        System.out.println();
        clientSubsequent();
        System.out.println();
        serverSubsequent();
        System.out.println();
        clientSubsequent();
        System.out.println();
        serverSubsequent();
        System.out.println();
        clientSubsequent();
        System.out.println();
        serverSubsequent();
        System.out.println();
    }
    
}
