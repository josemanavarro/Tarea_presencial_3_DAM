/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.tareapresencial3di.controller;

import dam.tareapresencial3di.dto.Cliente;
import dam.tareapresencial3di.dto.Coche;
import dam.tareapresencial3di.dto.Venta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Manuel Navarro <josemanuel.navarro@iesalandalus.org>
 */
public class VentaController {
    public List listaVentas;
    
    public VentaController(){
        this.listaVentas = new ArrayList<>(); 
    }
    
    void addVenta(Coche coche, Cliente cliente, String fecha, double precioVenta) {
        listaVentas.add(new Venta(cliente,coche,fecha,precioVenta));
    }
    void removeVenta(int index) {
        listaVentas.remove(index);
    }
    void updateVenta(int index, Venta venta) {
        listaVentas.set(index, venta);
    }
    int getSize() {
        return listaVentas.size();
    }
    void clear() {
        listaVentas.clear();
    }
    boolean isEmpty() {
        return listaVentas.isEmpty();
    }
    boolean contains(Venta venta) {
        return listaVentas.contains(venta);
    }
    Venta getVenta(int index) {
        return (Venta) listaVentas.get(index);
    }
    void setListaVentas(List listaVentas) {
        this.listaVentas = listaVentas;
    }
    List getListaVentas() {
        return listaVentas;
    }
    
    
}
