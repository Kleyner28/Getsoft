/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getsoft;

import controller.ControllerLogin;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import views.login;
import views.main;

/**
 *
 * @author klein
 */
public class GetSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login l=new login();
        ControllerLogin c=new ControllerLogin(l);
        l.setVisible(true);
//        main ma = new main();
//        ma.setVisible(true); 
        
       
    }
    
}
