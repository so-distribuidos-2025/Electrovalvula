
import java.io.*;
import java.net.*;


public class Main {

    private int id = 1;

    public static void main(String[] args) {

        Electrovalvula ev = new Electrovalvula();

        System.out.println(ev.toString());

        ev.abrir();

        System.out.printf(ev.toString());

    }
}
