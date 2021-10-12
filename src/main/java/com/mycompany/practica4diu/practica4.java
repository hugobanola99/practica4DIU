/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica4diu;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hugob
 */
public class practica4 extends javax.swing.JFrame {

    /**
     * Creates new form practica4
     */
    Lienzo l = new Lienzo();
    public practica4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxBackground = new javax.swing.JComboBox<>();
        lienzo1 = new com.mycompany.practica4diu.Lienzo();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxBrush = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jComboBoxBackground.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "white", "black", "gray" }));
        jComboBoxBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBackgroundActionPerformed(evt);
            }
        });

        lienzo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lienzo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lienzo1MouseMoved(evt);
            }
        });

        jLabel1.setText("Background Color");

        jComboBoxBrush.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "green", "yellow", "blue" }));
        jComboBoxBrush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBrushActionPerformed(evt);
            }
        });

        jLabel2.setText("Brush Color");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxBrush, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBrush, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.getAccessibleContext().setAccessibleName("Brush Color");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBackgroundActionPerformed
        // TODO add your handling code here:
        String color = (String)jComboBoxBackground.getSelectedItem();
        if(color.equals("white") ){
            lienzo1.setBackground(Color.white);
        }else if(color.equals("black")){
            lienzo1.setBackground(Color.black);
        }else if(color.equals("gray")){
            lienzo1.setBackground(Color.gray);
        }
       
        
        
    }//GEN-LAST:event_jComboBoxBackgroundActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_formMouseMoved

    private void jComboBoxBrushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBrushActionPerformed
        // TODO add your handling code here:
        String color = (String) jComboBoxBrush.getSelectedItem();
        if(color.equals("yellow") ){
            lienzo1.setForeground(Color.yellow);
        }else if(color.equals("blue")){
            lienzo1.setForeground(Color.blue);
        }else if(color.equals("green")){
            lienzo1.setForeground(Color.green);
        }
    }//GEN-LAST:event_jComboBoxBrushActionPerformed

    private void lienzo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzo1MouseMoved
        // TODO add your handling code here:
        int x = evt.getX();
        int y = evt.getY();
        try {
            sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(practica4.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("X: "+x+" Y: "+y);
        lienzo1.wakeCircle(x, y);
        lienzo1.updateUI();
    }//GEN-LAST:event_lienzo1MouseMoved

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxBackground;
    private javax.swing.JComboBox<String> jComboBoxBrush;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.mycompany.practica4diu.Lienzo lienzo1;
    // End of variables declaration//GEN-END:variables
}
