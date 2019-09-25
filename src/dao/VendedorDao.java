package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Vendedor;

/**
 *
 * @author chelo
 */
public class VendedorDao {
    
    Conexion con;

    public VendedorDao() {
        this.con = new Conexion();
    }
    
    public ArrayList<Vendedor> getPersonas(){
        
        ArrayList<Vendedor> personas = new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try{
            String sql="SELECT * FROM vendedor ";
            
            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);
           
            
            while ( resultados.next() ) {
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                int rut = resultados.getInt("rut");
                
                int idvendedor = resultados.getInt("id_vendedor");
                personas.add(new Vendedor(nombre,apellido,rut,idvendedor,0));
            }
            //accesoBD.close();
            return personas;
        }catch (Exception e){
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
        
        
        
    }
    public Vendedor getPersona(int id){
           Vendedor p= new Vendedor();
           Connection accesoBD = con.getConexion();
            
             try{
            String sql="SELECT * FROM vendedor WHERE id_vendedor="+id+";";
            
            Statement st = accesoBD.createStatement(); //Objeto que viaja hasta la base de datos y lleva la consulta
            ResultSet resultados = st.executeQuery(sql); //Resultados enviados de vuelta
           
            
             while( resultados.next()) { //es una iterador propio de resultset que entrega un boleano y cambia a la siguiente tupla para obtener datos de todas las tuplas.
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                int rut = resultados.getInt("rut");
                int idvendedor = resultados.getInt("id_vendedor");
                p= new Vendedor(nombre, apellido, rut, idvendedor,0); 
            }
                 if (p.getId()==0) {
                     System.out.println("No se ha encontrado información sobre el id: "+id);
                 }
            return p;
        }catch (Exception e){
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }   
    }
    public boolean insertarPersona(Vendedor p ){
        Connection accesoBD = con.getConexion();
        
        //insert into persona (nombre,apellido,edad)
        //values('pedro','puentes','18');
        
        try{
            String sql= "INSERT INTO vendedor (nombre,apellido,rut) "+"VALUES('"+p.getNombre()+"','"+p.getApellido()+"',"+p.getRut()+")";
            
            Statement st = accesoBD.createStatement();
            st.executeUpdate(sql);//execute update es para modificar la bd 
            return true;
        }catch(Exception e){
            System.out.println("Error al insertar persona");
            e.printStackTrace();
        }
        return false;
        
        
    }
   
}

