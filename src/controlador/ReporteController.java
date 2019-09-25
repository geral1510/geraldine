/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.VendedorDao;
import dao.VentaDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Vendedor;
import modelo.Venta;
import vista.Reporte;

/**
 *
 * @author geraldinenataliahenriquezsaez
 */
public class ReporteController  implements ActionListener{
    
    private Reporte r;

    public ReporteController(Reporte r) {
        this.r = r;
    }
    
    VendedorDao vd = new VendedorDao();
                
    ArrayList<Vendedor> vendedores= vd.getPersonas();
    
    VentaDao ve = new VentaDao();
    
    ArrayList<Venta> ventas = ve.getVenta();
    
    
    public void obtenerVentas (){
        
        for (int i = 0; i < ventas.size(); i++) { //recorriendo
            
            for (int j = 0; j < vendedores.size(); j++) {
                
                if (ventas.get(i).getIdVendedor()==vendedores.get(j).getId()) {
                    int n=0;
                     n = n+1;
                     vendedores.get(j).setnVenta(n); //acumula las ventas del vendedor 
                     
                     
                
                }
                if (true) {
                    
                }
            }
            
        }
        
        
    }
    
    public int  getMes(String fecha){
        char [] cadena = fecha.toCharArray();
        String aux = "";
        aux= "" + cadena[5] + cadena[6];
        int mes = Integer.parseInt(aux);
        return mes; 
       
        
    }
    
    public void mejorVendedor(){
        
            
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
        
    }
   

    
    
    
