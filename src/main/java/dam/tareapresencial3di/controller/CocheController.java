/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.tareapresencial3di.controller;

/**
 *
 * @author José Manuel Navarro <josemanuel.navarro@iesalandalus.org>
 */


import dam.tareapresencial3di.dto.Coche;
import java.util.ArrayList;
import java.util.List;

public class CocheController {
    public List<Coche> listaCoches;
    
    public CocheController(){
        listaCoches = new ArrayList<>();
    }
    
    public void addCoche(Coche coche){
        listaCoches.add(coche);
    }

    public List<Coche> getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(List<Coche> listaCoches) {
        this.listaCoches = listaCoches;
    }

    public Coche getCoche(int index){
        return listaCoches.get(index);
    }

    public void removeCoche(int index){
        listaCoches.remove(index);
    }

    public void updateCoche(int index, Coche coche){
        listaCoches.set(index, coche);
    }

    public int getSize(){
        return listaCoches.size();
    }

    public void clear(){
        listaCoches.clear();
    }

    public boolean isEmpty(){
        return listaCoches.isEmpty();
    }

    public boolean contains(Coche coche){
        return listaCoches.contains(coche);
    }

    public int indexOf(Coche coche){
        return listaCoches.indexOf(coche);
    }

    public int lastIndexOf(Coche coche){
        return listaCoches.lastIndexOf(coche);
    }

    public List<Coche> subList(int fromIndex, int toIndex){
        return listaCoches.subList(fromIndex, toIndex);
    }

    public boolean addAll(List<Coche> coches){
        return listaCoches.addAll(coches);
    }

    public boolean addAll(int index, List<Coche> coches){
        return listaCoches.addAll(index, coches);
    }

    public boolean removeAll(List<Coche> coches){
        return listaCoches.removeAll(coches);
    }

    public boolean retainAll(List<Coche> coches){
        return listaCoches.retainAll(coches);
    }

    public Coche set(int index, Coche coche){
        return listaCoches.set(index, coche);
    }

    public boolean containsAll(List<Coche> coches){
        return listaCoches.containsAll(coches);
    }

    public Object[] toArray(){
        return listaCoches.toArray();
    }

    public boolean remove(Coche coche){
        return listaCoches.remove(coche);
    }


}
