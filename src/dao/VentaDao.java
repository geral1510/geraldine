package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Vendedor;
import modelo.Venta;

/**
 *
 * @author chelo
 */
public class VentaDao {
    
    Conexion con;

    public VentaDao() {
        this.con = new Conexion();
    }
    
    public ArrayList<Venta> getVenta(){
        
        ArrayList<Venta> ventas = new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try{
            String sql="SELECT * FROM venta ";
            
            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);
           
            
            while ( resultados.next() ) {
                String fecha = resultados.getString("fecha");
                int monto = resultados.getInt("monto");
                String sucursal = resultados.getString("sucursal");
                int idVenta = resultados.getInt("idVenta");
                int idVendedor = resultados.getInt("idVendedor");
                ventas.add(new Venta(fecha,idVenta,monto,sucursal,idVendedor));
            }
            //accesoBD.close();
            return ventas;
        }catch (Exception e){
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
        
        
        
    }
    public Venta getVenta(int id){
           Venta v= new Venta();
           Connection accesoBD = con.getConexion();
            
             try{
            String sql="SELECT * FROM venta WHERE id_venta="+id+";";
            
            Statement st = accesoBD.createStatement(); //Objeto que viaja hasta la base de datos y lleva la consulta
            ResultSet resultados = st.executeQuery(sql); //Resultados enviados de vuelta
           
            
             while( resultados.next()) { //es una iterador propio de resultset que entrega un boleano y cambia a la siguiente tupla para obtener datos de todas las tuplas.
                String fecha = resultados.getString("fecha");
                int idVenta = resultados.getInt("idVenta");
                int monto = resultados.getInt("monto");
                String sucursal = resultados.getString("sucursal");
                int idVendedor = resultados.getInt("idVendedor");
                v= new Venta(fecha, idVenta, monto, sucursal,idVendedor); 
            }
               return v;
             
        }catch (Exception e){
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }   
    }

    
}


