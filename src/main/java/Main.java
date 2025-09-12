
import java.io.*;
import java.net.*;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        int id = Integer.parseInt(args[0]);
        ServerRMI server = null;
        Electrovalvula ev = new Electrovalvula();

        System.out.println(ev.toString());

        try {
            server = new ServerRMI(id);
            HiloServerRMI hServer = new HiloServerRMI(server, id);
            hServer.start();
        } catch (RemoteException ex) {
            //throw new RuntimeException(ex);
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        //ev.abrir();

        System.out.printf(ev.toString());

    }
}
