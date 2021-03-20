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
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class validacionesBD {
    Conexion fe= new Conexion();
    public int existeUser(String user, String contra){
         int dpto=0;
        Connection cn=fe.meConexion();
        ResultSet resultado = null;
        Statement st = null;
            try {
            
            st = cn.createStatement();
            String sql="SELECT id_dpto,user,contra FROM usuarios";
            resultado = st.executeQuery(sql);
            
            while(resultado.next()){
                String us=resultado.getString("user");
                String contr=resultado.getString("contra");
               if(user.equals(us) && contra.equals(contr)){
                    dpto=resultado.getInt("id_dpto");
               }
                 
               
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al cargar los Datos 2\n" + ex);
        }
	catch (Exception ex) {
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
         return dpto;
   }
      
}
