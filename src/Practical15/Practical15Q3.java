package Practical15;

import java.util.Date;
import java.util.Scanner;
import java.io.*;
import java.net.*;

class Practical15Q3 {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter URL : ");
        String url = scn.nextLine();

        URL link = new URL(url);
        URLConnection linkCon = link.openConnection();
        long date = (long) linkCon.getDate();
        System.out.println("Date : "+new Date(date));
        System.out.println("Content type : "+linkCon.getContentType());
        System.out.println("Content length : "+linkCon.getContentLength());
    }
}
