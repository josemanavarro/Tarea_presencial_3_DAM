/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.tareapresencial3di.controller;

import dam.tareapresencial3di.dto.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Manuel Navarro <josemanuel.navarro@iesalandalus.org>
 */
public class ClienteController {
    public List<Cliente> listaClientes;
    
    public ClienteController() {
        listaClientes = new ArrayList<>();
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void addCliente(Cliente cliente) {
        listaClientes.add(cliente);
        
    }

    public void removeCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    public Cliente getCliente(int index) {
        return listaClientes.get(index);
    }

    public int getNumeroClientes() {
        return listaClientes.size();
    }

    public void updateCliente(Cliente cliente) {
        int index = listaClientes.indexOf(cliente);
        listaClientes.set(index, cliente);
    }

    public void clearClientes() {
        listaClientes.clear();
    }

    public boolean existeCliente(Cliente cliente) {
        return listaClientes.contains(cliente);
    }

    public int getPosicionCliente(Cliente cliente) {
        return listaClientes.indexOf(cliente);
    }

    public void insertarCliente(Cliente cliente, int index) {
        listaClientes.add(index, cliente);
    }

    public void borrarCliente(int index) {
        listaClientes.remove(index);
    }

    public void borrarCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    public Cliente getCliente(String dni) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null;
    }
}
