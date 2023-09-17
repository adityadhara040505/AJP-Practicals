package Practical14;

import java.net.*;
import java.util.Scanner;

class Practical14Q2 {
    public static void main(String[] args){
        try{
            System.out.print("Enter host name : ");
            Scanner scn = new Scanner(System.in);
            String hostname = scn.nextLine();
            InetAddress ip = InetAddress.getByName(hostname);
            System.out.println("Host name : "+ip.getHostName());
            System.out.println("Host address : "+ip.getHostAddress());

            System.out.print("Enter another host name with multiple IPs : ");
            String hostname1 = scn.nextLine();
            InetAddress[] ip1 = InetAddress.getAllByName(hostname1);
            for(int i=0;i<ip1.length;i++){
                System.out.println("Host name : "+ip1[i].getHostName());
            System.out.println("Host address : "+ip1[i].getHostAddress());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
