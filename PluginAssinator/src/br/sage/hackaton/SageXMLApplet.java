/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sage.hackaton;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author juliano.menezes
 */
public class SageXMLApplet extends Applet {

    Label response;
    String xmlAssinado;
    
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void paint(Graphics g) {
        // g.drawImage(getImage(getDocumentBase(),"lgo_sage.png"), 30,50, this);        
    }

    @Override
    public void init() {
        setFont(new Font ( "Helvetica" , Font.BOLD, 12));            
//        AssinadorA3 assinadorA2 = new AssinadorA3();
//        String CaminhoXML = "C://temp//xml_teste.xml";
//        String XMLEnvio;
//        try {
//            XMLEnvio = assinadorA2.lerXML(CaminhoXML);
//            signXML(XMLEnvio);
//        } catch (IOException ex) {
//            Logger.getLogger(SageXMLApplet.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
    
    public void signXML(String xml)  {
        response = new Label("Lendo o arquivo XML");
        add(response);
        //response.setText(xml);
        
        //String xml = this.getParameter("xml");       
        response.setText("Antes do assinadorA3");
        AssinadorA3 assinadorA3 = new AssinadorA3();
        response.setText("Assinando o XML");
        try {
            //String CaminhoXML = "C://temp//xml_teste.xml";
            //String XMLEnvio = assinadorA3.lerXML(CaminhoXML);
            response.setText("Assinando o XML");            
            xmlAssinado = assinadorA3.assinaEnviNFe(xml, "1234");            
//            FileWriter arq = new FileWriter("C://temp//xml_teste_assinado.xml");
//            PrintWriter gravarArq = new PrintWriter(arq);
//            gravarArq.printf(xmlAssinado);
//            arq.close();
            
            response.setText("XML assinado");
            
        } catch (IOException ex) {
            response.setText(ex.getMessage());
            Logger.getLogger(SageXMLApplet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            response.setText(ex.getMessage());
            Logger.getLogger(SageXMLApplet.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public String getResponse(){
        return xmlAssinado;
    }
}
