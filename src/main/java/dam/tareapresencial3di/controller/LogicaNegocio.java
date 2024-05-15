/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.tareapresencial3di.controller;

import dam.tareapresencial3di.dto.Cliente;
import dam.tareapresencial3di.dto.Coche;
import dam.tareapresencial3di.dto.Venta;
import java.util.Date;
import java.util.List;

/**
 *
 * @author José Manuel Navarro <josemanuel.navarro@iesalandalus.org>
 */
public class LogicaNegocio {
    private CocheController cocheController;
    private VentaController ventaController;
    private ClienteController clienteController;
    
    public LogicaNegocio(){
        cocheController = new CocheController();
        ventaController = new VentaController();
        clienteController = new ClienteController();
        
        
        // Ponemos datos para no iniciar a blanco
        Coche opel = new Coche("Opel","Corsa","1234BCD","Gris",1000.0);
        Coche vw = new Coche("VW","Passat","4321FGH","Azul",1500.0);
        cocheController.addCoche(opel);
        cocheController.addCoche(vw);
        Cliente jm = new Cliente("José Manuel", "Navarro Izquierdo", "18123123", "666777888", new Date(80,1,1), new Date (98,1,1), "josemanuel.navarro@iesalandalus.org");
        clienteController.addCliente(jm);
        ventaController.addVenta(new Coche("BMW","X1","1010DAM","Naranja",10000),jm,"15/05/2024",10000);
        
    }
    
    public List<Coche> getListaVehiculos(){
        return cocheController.getListaCoches();
    }
    
    public List<Cliente> getListaClientes(){
        return clienteController.getListaClientes();
    }
    
    public List<Venta> getListaVentas(){
        return ventaController.getListaVentas();
    }
}
