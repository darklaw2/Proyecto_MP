/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomp;

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
    
    
    
    //sentencias prosuctos
    
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
    

   
    
    
}










