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
public class enviar {
    Conexion fe= new Conexion();
    int archivo;
    int dpto;
    int id_prioridad;
    int id_remitente;
    String descripcion;
    //int id_estado;
    
    public int getArchivo() {
        return archivo;
    }

    public void setArchivo(int archivo) {
        this.archivo = archivo;
    }

    public int getDpto() {
        return dpto;
    }

    public void setDpto(int dpto) {
        this.dpto = dpto;
    }

    public int getId_prioridad() {
        return id_prioridad;
    }

    public void setId_prioridad(int id_prioridad) {
        this.id_prioridad = id_prioridad;
    }

    public int getId_remitente() {
        return id_remitente;
    }

    public void setId_remitente(int id_remitente) {
        this.id_remitente = id_remitente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean registrarEnvio(){
         Connection cn=fe.meConexion();
                
            PreparedStatement pst=null;
            try {
            String sql = "INSERT INTO envios_archivos (id_remitente,id_archivo,id_prioridad,id_dpto_envio,id_estado,descripcion,fecha_envio) VALUES (?,?"
                    + ",?,?,?,?,?)";
            
            pst = cn.prepareStatement(sql);
            
             pst.setInt(1, id_remitente);
             pst.setInt(2, archivo);
             pst.setInt(3, id_prioridad);
             pst.setInt(4, dpto);
             pst.setInt(5, 1); // id_estado
             pst.setString(6, descripcion);
             java.util.Date d = new java.util.Date(); 
           java.sql.Date date2 = new java.sql.Date(d.getTime());
           pst.setDate(7, date2);
            int n = pst.executeUpdate();
            if (n > 0)
                {
                   
                   return true;          
                }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
                System.out.println("aqui fallo");
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
