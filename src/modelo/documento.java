/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */

public class documento {
     Conexion fe= new Conexion();
    String nombrepdf;
    byte[] archivopdf;
    
    public String getNombrepdf() {
        return nombrepdf;
    }

    public void setNombrepdf(String nombrepdf) {
        this.nombrepdf = nombrepdf;
    }

    public byte[] getArchivopdf() {
        return archivopdf;
    }

    public void setArchivopdf(byte[] archivopdf) {
        this.archivopdf = archivopdf;
    }
    
   public boolean registrarArchivo(){
         Connection cn=fe.meConexion();
                
            PreparedStatement pst=null;
            try {
            String sql = "INSERT INTO archivos (nombre_archivo,archivo) VALUES (?,?)";
            
            pst = cn.prepareStatement(sql);
            
             pst.setString(1, nombrepdf);
             pst.setBytes(2, archivopdf);
             int n = pst.executeUpdate();
            if (n > 0)
                {
                   
                   return true;          
                }
            
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        } finally {
            try {
                pst.close();
                cn.close();
//                fe.desconectar();
            } catch (Exception ex) {
            }
        }
     return false;   
    }
}
