/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import interfaces.IServerRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lesca
 */
public class HiloServerRMI extends Thread{
    
    IServerRMI server;
    int id;
    
    public HiloServerRMI(IServerRMI s, int id){
        this.server = s;
        this.id = id;
    }
    
    @Override
    public void run(){
        try {
            int port = 21000 + this.id;
            LocateRegistry.createRegistry(port);
            Naming.rebind(String.format("rmi://localhost:%d/ServerRMI",port), server);
        } catch (RemoteException ex) {
            Logger.getLogger(HiloServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(HiloServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
