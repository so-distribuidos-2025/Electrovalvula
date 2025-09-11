/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import interfaces.IServerRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author lesca
 */
public class ServerRMI extends UnicastRemoteObject implements IServerRMI{

    boolean estaAbierta;
    
    public ServerRMI() throws RemoteException{
        super();
    }

    /*public double getTemperatura() {
        return temperatura;
    }*/



    @Override
    public void abrir(boolean abrir) throws RemoteException {
        this.estaAbierta = abrir;
    }
}
