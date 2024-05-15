/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.tareapresencial3di.view.tablemodels;

import dam.tareapresencial3di.dto.Cliente;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;



/**
 *
 * @author José Manuel Navarro <josemanuel.navarro@iesalandalus.org>
 */
public class ClientesTableModel extends AbstractTableModel{
    private List<Cliente> listaClientes;
    private final String[] columnas ={"Nombre","Apellidos","dni","Telefono","Fecha Nacimiento","Fecha Obtencion Carnet","CorreoElectronico"};

    public ClientesTableModel(List<Cliente> clientes){
        listaClientes = clientes;
    }
    
    @Override
    public int getRowCount() {
        return listaClientes.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = listaClientes.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> cliente.getNombre();
            case 1 -> cliente.getApellidos();
            case 2 -> cliente.getDni();
            case 3 -> cliente.getTelefono();
            case 4 -> cliente.getFechaNacimiento();
            case 5 -> cliente.getFechaObtencionCarnet();
            case 6 -> cliente.getCorreoElectronico();
            default -> null;
        };
    }
    
    public String getColumName(int index){
        return columnas[index];
    }  
}
