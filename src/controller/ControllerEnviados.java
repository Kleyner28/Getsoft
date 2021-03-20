/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import modelo.leerDatos;
import views.main;


/**
 *
 * @author PC
 */
public class ControllerEnviados implements ActionListener{
    private main proceso;
    
    public ControllerEnviados(main proce){
        proceso=proce;
        proceso.btnBuscarEnv.addActionListener(this);
//        login.btnSalir.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        leerDatos leer=new leerDatos();
        if(ae.getSource()==proceso.btnBuscarEnv){
            
            
         if(datoCombo(proceso.comboDptoEnv)!="Todos..."){
                leer.tablaEnviadosSecreFiltro(proceso.tablaEnv, id_dpto_filtro(proceso.comboDptoEnv));
            }else{
                leer.todosProcesosEnviadosSecretaria(proceso.tablaEnv);
            }  
            
        }
    }
    public String datoCombo(JComboBox combo1){
        String dato = (String) combo1.getSelectedItem();
        return dato;
    }
    public String id_dpto_filtro(JComboBox caja){
        String sql="";
            if(datoCombo(caja).equals("Todos...")){
                sql=";";
            }else{
            if(datoCombo(caja).equals("Administrativo")){
                sql="WHERE id_dpto_envio=2";
            }else{
                if(datoCombo(caja).equals("Financiero")){
                sql="WHERE id_dpto_envio=3";
            }else{
                    if(datoCombo(caja).equals("Resolucion de problemas")){
                sql="WHERE id_dpto_envio=4";
                    }
                }
            }
            }
            return sql;
    }
}
