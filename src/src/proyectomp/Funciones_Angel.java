/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomp;

import proyectomp.Mostrar_Clientes;
import proyectomp.EMPLEADOS;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angel
 */
public class Funciones_Angel {
      private static conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConexion();
    private  static PreparedStatement ps = null;
    
    public static boolean isRegister(Sentencias_Angel s){
        String sql = Sentencias_Angel.REGISTRAR;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, s.getTelefono_CL());
        ps.setString(2, s.getNombre_CL());
        ps.setString(3, s.getApellidos_CL());
        ps.setString(4, s.getDireccion_CL());
        
        
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public static boolean isUpdate(Sentencias_Angel s){
        String sql = Sentencias_Angel.UPDATE;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, s.getTelefono_CL());
        ps.setString(2, s.getNombre_CL());
        ps.setString(3, s.getApellidos_CL());
        ps.setString(4, s.getDireccion_CL());
        ps.setString(5, s.getTelefono_CL());
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
        public static boolean isDelete(Sentencias_Angel s){
        String sql = Sentencias_Angel.ELIMINAR;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, s.getTelefono_CL());
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public static void setListar(String buscar){
            DefaultTableModel modelo = (DefaultTableModel)Mostrar_Clientes.jTable1.getModel();
            modelo.fireTableDataChanged();
            
            while(modelo.getRowCount()>0){
                modelo.removeRow(0);
                
            }
            
            String sql = "";
            if(buscar.equals("")){
                sql = Sentencias_Angel.LISTAR;
                
            } 
            else{
                sql = "SELECT * FROM CLIENTES WHERE ("
                      //  + "Id_ca LIKE' "+buscar+"%' OR "
                       // + "Tipo_ca LIKE' "+buscar+"%' OR "
//                        + "Nombre_ca LIKE' "+buscar+"%' OR "
 //                       + "Funciones_ca LIKE' "+buscar+"%' OR "
//                        + "Sueldos_ca LIKE'"+buscar+"%'"
//                        + ")";
                        + "Nombre_CL LIKE'"+buscar+"%'"
                        + ")";
            }
            
        
        String datos[] = new String[5];
        
        try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString("Telefono_CL");
                datos[1] = rs.getString("Nombre_CL");
                datos[2] = rs.getString("Apellidos_CL");
                datos[3] = rs.getString("Direccion_CL");
                modelo.addRow(datos);
                
            }
        }catch (SQLException ex){
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            }
        
      /*  public static String extraerIdMax(){
            
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
        }*/
        
        

        
        
        
        
        
        //funciones productos
    
         public static boolean isRegister_P(Sentencias_Angel s){
        String sql = Sentencias_Angel.REGISTRAR_P;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, s.getNombre_P());
        ps.setDouble(2, s.getPrecio_P());
        ps.setString(3, s.getDescripcion_P());
        ps.setString(4, s.getTamanio_P());
        ps.setString(5, s.getNum_Piezas_P());
        ps.setInt(6, s.getExistencia_P());
        
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public static boolean isUpdate_P(Sentencias_Angel s){
        String sql = Sentencias_Angel.UPDATE_P;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, s.getNombre_P());
        ps.setDouble(2, s.getPrecio_P());
        ps.setString(3, s.getDescripcion_P());
        ps.setString(4, s.getTamanio_P());
        ps.setString(5, s.getNum_Piezas_P());
        ps.setInt(6, s.getExistencia_P());
        ps.setInt(7, s.getId_P());
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
        public static boolean isDelete_P(Sentencias_Angel s){
        String sql = Sentencias_Angel.ELIMINAR_P;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, s.getId_P());
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public static void setListar_P(String buscar){
            DefaultTableModel modelo = (DefaultTableModel)MOSTRAR_PRODUCTOS.jTable1.getModel();
            modelo.fireTableDataChanged();
            
            while(modelo.getRowCount()>0){
                modelo.removeRow(0);
                
            }
            
            String sql = "";
            if(buscar.equals("")){
                sql = Sentencias_Angel.LISTAR_P;
                
            } 
            else{
                sql = "SELECT * FROM PRODUCTOS WHERE ("
                      //  + "Id_ca LIKE' "+buscar+"%' OR "
                       // + "Tipo_ca LIKE' "+buscar+"%' OR "
//                        + "Nombre_ca LIKE' "+buscar+"%' OR "
 //                       + "Funciones_ca LIKE' "+buscar+"%' OR "
//                        + "Sueldos_ca LIKE'"+buscar+"%'"
//                        + ")";
                        + "Nombre_P LIKE'"+buscar+"%'"
                        + ")";
            }
            
        
        String datos[] = new String[7];
        
        try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString("Id_P");
                datos[1] = rs.getString("Nombre_P");
                datos[2] = rs.getString("Precio_P");
                datos[3] = rs.getString("Descripcion_P");
                datos[4] = rs.getString("Tamanio_P");
                datos[5] = rs.getString("Num_Piezas_P");
                datos[6] = rs.getString("Existencia_P");
                modelo.addRow(datos);
                
            }
        }catch (SQLException ex){
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            }
        
        public static String extraerIdMax(){
            
            String sql = "SELECT MAX(Id_P)FROM PRODUCTOS";
            int Id_P=0;
            
            try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                Id_P = rs.getInt(1);    
            }
            if(Id_P == 0){
                Id_P =1;
            }else{
                Id_P = Id_P +1;
                
            }
            
            return String.valueOf(Id_P);
        }catch (SQLException ex){
            return null;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        }
        
        
        
        
        
        //FUNCIONES EMPLEADOS
         public static boolean isRegister_EM(Sentencias_Angel s){
        String sql = Sentencias_Angel.REGISTRAR_EM;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, s.getNombres_E());
        ps.setString(2, s.getApellidos_E());
        ps.setString(3, s.getIdentidad_E());
        ps.setString(4, s.getTelefono_E());
        ps.setString(5, s.getDirecion_E());
        ps.setString(6, s.getGenero_E());
        ps.setString(7, s.getTipo_Contrato_E());
        ps.setString(8, s.getEstado_E());
        ps.setString(9, s.getReferencia_E());
        ps.setString(10, s.getTelefono_Referencia_E());
        ps.setString(11, s.getFecha_Nac_E());
//        ps.setString(11, s.getFecha_Nac_E());
        ps.setString(12, s.getFecha_Reg_E());
        ps.setString(13, s.getFecha_Inicio_E());
        ps.setString(14, s.getFoto_E());
//       ps.setByte(14, s.getFoto_E());
        
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public static boolean isUpdate_EM(Sentencias_Angel s){
        String sql = Sentencias_Angel.UPDATE_EM;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, s.getNombres_E());
        ps.setString(2, s.getApellidos_E());
        ps.setString(3, s.getIdentidad_E());
        ps.setString(4, s.getTelefono_E());
        ps.setString(5, s.getDirecion_E());
        ps.setString(6, s.getGenero_E());
        ps.setString(7, s.getTipo_Contrato_E());
        ps.setString(8, s.getEstado_E());
        ps.setString(9, s.getReferencia_E());
        ps.setString(10, s.getTelefono_Referencia_E());
        ps.setString(11, s.getFecha_Nac_E());
        ps.setString(12, s.getFecha_Reg_E());
        ps.setString(13, s.getFecha_Inicio_E());
    //  ps.setByte(14, s.getFoto_E());
        ps.setInt(15, s.getId_E());
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
        public static boolean isDelete_EM(Sentencias_Angel s){
        String sql = Sentencias_Angel.ELIMINAR_EM;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, s.getId_E());
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public static void setListar_EM(String buscar){
            DefaultTableModel modelo = (DefaultTableModel)EMPLEADOS.tblTabla.getModel();
            modelo.fireTableDataChanged();
            
            while(modelo.getRowCount()>0){
                modelo.removeRow(0);
                
            }
            
            String sql = "";
            if(buscar.equals("")){
                sql = Sentencias_Angel.LISTAR_EM;
                
            } 
            else{
                sql = "SELECT * FROM PRODUCTOS WHERE ("
                      //  + "Id_ca LIKE' "+buscar+"%' OR "
                       // + "Tipo_ca LIKE' "+buscar+"%' OR "
//                        + "Nombre_ca LIKE' "+buscar+"%' OR "
 //                       + "Funciones_ca LIKE' "+buscar+"%' OR "
//                        + "Sueldos_ca LIKE'"+buscar+"%'"
//                        + ")";
                        + "Nombres_E LIKE'"+buscar+"%'"
                        + ")";
            }
            
        
        String datos[] = new String[15];
        
        try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString("Id_E");
                datos[1] = rs.getString("Nombres_E");
                datos[2] = rs.getString("Apellidos_E");
                datos[3] = rs.getString("Identidad_E");
                datos[4] = rs.getString("Telefono_E");
                datos[5] = rs.getString("Direccion_E");
                datos[6] = rs.getString("Genero_E");
                datos[7] = rs.getString("Tipo_Contrato_E");
                datos[8] = rs.getString("Estado_E");
                datos[9] = rs.getString("Referencia_E");
                datos[10] = rs.getString("Telefono_Referencia_E");
                datos[11] = rs.getString("Fecha_Nacimiento_E");
                datos[12] = rs.getString("Fecha_Registro_E");
                datos[13] = rs.getString("Fecha_Inicio_E");
                datos[14] = rs.getString("Foto_E");
                modelo.addRow(datos);
                
            }
        }catch (SQLException ex){
            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            }
        
        public static String extraerIdMaxEM(){
            
            String sql = "SELECT MAX(Id_P)FROM EMPLEADOS";
            int Id_E=0;
            
            try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                Id_E = rs.getInt(1);    
            }
            if(Id_E == 0){
                Id_E =1;
            }else{
                Id_E = Id_E +1;
                
            }
            
            return String.valueOf(Id_E);
        }catch (SQLException ex){
            return null;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        }
        
//             public void insetarFecha(){
//       String sql = "INSERT INTO EMPLEADOS("
//            +"Fecha_Nacimiento_E)"
//            +"VALUES(?)";
//         try {
//        
//             PreparedStatement pst = conexion.Conexion.conection.prepareStatement(sql);
//             
//             pst.setString(11, ((JTextField)calendarNac.getDateEditor().getUiComponent()).getText());
//             
//             pst.execute();
//             
//             JOptionPane.showConfirmDialog(null, "Fecha agregada");
//         } catch (Exception e) {
//             
//             JOptionPane.showConfirmDialog(null, "Error" + e.getMessage());
//         }
//     }
}


