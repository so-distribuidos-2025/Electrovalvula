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
    
    public HiloServerRMI(IServerRMI s){
        server = s;
    }
    
    @Override
    public void run(){
        try {
            LocateRegistry.createRegistry(20001);
            Naming.rebind("rmi://localhost:20001/ServerRMI", server);
        } catch (RemoteException ex) {
            Logger.getLogger(HiloServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(HiloServerRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
