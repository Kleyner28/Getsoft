/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class metodosBD {
    Conexion fe= new Conexion();
    public int idPrioridad (String prioridad){
        int id_prio=0;
    Connection cn=fe.meConexion();
    ResultSet resultado = null;
    Statement st = null;
       
        try {
          String sql = "SELECT id_prioridad FROM prioridades WHERE descripcion='"+prioridad+"'";
           
          st = cn.createStatement();  
          resultado = st.executeQuery(sql);
          
          while(resultado.next()){
              
              id_prio=resultado.getInt("id_prioridad");
          }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                resultado.close();
                cn.close();
                fe.desconectar();
                
            } catch (Exception ex) {
            }
    
    }
    return id_prio;
    }
   public int sacarUltimoCliente (String identificacion){
        int id_prio=0;
    Connection cn=fe.meConexion();
    ResultSet resultado = null;
    Statement st = null;
       
        try {
          String sql = "SELECT id_remitente FROM remitentes WHERE cedula='"+identificacion+"'";
           
          st = cn.createStatement();  
          resultado = st.executeQuery(sql);
          
          while(resultado.next()){
              
              id_prio=resultado.getInt("id_remitente");
          }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                resultado.close();
                cn.close();
                fe.desconectar();
                
            } catch (Exception ex) {
            }
    
    }
    return id_prio;
    }
   
   
   
   public int idUltimoRemitwntw(){
        int id_prio=0;
    Connection cn=fe.meConexion();
    ResultSet resultado = null;
    Statement st = null;
       
        try {
          String sql = "SELECT `id_remitente`\n" +
"FROM remitentes\n" +
"ORDER by `id_remitente` DESC\n" +
"LIMIT 1";
           
          st = cn.createStatement();  
          resultado = st.executeQuery(sql);
          
          while(resultado.next()){
              
              id_prio=resultado.getInt("id_remitente");
          }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                resultado.close();
                cn.close();
                fe.desconectar();
                
            } catch (Exception ex) {
            }
    
    }
    return id_prio;
    }
   public int idUltimoArchivo(){
        int id_prio=0;
    Connection cn=fe.meConexion();
    ResultSet resultado = null;
    Statement st = null;
       
        try {
          String sql = "SELECT `id_archivo`\n" +
            "FROM archivos\n" +
            "ORDER by `id_archivo` DESC\n" +
            "LIMIT 1";
           
          st = cn.createStatement();  
          resultado = st.executeQuery(sql);
          
          while(resultado.next()){
              
              id_prio=resultado.getInt("id_archivo");
          }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                st.close();
                resultado.close();
                cn.close();
                fe.desconectar();
                
            } catch (Exception ex) {
            }
    
    }
    return id_prio;
    }
}
