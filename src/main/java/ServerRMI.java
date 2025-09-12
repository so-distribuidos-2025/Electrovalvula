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
    int id;
    
    public ServerRMI(int id) throws RemoteException{
        super();
        this.id = id;
    }

    /*public double getTemperatura() {
        return temperatura;
    }*/

    @Override
    public boolean estaAbierta() throws RemoteException {
        return estaAbierta;
    }

    @Override
    public void abrirValvula() throws RemoteException {
        this.estaAbierta = true;
        System.out.printf("Se abrió la electrovalvula %d\n", id);
    }

    public void cerrarValvula() throws RemoteException {
        this.estaAbierta = false;
        System.out.printf("Se cerró la electrovalvula %d\n", id);
    }
}
