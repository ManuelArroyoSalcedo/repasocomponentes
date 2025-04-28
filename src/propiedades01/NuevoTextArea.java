/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propiedades01;

import java.io.Serializable;
import javax.swing.JTextArea;

/**
 *
 * @author Manuel
 */

public class NuevoTextArea extends JTextArea implements Serializable{
    private String[] datos;

    public String[] getDatos() {
        return datos;
    }

    public String getDatos(int pos) {
        return datos[pos];
    }
    
    public void setDatos(String[] datos) {
        this.datos = datos;
        
        String resul = "";
        for(int i = 0; i < datos.length; i++)
            resul = resul + datos[i] + "\n\r";
        
        if(!resul.equals("")) resul = resul.substring(0, resul.length() - 2);
        
        this.setText(resul);
        this.setRows(datos.length);
        this.setCaretPosition(0);
        
    }
    
    public void setDatos(int pos, String dato) {
        this.datos[pos] = dato;
    }
    
    
    
    
}
