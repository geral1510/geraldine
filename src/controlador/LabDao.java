/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.VendedorDao;
import java.util.ArrayList;
import modelo.Vendedor;
import modelo.Venta;
import vista.RegistrarVenta;
import vista.Reporte;
import vista.Ventana1;

/**
 *
 * @author geraldinenataliahenriquezsaez
 */
public class LabDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VendedorDao vd = new VendedorDao();
        RegistrarVenta rv = new RegistrarVenta();
       
        
       ArrayList<Vendedor> personas=vd.getPersonas();
        Ventana1 v = new Ventana1();
        
        
        Vendedor vd1= vd.getPersona(2);
        System.out.println(vd1.getNombre());
        
        
        v.setVisible(true);
        
    }
    
}
