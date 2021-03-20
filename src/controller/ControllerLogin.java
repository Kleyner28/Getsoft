/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.validacionesBD;
import views.login;
import views.main;


/**
 *
 * @author PC
 */
public class ControllerLogin implements ActionListener{
    
    public login slogin;
    
    public ControllerLogin(login Flogin){
        slogin=Flogin;
        slogin.btnEntrar.addActionListener(this);
       
        
    }
    validacionesBD vali=new validacionesBD();
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==slogin.btnEntrar){
           
            char[] arrayC = slogin.cajaContra.getPassword();
          String pass = new String(arrayC);
          int id_dpto_user= vali.existeUser(slogin.cajaUser.getText(), pass);
            System.out.println("sss");
            if(id_dpto_user>0){
                
                main pri=new main();
                
                ControllerRecibidos cmenu=new ControllerRecibidos(pri);
                ControllerEnviados rec=new  ControllerEnviados(pri);
                ControllerSecreNuevo cmenuSecre=new ControllerSecreNuevo(pri);
                
                pri.setVisible(true);
                
                slogin.setVisible(false);
                if(id_dpto_user==1){
                    pri.nombreForm.setText("Secretaria");
                }else{
                    if(id_dpto_user==2){
                        ocultarCajasSecretaria(pri);
                    pri.nombreForm.setText("Administrativo");
                }else{
                    if(id_dpto_user==3){
                        ocultarCajasSecretaria(pri);
                    pri.nombreForm.setText("Financiero");
                }else{
                    if(id_dpto_user==4){
                        ocultarCajasSecretaria(pri);
                    pri.nombreForm.setText("Resolucion de problemas");
                }else{
                    
                }
                }
                }
                }
//                Menu menu=new Menu();
//              ControllerMenu controlMenu =new ControllerMenu(menu);
//              menu.setVisible(true);
        
            }else{
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        
    }
    public void ocultarCajasSecretaria(main pri){
        pri.identificacion.setVisible(false);
        
    }
}
