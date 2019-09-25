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
public class Venta {

    private String fecha;
    private int idVenta;
    private int monto;
    private String sucursal;
    private int idVendedor;

    public Venta() {
    }

    public Venta(String fecha, int idVenta, int monto, String sucursal, int idVendedor) {
        this.fecha = fecha;
        this.idVenta = idVenta;
        this.monto = monto;
        this.sucursal = sucursal;
        this.idVendedor = idVendedor;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

}
