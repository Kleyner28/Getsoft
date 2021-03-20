/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
     private static Connection conn;
    
    
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password ="root";
    private static final String url="jdbc:mysql://localhost:3306/tienda_de_ropa_beta";

    public Conexion() {
        
    }
    
    public Connection meConexion (){
         conn = null;
    try {
       
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestor_de_archivo","root","root");
        System.out.println("coectado");
    }
    catch (Exception e) {
        try {
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestor_de_archivo","root",""); 
           System.out.println("coectado");
        } catch (Exception er) {
             e.printStackTrace(System.out);
        JOptionPane.showMessageDialog(null, "Error al intentar conectar a la base de datos",
                "Avise a soporte",JOptionPane.ERROR_MESSAGE);
       
        System.exit(0);
        }
  
    }
   
    return conn;
        
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar() throws SQLException{
        conn=null;
        meConexion().close();
        conn.close();
            if(conn.isClosed()){
                System.out.println("cerradisimo");
            }
    }
    
}
