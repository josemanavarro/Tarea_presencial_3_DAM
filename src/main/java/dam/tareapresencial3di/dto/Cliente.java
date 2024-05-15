/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam.tareapresencial3di.dto;

import java.util.Date;

/**
 * Clase que define a un cliente, sus atributos son Nombre, Apellidos, DNI, Teléfono, Fecha de nacimiento, Fecha de obtención del carnet de conducir y Correo Electrónico.
 * @author José Manuel Navarro <josemanuel.navarro@iesalandalus.org>
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private Date fechaNacimiento;
    private Date fechaObtencionCarnet;
    private String correoElectronico;

    public Cliente(String nombre, String apellidos, String dni, String telefono, Date fechaNacimiento, Date fechaObtencionCarnet, String correoElectronico) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaObtencionCarnet = fechaObtencionCarnet;
        this.correoElectronico = correoElectronico;
    }

    public Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.telefono = "";
        this.fechaNacimiento = new Date();
        this.fechaObtencionCarnet = new Date();
        this.correoElectronico = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Date getFechaObtencionCarnet() {
        return fechaObtencionCarnet;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaObtencionCarnet(Date fechaObtencionCarnet) {
        this.fechaObtencionCarnet = fechaObtencionCarnet;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", fechaObtencionCarnet=" + fechaObtencionCarnet + ", correoElectronico=" + correoElectronico + '}';
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
        Cliente other = (Cliente) obj;
        if (dni == null) {
            if (other.dni != null) {
                return false;
            }
        } else if (!dni.equals(other.dni)) {
            return false;
        }
        return true;
    }

}
