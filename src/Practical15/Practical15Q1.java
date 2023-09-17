package Practical15;

import java.net.*;

class Practical15Q1 {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("https://www.hp.com/in-en/shop/?jumpid=ps_ff1cd24f2a&gclid=Cj0KCQjwx5qoBhDyARIsAPbMagCtsw8qH1SqavQ8dYEzSzNBGcx8ZEkkkRlHvcaYrxRzIczsrUnrzU0aAoafEALw_wcB&gclsrc=aw.ds");
        System.out.println("Protocol : "+hp.getProtocol());
        System.out.println("Port : "+hp.getPort());
        System.out.println("Host : "+hp.getHost());
        System.out.println("File : "+hp.getFile());
        System.out.println("External form : "+hp.toExternalForm());
    }
}
