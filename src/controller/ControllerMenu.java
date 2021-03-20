/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.leerDatos;
import views.main;


/**
 *
 * @author PC
 */
public class ControllerMenu implements ActionListener{
    private main proceso;
    public ControllerMenu(main proce){
//        proceso=proce;
//        proceso.btnBuscarSec.addActionListener(this);
////        login.btnSalir.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
//        if(ae.getSource()==proceso.btnBuscarSec){
//            leerDatos leer=new leerDatos();
//            leer.todosProcesosEnviadosSecretaria(proceso.jTable1);
//        }
    }
    
}
