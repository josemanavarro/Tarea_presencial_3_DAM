/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.tareapresencial3di.dto;

/**
 * Clase que define una venta, sus atributos son Cliente, Coche, Fecha de venta y Precio de venta.
 * @author José Manuel Navarro <josemanuel.navarro@iesalandalus.org>
 */
public class Venta {
    private Cliente cliente;
    private Coche coche;
    private String fechaVenta;
    private double precioVenta;

    public Venta(Cliente cliente, Coche coche, String fechaVenta, double precioVenta) {
        this.cliente = cliente;
        this.coche = coche;
        this.fechaVenta = fechaVenta;
        this.precioVenta = precioVenta;
    }

    public Venta() {
        this.cliente = new Cliente();
        this.coche = new Coche();
        this.fechaVenta = "";
        this.precioVenta = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente + ", coche=" + coche + ", fechaVenta=" + fechaVenta + ", precioVenta=" + precioVenta + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venta other = (Venta) obj;
        if (Double.doubleToLongBits(this.precioVenta) != Double.doubleToLongBits(other.precioVenta)) {
            return false;
        }
        if (!this.cliente.equals(other.cliente)) {
            return false;
        }
        if (!this.coche.equals(other.coche)) {
            return false;
        }
        if (!this.fechaVenta.equals(other.fechaVenta)) {
            return false;
        }
        return true;
    }
}