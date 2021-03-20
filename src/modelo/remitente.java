/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class remitente {
     Conexion fe= new Conexion();
    String nombres;
    String cedula;
    String correo;
    String apellido;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public boolean registrarRemitente(){
         Connection cn=fe.meConexion();
                
            PreparedStatement pst=null;
            try {
            String sql = "INSERT INTO remitentes (nombres,cedula,apellido) VALUES (?,?,?)";
            
            pst = cn.prepareStatement(sql);
            
             pst.setString(1, nombres);
             pst.setString(2, cedula);
             pst.setString(3, apellido);
             
            int n = pst.executeUpdate();
            if (n > 0)
                {
                   
                   return true;          
                }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
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
