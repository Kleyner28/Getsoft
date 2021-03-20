package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.documento;
import modelo.enviar;
import modelo.metodosBD;
import modelo.remitente;
import modelo.reponderDpto;
import views.main;


/**
 *
 * @author PC
 */
public class ControllerNewDpto implements ActionListener{
    public main registro;
    public ControllerNewDpto(main regi){
        registro=regi;
      registro.btnEnviar.addActionListener(this); 
      registro.btnAdjuntar.addActionListener(this); 
      
//        login.btnSalir.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==registro.btnEnviar){
            try {
                
             metodosBD me=new metodosBD();
//            remitente re=new remitente();
            documento arc= new documento();
//            re.setCedula(registro.identificacion.getText());
//            re.setNombres(registro.nombre.getText());
//            re.setCorreo(registro.correo.getText());
//            re.setApellido(registro.apellido.getText());
//            re.registrarRemitente();
            
            arc.setNombrepdf(registro.nombreArchivo.getText());
           
            File ruta = new File(ruta_archivo);
            arc.setArchivopdf(conversionAByte(ruta));
            arc.registrarArchivo();
            
            reponderDpto redpto=new reponderDpto();
            
            String dpto=registro.nombreForm.getText();
             
            if(dpto.equals("Administrativo")){
                redpto.setDpto(2);
            }
            
            if(dpto.equals("Financiero")){
                redpto.setDpto(3);
            }
            if(dpto.equals("Resolucion de problemas")){
                redpto.setDpto(4);
            }
               
            redpto.setDescripcion(registro.descripcion.getText());
               
           
            redpto.setId_archivo_respuesta(me.idUltimoArchivo());
               
             redpto.registrarEnvio(); 
                 
            } catch (Exception e) {
            }
        }
        if(ae.getSource()==registro.btnAdjuntar){
           JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(registro);
        if (se == 0) {
//            this.btnseleccionar.setText("" + j.getSelectedFile().getName());
            ruta_archivo = j.getSelectedFile().getAbsolutePath();
            
            
        } else {
        }   
        }
    }
    String ruta_archivo = "";
   public String datoCombo(JComboBox combo1){
        String dato = (String) combo1.getSelectedItem();
        return dato;
    }
   public byte[] conversionAByte(File ruta) throws FileNotFoundException, IOException{
             byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
//            
//            ar.setArchivopdf(pdf);
//            ar.setNombrepdf(nombre);
//            ar.registrarArchivo();
            
            return pdf;
   }
    
}