/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author geraldinenataliahenriquezsaez
 */
public class Vendedor {
   
    
    private String nombre;
    private String apellido;
    private int rut;
    private int id;
    private int nVenta;

    public Vendedor() {
        
    }
    

    public Vendedor(String nombre, String apellido, int edad, int id, int nVenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.id = id;
        this.nVenta= nVenta;
    }

    public int getnVenta() {
        return nVenta;
    }

    public void setnVenta(int nVenta) {
        this.nVenta = nVenta;
    }

    public Vendedor(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "" + "" + nombre + " " + apellido ;
    }

   
    
}
    

    
    


