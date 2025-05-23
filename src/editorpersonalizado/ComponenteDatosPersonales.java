/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package editorpersonalizado;

import java.io.Serializable;

/**
 *    
 * @author Manuel
 */
public class ComponenteDatosPersonales extends javax.swing.JPanel implements Serializable {

    private DatosPersonales datPer;
    
    
    public ComponenteDatosPersonales() {
        initComponents();
    }

    public DatosPersonales getDatPer() {
        return datPer;
    }

    public void setDatPer(DatosPersonales datPer) {
        this.datPer = datPer;
        datos.setText(datPer.getNombre()+"\n\r" +datPer.getApellidos()+"\n\r" +datPer.getEdad());
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        datos = new javax.swing.JTextArea();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Datos personales");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 116;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        add(jLabel1, gridBagConstraints);

        datos.setBackground(new java.awt.Color(204, 255, 255));
        datos.setColumns(20);
        datos.setRows(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 307;
        gridBagConstraints.ipady = 96;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(datos, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea datos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
