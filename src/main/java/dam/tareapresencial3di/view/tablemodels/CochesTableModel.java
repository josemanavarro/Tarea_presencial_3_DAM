/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.tareapresencial3di.view.tablemodels;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import dam.tareapresencial3di.dto.Coche;

/**
 *
 * @author José Manuel Navarro <josemanuel.navarro@iesalandalus.org>
 */
public class CochesTableModel extends AbstractTableModel{

    private List<Coche> listaCoches;
    private final String[] columnas = {"Marca","Modelo","Matricula","Color","Precio"};

    public CochesTableModel(List<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }
    
    @Override
    public int getRowCount() {
        return listaCoches.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Coche coche = listaCoches.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> coche.getMarca();
            case 1 -> coche.getModelo();
            case 2 -> coche.getMatricula();
            case 3 -> coche.getColor();
            case 4 -> coche.getPrecio();
            default -> null;
        };
    }
    
    public String getColumName(int index){
        return columnas[index];
    }  
}
