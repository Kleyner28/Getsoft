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
public class reponderDpto {

/**
 *
 * @author PC
 */

    Conexion fe= new Conexion();
    
    int id_envio;
    int id_remitente;
    int id_archivo_respuesta;
    int dpto;
    String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public int getDpto() {
        return dpto;
    }

    public void setDpto(int dpto) {
        this.dpto = dpto;
    }
    
    
        public Conexion getFe() {
            return fe;
        }

        public void setFe(Conexion fe) {
            this.fe = fe;
        }

        public int getId_envio() {
            return id_envio;
        }

        public void setId_envio(int id_envio) {
            this.id_envio = id_envio;
        }

        public int getId_remitente() {
            return id_remitente;
        }

        public void setId_remitente(int id_remitente) {
            this.id_remitente = id_remitente;
        }

        public int getId_archivo_respuesta() {
            return id_archivo_respuesta;
        }

        public void setId_archivo_respuesta(int id_archivo_respuesta) {
            this.id_archivo_respuesta = id_archivo_respuesta;
        }
    
    
    
    public boolean registrarEnvio(){
         Connection cn=fe.meConexion();
                
            PreparedStatement pst=null;
            try {
            String sql = "INSERT INTO respuestas_solicitudes (id_envio,fecha_respuesta,id_archivo_respuesta,id_dpto_responde,"
                    + "descripcion) VALUES (?,?"
                    + ",?,?,?)";
            
            pst = cn.prepareStatement(sql);
            
             pst.setInt(1, id_envio);
             java.util.Date d = new java.util.Date(); 
           java.sql.Date date2 = new java.sql.Date(d.getTime());
             pst.setDate(2, date2);
             pst.setInt(3, id_archivo_respuesta);
             pst.setInt(4, dpto);
             pst.setString(5, descripcion);
             
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


