/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editorpersonalizado;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 * 
 * @author Manuel
 */
public class DatosPersonalesPropertyEditorSupport extends PropertyEditorSupport{
    private DatosPersonalesEditorPersonalizado editor = new DatosPersonalesEditorPersonalizado();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return editor;
    }

    @Override
    public String getJavaInitializationString() {
        //DatosPersonales dp = editor.getDatosPersonales();
        return "new editorpersonalizado.DatosPersonales()";
    }

    @Override
    public Object getValue() {
        return editor.getDatosPersonales();
    }
    
    
    
    
}
