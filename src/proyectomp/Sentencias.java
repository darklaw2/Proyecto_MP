/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomp;

/**
 *
 * @author Calix
 */
public class Sentencias {
    
    //TODO ESTO ES DE CARGOS WE, NO TE CONFUNDAS.
    public static String LISTAR = "SELECT * FROM CARGOS";
    public static String REGISTRAR = "INSERT INTO CARGOS("
            +"Tipo_ca,"+"Nombre_ca,"+"Funciones_ca,"+"Sueldos_ca)"
            +"VALUES(?,?,?,?)";
    
//     public static String REGISTRAR = "{call Insertar_Cargo (?,?,?,?)}";
    
    
//     public static String UPDATE = "UPDATE CARGOS SET("
//            +"Tipo_ca,"+"Nombre_ca,"+"Funciones_ca,"+"Sueldos_ca,"+"WHERE Id_ca)"
//            +"VALUES(?,?,?,?,?)";
   public static String UPDATE = "UPDATE CARGOS SET "
             +"Tipo_ca =?,"
           +"Nombre_ca=?,"
           +"Funciones_ca=?,"
           +"Sueldos_ca=? "
            +"WHERE Id_ca=?"; 
   // public static String UPDATE =("UPDATE personal SET Nombre='"+"' , Apellidos= '"+"',Telefono= '"+"', Email= '"+"' WHERE Identificador="+"?");
    
    public static String ELIMINAR = "DELETE FROM CARGOS WHERE Id_ca=?";
    private int Id_ca;
    private String Tipo_ca;
    private String Nombre_ca;
    private String Funciones_ca;
    private double Sueldos_ca;

    public int getId_ca() {
        return Id_ca;
    }

    public void setId_ca(int Id_ca) {
        this.Id_ca = Id_ca;
    }

    

    public String getTipo_ca() {
        return Tipo_ca;
    }

    public void setTipo_ca(String Tipo_ca) {
        this.Tipo_ca = Tipo_ca;
    }

    public String getNombre_ca() {
        return Nombre_ca;
    }

    public void setNombre_ca(String Nombre_ca) {
        this.Nombre_ca = Nombre_ca;
    }

    public String getFunciones_ca() {
        return Funciones_ca;
    }

    public void setFunciones_ca(String Funciones_ca) {
        this.Funciones_ca = Funciones_ca;
    }

    public double getSueldos_ca() {
        return Sueldos_ca;
    }

    public void setSueldos_ca(double Sueldos_ca) {
        this.Sueldos_ca = Sueldos_ca;
    }
    
    
    
    
    
    
    
    
    
    
    //TODO ESTO ES DE LOCAL
    public static String LISTARLOCAL = "SELECT * FROM LOCAL_MP";
    public static String REGISTRAR_LOCAL = "INSERT INTO LOCAL_MP("
            +"Nombre_L,"+"Direccion_L,"+"RTN_L,"+"Telefono_L,"+"Telefono2_L)"
            +"VALUES(?,?,?,?,?)";
            
       public static String UPDATE_LOCAL = "UPDATE LOCAL_MP SET "
           +"Nombre_L= ?,"
           +"Direccion_L=?,"
           +"RTN_L=?,"
           +"Telefono_L=?,"
           +"Telefono2_L=? "
            +"WHERE Id_L=?";
       
       //public static String DELETE_LOCAL = "DELETE FROM LOCAL_MP WHERE Id_L=?";
        public static String ELIMINAR_LOCAL = "DELETE FROM LOCAL_MP WHERE Id_L=?";
           
       
       private int Id_L;
       private String Nombre_L;
       private String Direccion_L;
       private String RTN_L;
       private String Telefono_L;
       private String Telefono2_L;

    public int getId_L() {
        return Id_L;
    }

    public void setId_L(int Id_L) {
        this.Id_L = Id_L;
    }

    public String getNombre_L() {
        return Nombre_L;
    }

    public void setNombre_L(String Nombre_L) {
        this.Nombre_L = Nombre_L;
    }

    public String getDireccion_L() {
        return Direccion_L;
    }

    public void setDireccion_L(String Direccion_L) {
        this.Direccion_L = Direccion_L;
    }

    public String getTelefono_L() {
        return Telefono_L;
    }

    public void setTelefono_L(String Telefono_L) {
        this.Telefono_L = Telefono_L;
    }

    public String getTelefono2_L() {
        return Telefono2_L;
    }

    public void setTelefono2_L(String Telefono2_L) {
        this.Telefono2_L = Telefono2_L;
    }

    public String getRTN_L() {
        return RTN_L;
    }

    public void setRTN_L(String RTN_L) {
        this.RTN_L = RTN_L;
    }
    
    
       
       
    
}
