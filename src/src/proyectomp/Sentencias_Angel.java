/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomp;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/**
 *
 * @author angel
 */
public class Sentencias_Angel {
     public static String LISTAR = "SELECT * FROM CLIENTES";
    public static String REGISTRAR = "INSERT INTO CLIENTES("
            +"Telefono_CL,"+"Nombre_CL,"+"Apellidos_CL,"+"Direccion_CL)"
            +"VALUES(?,?,?,?)";
//     public static String UPDATE = "UPDATE CARGOS SET("
//            +"Tipo_ca,"+"Nombre_ca,"+"Funciones_ca,"+"Sueldos_ca,"+"WHERE Id_ca)"
//            +"VALUES(?,?,?,?,?)";
   public static String UPDATE = "UPDATE CLIENTES SET "
             +"Telefono_CL =?,"
           +"Nombre_CL=?,"
           +"Apellidos_CL=?,"
           +"Direccion_CL=? "
            +"WHERE Telefono_CL=?"; 
   // public static String UPDATE =("UPDATE personal SET Nombre='"+"' , Apellidos= '"+"',Telefono= '"+"', Email= '"+"' WHERE Identificador="+"?");
    
    public static String ELIMINAR = "DELETE FROM CLIENTES WHERE Telefono_CL=?";
    
    private String Telefono_CL;
    private String Nombre_CL;
    private String Apellidos_CL;
    private String Direccion_CL;

    public Sentencias_Angel() {
        this.Telefono_CL = Telefono_CL;
        this.Nombre_CL = Nombre_CL;
        this.Apellidos_CL = Apellidos_CL;
        this.Direccion_CL = Direccion_CL;
    }

    public String getTelefono_CL() {
        return Telefono_CL;
    }

    public void setTelefono_CL(String Telefono_CL) {
        this.Telefono_CL = Telefono_CL;
    }

    public String getNombre_CL() {
        return Nombre_CL;
    }

    public void setNombre_CL(String Nombre_CL) {
        this.Nombre_CL = Nombre_CL;
    }

    public String getApellidos_CL() {
        return Apellidos_CL;
    }

    public void setApellidos_CL(String Apellidos_CL) {
        this.Apellidos_CL = Apellidos_CL;
    }

    public String getDireccion_CL() {
        return Direccion_CL;
    }

    public void setDireccion_CL(String Direccion_CL) {
        this.Direccion_CL = Direccion_CL;
    }           
    
    
    
    //sentencias productos
    
      public static String LISTAR_P = "SELECT * FROM PRODUCTOS";
    public static String REGISTRAR_P = "INSERT INTO PRODUCTOS("
            +"Nombre_P,"+"Precio_P,"+"Descripcion_P,"+"Tamanio_P,"+"Num_Piezas_P,"+"Existencia_P)"
            +"VALUES(?,?,?,?,?,?)";
//     public static String UPDATE = "UPDATE CARGOS SET("
//            +"Tipo_ca,"+"Nombre_ca,"+"Funciones_ca,"+"Sueldos_ca,"+"WHERE Id_ca)"
//            +"VALUES(?,?,?,?,?)";
   public static String UPDATE_P = "UPDATE PRODUCTOS SET "
             +"Nombre_P =?,"
           +"Precio_P=?,"
           +"Descripcion_P=?,"
           +"Tamanio_P=?,"
           +"Num_Piezas_P=?,"
           +"Existencia_P=? "
            +"WHERE Id_P=?"; 
   // public static String UPDATE =("UPDATE personal SET Nombre='"+"' , Apellidos= '"+"',Telefono= '"+"', Email= '"+"' WHERE Identificador="+"?");
    
    public static String ELIMINAR_P = "DELETE FROM PRODUCTOS WHERE Id_P=?";
    
    private int Id_P;
    private String Nombre_P;
    private double Precio_P;
    private String Descripcion_P;
    private String Tamanio_P;
    private String Num_Piezas_P;
    private int Existencia_P;

    public int getId_P() {
        return Id_P;
    }

    public void setId_P(int Id_P) {
        this.Id_P = Id_P;
    }

    public String getNombre_P() {
        return Nombre_P;
    }

    public void setNombre_P(String Nombre_P) {
        this.Nombre_P = Nombre_P;
    }

    public double getPrecio_P() {
        return Precio_P;
    }

    public void setPrecio_P(double Precio_P) {
        this.Precio_P = Precio_P;
    }

    public String getDescripcion_P() {
        return Descripcion_P;
    }

    public void setDescripcion_P(String Descripcion_P) {
        this.Descripcion_P = Descripcion_P;
    }

    public String getTamanio_P() {
        return Tamanio_P;
    }

    public void setTamanio_P(String Tamanio_P) {
        this.Tamanio_P = Tamanio_P;
    }

    public String getNum_Piezas_P() {
        return Num_Piezas_P;
    }

    public void setNum_Piezas_P(String Num_Piezas_P) {
        this.Num_Piezas_P = Num_Piezas_P;
    }

    public int getExistencia_P() {
        return Existencia_P;
    }

    public void setExistencia_P(int Existencia_P) {
        this.Existencia_P = Existencia_P;
    }
    

   
    //sentencias Empleados
    
      public static String LISTAR_EM = "SELECT * FROM EMPLEADOS";
    public static String REGISTRAR_EM = "INSERT INTO EMPLEADOS("
            +"Nombres_E,"+"Apellidos_E,"+"Identidad_E,"+"Telefono_E,"+"Direccion_E,"+"Genero_E,"+"Tipo_Contrato_E,"+"Estado_E,"+"Referencia_E,"+"Telefono_Referencia_E,"+"Fecha_Nacimiento_E,"+"Fecha_Registro_E,"+"Fecha_Inicio_E,"+"Foto_E)"
            +"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//     public static String UPDATE = "UPDATE CARGOS SET("
//            +"Tipo_ca,"+"Nombre_ca,"+"Funciones_ca,"+"Sueldos_ca,"+"WHERE Id_ca)"
//            +"VALUES(?,?,?,?,?)";
   public static String UPDATE_EM = "UPDATE EMPLEADOS SET "
           +"Nombres_E=?,"
           +"Apellidos_E=?,"
           +"Identidad_E=?,"
           +"Telefono_E=?,"
           +"Direccion_E=?,"
           +"Genero_E=?,"
           +"Tipo_Contrato_E=?,"
           +"Estado_E=?,"
            + "Referencia_E=?,"
           +"Referencia_E=?,"
           +"Telefono_Referencia_E=?,"
           +"Fecha_Nacimiento_E=?,"
           +"Fecha_Registro=?,"
           +" Fecha_Inicio_E=?,"
            + "Foto_E=null "
            +"WHERE Id_E=?"; 
   // public static String UPDATE =("UPDATE personal SET Nombre='"+"' , Apellidos= '"+"',Telefono= '"+"', Email= '"+"' WHERE Identificador="+"?");
    
    public static String ELIMINAR_EM = "DELETE FROM EMPLEADOS WHERE Id_E=?";
    
    private int Id_E;
    private String Nombres_E;
    private String Apellidos_E;
    private String Identidad_E;
    private String Telefono_E;
    private String Direcion_E;
    private String Genero_E;
    private String Tipo_Contrato_E;
    private String Estado_E;
    private String Referencia_E;
    private String Telefono_Referencia_E;
    private String Fecha_Nac_E;
    private String Fecha_Reg_E;
    private String Fecha_Inicio_E;
    private String Foto_E;
//    private byte[] Foto_E;

    public int getId_E() {
        return Id_E;
    }

    public void setId_E(int Id_E) {
        this.Id_E = Id_E;
    }

    public String getNombres_E() {
        return Nombres_E;
    }

    public void setNombres_E(String Nombres_E) {
        this.Nombres_E = Nombres_E;
    }

    public String getApellidos_E() {
        return Apellidos_E;
    }

    public void setApellidos_E(String Apellidos_E) {
        this.Apellidos_E = Apellidos_E;
    }

    public String getIdentidad_E() {
        return Identidad_E;
    }

    public void setIdentidad_E(String Identidad_E) {
        this.Identidad_E = Identidad_E;
    }

    public String getTelefono_E() {
        return Telefono_E;
    }

    public void setTelefono_E(String Telefono_E) {
        this.Telefono_E = Telefono_E;
    }

    public String getDirecion_E() {
        return Direcion_E;
    }

    public void setDirecion_E(String Direcion_E) {
        this.Direcion_E = Direcion_E;
    }

    public String getGenero_E() {
        return Genero_E;
    }

    public void setGenero_E(String Genero_E) {
        this.Genero_E = Genero_E;
    }

    public String getTipo_Contrato_E() {
        return Tipo_Contrato_E;
    }

    public void setTipo_Contrato_E(String Tipo_Contrato_E) {
        this.Tipo_Contrato_E = Tipo_Contrato_E;
    }

    public String getEstado_E() {
        return Estado_E;
    }

    public void setEstado_E(String Estado_E) {
        this.Estado_E = Estado_E;
    }

    public String getReferencia_E() {
        return Referencia_E;
    }

    public void setReferencia_E(String Referencia_E) {
        this.Referencia_E = Referencia_E;
    }

    public String getTelefono_Referencia_E() {
        return Telefono_Referencia_E;
    }

    public void setTelefono_Referencia_E(String Telefono_Referencia_E) {
        this.Telefono_Referencia_E = Telefono_Referencia_E;
    }

    public String getFecha_Nac_E() {
        return Fecha_Nac_E;
    }

    public void setFecha_Nac_E(String Fecha_Nac_E) {
        this.Fecha_Nac_E = Fecha_Nac_E;
    }

    public String getFecha_Reg_E() {
        return Fecha_Reg_E;
    }

    public void setFecha_Reg_E(String Fecha_Reg_E) {
        this.Fecha_Reg_E = Fecha_Reg_E;
    }

    public String getFecha_Inicio_E() {
        return Fecha_Inicio_E;
    }

    public void setFecha_Inicio_E(String Fecha_Inicio_E) {
        this.Fecha_Inicio_E = Fecha_Inicio_E;
    }
    

//    public byte[] getFoto_E() {
//        return Foto_E;
//    }
//
//    public void setFoto_E(byte[] foto_E) {
//        this.Foto_E = foto_E;
//    }

    public String getFoto_E() {
        return Foto_E;
    }

    public void setFoto_E(String Foto_E) {
        this.Foto_E = Foto_E;
    }
    
    
    
}










