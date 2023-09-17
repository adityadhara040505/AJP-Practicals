package Practical14;

import java.net.*;

class Practical14Q1{

    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getByName("localhost");
            System.out.println("host name : "+ip.getHostName());
            System.out.println("host name : "+ip.getHostAddress());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}