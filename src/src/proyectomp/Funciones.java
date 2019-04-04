/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomp;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Calix
 */
public class Funciones {
    
    private static conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConexion();
    private  static PreparedStatement ps = null;
    
    public static boolean isRegister(Sentencias s){
        String sql = Sentencias.REGISTRAR;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, s.getTipo_ca());
        ps.setString(2, s.getNombre_ca());
        ps.setString(3, s.getFunciones_ca());
        ps.setDouble(4, s.getSueldos_ca());
        
        
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public static boolean isUpdate(Sentencias s){
        String sql = Sentencias.UPDATE;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, s.getTipo_ca());
        ps.setString(2, s.getNombre_ca());
        ps.setString(3, s.getFunciones_ca());
        ps.setDouble(4, s.getSueldos_ca());
        ps.setInt(5, s.getId_ca());
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
        public static boolean isDelete(Sentencias s){
        String sql = Sentencias.ELIMINAR;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, s.getId_ca());
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public static void setListar(String buscar){
            DefaultTableModel modelo = (DefaultTableModel)MOSTRARCARGO.tblCa.getModel();
            //modelo.fireTableDataChanged();
            
            
            while(modelo.getRowCount() > 0 ){
                modelo.removeRow(0);
                
            }
            
            String sql = "";
            if(buscar.equals("")){
                sql = Sentencias.LISTAR;
                
            } 
            else{
                sql = "SELECT * FROM CARGOS WHERE ("
                        + "Id_ca LIKE'"+buscar+"%' OR "
                        + "Tipo_ca LIKE'"+buscar+"%' OR "
                        + "Nombre_ca LIKE'"+buscar+"%' OR "
                       + "Funciones_ca LIKE'"+buscar+"%' OR " 
                        + "Sueldos_ca LIKE'"+buscar+"%'"
                       + ")";
//                        + "Nombre_ca LIKE'"+buscar+"%'"
//                        + ")";
            }
            
        
        String datos[] = new String[5];
        
        try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString("Id_ca");
                datos[1] = rs.getString("Tipo_ca");
                datos[2] = rs.getString("Nombre_ca");
                datos[3] = rs.getString("Funciones_ca");
                datos[4] = rs.getString("Sueldos_ca");
                modelo.addRow(datos);
                
            }
           // MOSTRARCARGO.tblCa.setModel(modelo);//la tabla se actualiza. HacerCalculos(r);
        }catch (SQLException ex){
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            }
        
        public static String extraerIdMax(){
            
            String sql = "SELECT MAX(Id_ca)FROM CARGOS";
            int Id_ca=0;
            
            try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                Id_ca = rs.getInt(1);    
            }
            if(Id_ca == 0){
                Id_ca =1;
            }else{
                Id_ca = Id_ca +1;
                
            }
            
            return String.valueOf(Id_ca);
        }catch (SQLException ex){
            return null;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         public static boolean isRegisterLocal(Sentencias s){
        String sql = Sentencias.REGISTRAR_LOCAL;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, s.getNombre_L());
        ps.setString(2, s.getDireccion_L());
        ps.setString(3, s.getRTN_L());
        ps.setString(4, s.getTelefono_L());
        ps.setString(5, s.getTelefono2_L());
        
        
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public static boolean isUpdateLocal(Sentencias s){
        String sql = Sentencias.UPDATE_LOCAL;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, s.getNombre_L());
        ps.setString(2, s.getDireccion_L());
        ps.setString(3, s.getRTN_L());
        ps.setString(4, s.getTelefono_L());
        ps.setString(5, s.getTelefono2_L());
        ps.setInt(6, s.getId_L());
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
        public static boolean isDeleteLocal(Sentencias s){
        String sql = Sentencias.ELIMINAR_LOCAL;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, s.getId_L());
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public static void setListarLocal(String buscar){
            DefaultTableModel modelo = (DefaultTableModel)LOCAL_REGISTRO.tblLocal.getModel();
            //modelo.fireTableDataChanged();
            
            
            while(modelo.getRowCount() > 0 ){
                modelo.removeRow(0);
                
            }
            
            String sql = "";
            if(buscar.equals("")){
                sql = Sentencias.LISTARLOCAL;
                
            } 
            else{
                sql = "SELECT * FROM LOCAL_MP WHERE ("
                        + "Id_ca LIKE'"+buscar+"%' OR "
                        + "Tipo_ca LIKE'"+buscar+"%' OR "
                        + "Nombre_ca LIKE'"+buscar+"%' OR "
                       + "Funciones_ca LIKE'"+buscar+"%' OR " 
                        + "Sueldos_ca LIKE'"+buscar+"%'"
                       + ")";
//                        + "Nombre_ca LIKE'"+buscar+"%'"
//                        + ")";
            }
            
        
        String datos[] = new String[6];
        
        try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString("Id_L");
                datos[1] = rs.getString("Nombre_L");
                datos[2] = rs.getString("RTN_L");
                datos[3] = rs.getString("Telefono_L");
                datos[4] = rs.getString("Telefono2_L");
                datos[5] = rs.getString("Direccion_L");
                modelo.addRow(datos);
                
            }
           // MOSTRARCARGO.tblCa.setModel(modelo);//la tabla se actualiza. HacerCalculos(r);
        }catch (SQLException ex){
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            }
        
        public static String extraerIdMaxLocal(){
            
            String sql = "SELECT MAX(Id_L)FROM LOCAL_MP";
            int Id_L=0;
            
            try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                Id_L = rs.getInt(1);    
            }
            if(Id_L == 0){
                Id_L =1;
            }else{
                Id_L = Id_L +1;
                
            }
            
            return String.valueOf(Id_L);
        }catch (SQLException ex){
            return null;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        }
        
        
        
}
