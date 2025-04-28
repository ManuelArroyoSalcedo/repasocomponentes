/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propiedades01;

import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author Manuel
 */
public class NuevoTextField extends JTextField implements Serializable{
    private int tamanioFuente;
    private boolean negrita;
    private String defecto;

    public int getTamanioFuente() {
        return tamanioFuente;
    }

    public void setTamanioFuente(int tamanioFuente) {
        this.tamanioFuente = tamanioFuente;
    }

    public boolean isNegrita() {
        return negrita;
    }

    public void setNegrita(boolean negrita) {
        this.negrita = negrita;
        if(negrita){ 
            this.setFont(new java.awt.Font("Segoe UI", 1, 12));
        }else{
            this.setFont(new java.awt.Font("Segoe UI", 0, 12));
        }
    }

    public String getDefecto() {
        return defecto;
    }

    /**
     * 
     * @param defecto 
     */
    public void setDefecto(String defecto) {
        this.defecto = defecto;
        //Aprovechamos que al inicializar esta propiedad en el panel de propiedades de NetBeans se va a cinluir en 
        // el init la declaración de este método para introducirle el código que queremos que se ejecute.
        this.setText(defecto);
        
    }
    
    
    
}
