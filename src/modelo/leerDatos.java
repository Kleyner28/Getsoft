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
public class leerDatos {
     Conexion fe= new Conexion();
     public void todosProcesosEnviadosSecretaria (JTable tabla){
    Connection cn=fe.meConexion();
    ResultSet resultado = null;
    Statement st = null;
       
        try {
          String sql = "SELECT ea.id_envio,ea.fecha_envio,rm.apellido,es.descripcion as estad,rm.nombres,rm.cedula,dp.nombre_dpto,pr"
                  + ".descripcion as prio FROM envios_archivos ea INNER JOIN departamentos dp\n" +
            "ON dp.id_dpto = ea.id_dpto_envio\n" +
            "INNER JOIN prioridades pr\n" +
            "ON ea.id_prioridad = pr.id_prioridad\n" +
            "INNER JOIN remitentes rm\n" +
            "ON rm.id_remitente = ea.id_remitente\n" +
            "INNER JOIN estados es\n" +
            "ON es.id_estado = ea.id_estado";
           
          st = cn.createStatement();  
          resultado = st.executeQuery(sql);
          DefaultTableModel miModelo = (DefaultTableModel) tabla.getModel();
          miModelo.setRowCount(0);
          while(resultado.next()){
              Object datos[] = new Object[8];
              datos[0]=resultado.getInt("id_envio");
              datos[1]=resultado.getString("cedula");
              datos[2]=resultado.getString("nombres");
              datos[3]=resultado.getString("apellido");
              datos[4]=resultado.getString("nombre_dpto");
              datos[5]=resultado.getString("fecha_envio");
              datos[6]=resultado.getString("estad");
              datos[7]=resultado.getString("prio");
              
              
              miModelo.addRow(datos);
              
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
    
    }}
     public void todosProcesosRecbidosSecretaria (JTable tabla){
    Connection cn=fe.meConexion();
    ResultSet resultado = null;
    Statement st = null;
       
        try {
          String sql = "SELECT pr.descripcion as prio, `id_respuesta`,re.cedula,re.nombres,re.apellido,d.nombre_dpto,rs.`fecha_respuesta`, e.descripcion as est FROM `respuestas_solicitudes` rs \n" +
"INNER JOIN departamentos d\n" +
"ON d.id_dpto = rs.id_dpto_responde\n" +
"INNER JOIN envios_archivos ev\n" +
"ON ev.id_envio = rs.`id_envio`\n" +
"INNER JOIN remitentes re\n" +
"ON re.id_remitente = ev.id_remitente\n" +
"INNER JOIN estados e\n" +
"ON e.id_estado = ev.id_estado\n" +
"INNER JOIN prioridades pr\n" +
"ON pr.id_prioridad = ev.id_prioridad";
          
            System.out.println("mi amor");
          st = cn.createStatement();  
          resultado = st.executeQuery(sql);
          DefaultTableModel miModelo = (DefaultTableModel) tabla.getModel();
          miModelo.setRowCount(0);
          while(resultado.next()){
              Object datos[] = new Object[8];
              datos[0]=resultado.getString("id_respuesta");
              datos[1]=resultado.getString("cedula");
              datos[2]=resultado.getString("nombres");
              datos[3]=resultado.getString("apellido");
              datos[4]=resultado.getString("nombre_dpto");
              datos[5]=resultado.getString("fecha_respuesta");
              datos[6]=resultado.getString("prio");
              datos[7]="Resuelto";
              
              
              miModelo.addRow(datos);
              
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
    
    }}
     
     
     
    public void tablaEnviadosSecreFiltro (JTable tabla,String sql2){
    Connection cn=fe.meConexion();
    ResultSet resultado = null;
    Statement st = null;
       
        try {
          String sql = "SELECT ea.id_envio,ea.fecha_envio,rm.apellido,es.descripcion as estad,rm.nombres,rm.cedula,dp.nombre_dpto,pr"
                  + ".descripcion as prio FROM envios_archivos ea INNER JOIN departamentos dp\n" +
            "ON dp.id_dpto = ea.id_dpto_envio\n" +
            "INNER JOIN prioridades pr\n" +
            "ON ea.id_prioridad = pr.id_prioridad\n" +
            "INNER JOIN remitentes rm\n" +
            "ON rm.id_remitente = ea.id_remitente\n" +
            "INNER JOIN estados es\n" +
            "ON es.id_estado = ea.id_estado "
                  + " "+sql2+"";
           
          st = cn.createStatement();  
          resultado = st.executeQuery(sql);
          DefaultTableModel miModelo = (DefaultTableModel) tabla.getModel();
          miModelo.setRowCount(0);
          while(resultado.next()){
              Object datos[] = new Object[8];
              datos[0]=resultado.getString("id_envio");
              datos[1]=resultado.getString("cedula");
              datos[2]=resultado.getString("nombres");
              datos[3]=resultado.getString("apellido");
              datos[4]=resultado.getString("nombre_dpto");
              datos[5]=resultado.getString("fecha_envio");
              datos[6]=resultado.getString("estad");
              datos[7]=resultado.getString("prio");
              
              
              miModelo.addRow(datos);
              
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
    
    }}
    
    public void todosProcesosRecbidosDpto (JTable tabla,int idDpto){
    Connection cn=fe.meConexion();
    ResultSet resultado = null;
    Statement st = null;
       
        try {
          
            String sql = "SELECT ea.id_envio,ea.fecha_envio,rm.apellido,es.descripcion as estad,rm.nombres,rm.cedula,dp.nombre_dpto,pr"
                  + ".descripcion as prio FROM envios_archivos ea INNER JOIN departamentos dp\n" +
            "ON dp.id_dpto = ea.id_dpto_envio\n" +
            "INNER JOIN prioridades pr\n" +
            "ON ea.id_prioridad = pr.id_prioridad\n" +
            "INNER JOIN remitentes rm\n" +
            "ON rm.id_remitente = ea.id_remitente\n" +
            "INNER JOIN estados es\n" +
            "ON es.id_estado = ea.id_estado "
                    + "WHERE ea.id_dpto_envio="+idDpto+"";
            
          st = cn.createStatement();  
          resultado = st.executeQuery(sql);
          DefaultTableModel miModelo = (DefaultTableModel) tabla.getModel();
          miModelo.setRowCount(0);
          while(resultado.next()){
              Object datos[] = new Object[8];
              datos[0]=resultado.getString("id_envio");
              datos[1]=resultado.getString("cedula");
              datos[2]=resultado.getString("nombres");
              datos[3]=resultado.getString("apellido");
              datos[4]=resultado.getString("nombre_dpto");
              datos[5]=resultado.getString("fecha_envio");
              datos[6]=resultado.getString("estad");
              datos[7]=resultado.getString("prio");
              
              
              miModelo.addRow(datos);
              
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
    
    }}
    
    
//     public void todosProcesosEnviadosSecretariaFiltro (JTable tabla,String SQLdpto,String SQLprioridad,String prioridad){
//    Connection cn=fe.meConexion();
//    ResultSet resultado = null;
//    Statement st = null;
//       
//        try {
//          String sql = "SELECT ea.fecha_envio,es.descripcion as estad,rm.nombres,rm.cedula,dp.nombre_dpto,pr"
//                  + ".descripcion as prio FROM envios_archivos ea INNER JOIN departamentos dp\n" +
//            "ON dp.id_dpto = ea.id_dpto_envio\n" +
//            "INNER JOIN prioridades pr\n" +
//            "ON ea.id_prioridad = pr.id_prioridad\n" +
//            "INNER JOIN remitentes rm\n" +
//            "ON rm.id_remitente = ea.id_remitente\n" +
//            "INNER JOIN estados es\n" +
//            "ON es.id_estado = ea.id_estado "
//                  + "WHERE ";
//           
//          st = cn.createStatement();  
//          resultado = st.executeQuery(sql);
//          DefaultTableModel miModelo = (DefaultTableModel) tabla.getModel();
//          miModelo.setRowCount(0);
//          while(resultado.next()){
//              Object datos[] = new Object[6];
//              datos[0]=resultado.getString("cedula");
//              datos[1]=resultado.getString("nombres");
//              datos[3]=resultado.getString("nombre_dpto");
//              datos[2]=resultado.getString("fecha_envio");
//              datos[4]=resultado.getString("estad");
//              datos[5]=resultado.getString("prio");
//              
//              
//              miModelo.addRow(datos);
//              
//          }
//            
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            try {
//                st.close();
//                resultado.close();
//                cn.close();
//                fe.desconectar();
//                
//            } catch (Exception ex) {
//            }
//    
//    }}
}
