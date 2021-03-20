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
public class ControllerRecibidos implements ActionListener{
    private main proceso;
    
    public ControllerRecibidos(main proce){
        proceso=proce;
        proceso.btnBuscarRec.addActionListener(this);
//        login.btnSalir.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        leerDatos leer=new leerDatos();
        if(ae.getSource()==proceso.btnBuscarRec){
            if(proceso.nombreForm.getText()=="Secretaria"){
                if(datoCombo(proceso.comboDptoRec)!="Todos..."){
                leer.tablaEnviadosSecreFiltro(proceso.tablaRecibidos, id_dpto_filtro(proceso.comboDptoRec));
               }else{
                leer.todosProcesosRecbidosSecretaria(proceso.tablaRecibidos);
            } 
                
            }else{
                //--------------------------------------------
                if(proceso.nombreForm.getText()=="Administrativo"){
                    
                 leer.todosProcesosRecbidosDpto(proceso.tablaRecibidos, 2);
            
                 
                    
                    
                }else{
                    //--------------------------------------------
                    if(proceso.nombreForm.getText()=="Financiero"){
                       
                 leer.todosProcesosRecbidosDpto(proceso.tablaRecibidos, 3);
                
            
                    }else{
                       
                       //-------------------------------------------- 
                        if(proceso.nombreForm.getText()=="Solucion de problemas"){
                             leer.todosProcesosRecbidosDpto(proceso.tablaRecibidos, 4);
                        }
                    }
                }
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
                    if(datoCombo(caja).equals("Resolucion de problema")){
                sql="WHERE id_dpto_envio=4";
                    }
                }
            }
            }
            return sql;
    }
}
