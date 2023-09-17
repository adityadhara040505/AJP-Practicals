package Practical15;

import java.net.*;

class Practical15Q2 {
    public static void main(String[] args) throws MalformedURLException {
        URL msbte = new URL("http://www.msbte.org.in/");
        System.out.println("Host : "+msbte.getHost());
        System.out.println("Protocol : "+msbte.getProtocol());
        System.out.println("Port : "+msbte.getPort());
        System.out.println("File : "+msbte.getFile());
    }
}
