/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.tareapresencial3di.view.tablemodels;

import java.util.List;

import dam.tareapresencial3di.dto.Venta;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author José Manuel Navarro <josemanuel.navarro@iesalandalus.org>
 */
public class VentasTableModel extends AbstractTableModel{
    private List<Venta> listaVentas;
    private final String[] columnas =  {"Cliente","Coche","Fecha","Precio"};
    
    public VentasTableModel(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }
   
    @Override
    public int getRowCount() {
        return listaVentas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Venta venta = listaVentas.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> venta.getCliente().getDni();
            case 1 -> venta.getCoche().getMatricula();
            case 2 -> venta.getFechaVenta();
            case 3 -> venta.getPrecioVenta();
            default -> null;
        };
    }
    
    public String getColumName(int index){
        return columnas[index];
    }  
    
}
