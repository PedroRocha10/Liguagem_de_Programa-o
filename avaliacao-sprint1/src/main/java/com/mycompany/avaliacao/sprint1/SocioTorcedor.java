/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avaliacao.sprint1;

import javafx.scene.control.Alert;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class SocioTorcedor extends javax.swing.JFrame {

    /**
     * Creates new form SocioTorcedor
     */
    public SocioTorcedor() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        lbl = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btn02 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Seja Sócio Torcedor");

        jLabel2.setText("Ajude o São Paulo a ficar ainda maior");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha seu plano", "Sou Tricolor", "Vamos São Paulo", "Clube da Fé", "Tu és forte tu és grande" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb1);
        rb1.setText("Boleto (20% de desconto)");

        buttonGroup2.add(rb2);
        rb2.setSelected(true);
        rb2.setText("Cartão de Crédito");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb3);
        rb3.setText("Cartão de Débito (10% de desconto)");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        lbl.setToolTipText("");
        lbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblActionPerformed(evt);
            }
        });

        jLabel3.setText("Planos:");

        btn.setText("Finalizar");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        jLabel4.setText("Escolha forma de pagamento");

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        jLabel5.setText("Ex: Mesal, Semestral ou Anual");

        btn02.setText("Cotar Plano");
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb3)
                            .addComponent(rb2)
                            .addComponent(rb1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btn)
                .addGap(39, 39, 39)
                .addComponent(btn02)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb1)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn)
                    .addComponent(btn02))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
       
        
        
           if(comboBox.getSelectedItem().equals("Escolha seu plano")){
       
            JOptionPane.showMessageDialog(null, "Preencha Corretamente o campo plano",null,WIDTH);
               
       }
           else if(lbl.getText().equals("")){
               
           JOptionPane.showMessageDialog(null, "Preencha Corretamente formato do plano",null,WIDTH);
               
           }
           
           else{
              
               JOptionPane.showMessageDialog(null, "Solicitação concluida ",null,WIDTH);
               
           }
       
    }//GEN-LAST:event_btnActionPerformed

    private void lblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed

            
           
       
    }//GEN-LAST:event_comboBoxActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb3ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        Double mensal;
        Double semestral;
        Double anual;
        
        if (comboBox.getSelectedItem().equals("Escolha seu plano")) {
            ta.setText(" ");
        }
        if (comboBox.getSelectedItem().equals("Sou Tricolor")) {
            mensal = 12.00;
            semestral = 72.00;
            anual = 144.00;
         
            
            ta.setText(String.format("Plano mensal: %.2f \n Plano semestral: "
                    + "%.2f \n Plano anual: %.2f",
                    mensal, semestral, anual));
             if (comboBox.getSelectedItem().equals("Sou Tricolor") && rb1.isSelected()) {
            
            ta.setText("");
                
            Double desconto = 0.2;    
                
            mensal = 12.00-(mensal*desconto);
            semestral = 72.00-(semestral*desconto);
            anual = 144.00-(anual*desconto);
         
            
            ta.setText(String.format("Plano mensal: %.2f \n Plano semestral: "
                    + "%.2f \n Plano anual: %.2f",
                    mensal, semestral, anual));
            
            }
            
            if (comboBox.getSelectedItem().equals("Sou Tricolor") && rb3.isSelected()) {
            
            ta.setText("");
                
            Double desconto = 0.1;    
                
            mensal = 12.00-(mensal*desconto);
            semestral = 72.00-(semestral*desconto);
            anual = 144.00-(anual*desconto);
         
            
            ta.setText(String.format("Plano mensal: %.2f \n Plano semestral: "
                    + "%.2f \n Plano anual: %.2f",
                    mensal, semestral, anual));
            
            }
            
        }
        
         if (comboBox.getSelectedItem().equals("Vamos São Paulo")) {
            mensal = 19.00;
            semestral = 114.00;
            anual = 228.00;
       
            ta.setText(String.format("Plano mensal: %.2f \n Plano semestral: "
                    + "%.2f \n Plano anual: %.2f",
                    mensal, semestral, anual));
            
            
            if (comboBox.getSelectedItem().equals("Vamos São Paulo") && rb1.isSelected()) {
            
            Double desconto = 0.2;    
                
            mensal = 19.00-(mensal*desconto);
            semestral = 114.00-(semestral*desconto);
            anual = 228.00-(anual*desconto);
         
            
            ta.setText(String.format("Plano mensal: %.2f \n Plano semestral: "
                    + "%.2f \n Plano anual: %.2f",
                    mensal, semestral, anual));
            
            }
            
            if (comboBox.getSelectedItem().equals("Vamos São Paulo") && rb3.isSelected()) {
            
            Double desconto = 0.1;    
                
            mensal = 19.00-(mensal*desconto);
            semestral = 114.00-(semestral*desconto);
            anual = 228.00-(anual*desconto);
         
            
            ta.setText(String.format("Plano mensal: %.2f \n Plano semestral: "
                    + "%.2f \n Plano anual: %.2f",
                    mensal, semestral, anual));
            
            }
            
        }
        if (comboBox.getSelectedItem().equals("Clube da Fé")) {
            mensal = 69.00;
            semestral = 414.00;
            anual = 828.00;
          
            
            ta.setText(String.format("Plano mensal: %.2f \n Plano semestral: "
                    + "%.2f \n Plano anual: %.2f",
                    mensal, semestral, anual));
            
            if (comboBox.getSelectedItem().equals("Clube da Fé") && rb1.isSelected()) {
            
            Double desconto = 0.2;    
                
            mensal = 69.00-(mensal*desconto);
            semestral = 414.00-(semestral*desconto);
            anual = 828.00-(anual*desconto);
         
            
            ta.setText(String.format("Plano mensal: %.2f \n Plano semestral: "
                    + "%.2f \n Plano anual: %.2f",
                    mensal, semestral, anual));
            
            }
            
            if (comboBox.getSelectedItem().equals("Clube da Fé") && rb3.isSelected()) {
            
            Double desconto = 0.1;    
                
            mensal = 69.00-(mensal*desconto);
            semestral = 414.00-(semestral*desconto);
            anual = 828.00-(anual*desconto);
         
            
            ta.setText(String.format("Plano mensal: %.2f \n Plano semestral: "
                    + "%.2f \n Plano anual: %.2f",
                    mensal, semestral, anual));
            
            }
            
        }
        if (comboBox.getSelectedItem().equals("Tu és forte tu és grande")) {
            mensal = 100.00;
            semestral = 600.00;
            anual = 1200.00;
            
            
           ta.setText(String.format("Plano mensal: %.2f \n Plano semestral: "
                    + "%.2f \n Plano anual: %.2f",
                    mensal, semestral,anual));
            
            if (comboBox.getSelectedItem().equals("Tu és forte tu és grande") && rb1.isSelected()) {
            
            Double desconto = 0.2;    
                
            mensal = 100.00-(mensal*desconto);
            semestral = 600.00-(semestral*desconto);
            anual = 1200.00-(anual*desconto);
         
            
            ta.setText(String.format("Plano mensal: %.2f \n Plano semestral: "
                    + "%.2f \n Plano anual: %.2f",
                    mensal, semestral, anual));
            
            }
            
            if (comboBox.getSelectedItem().equals("Tu és forte tu és grande") && rb3.isSelected()) {
            
            Double desconto = 0.1;    
                
            mensal = 100.00-(mensal*desconto);
            semestral = 600.00-(semestral*desconto);
            anual = 1200.00-(anual*desconto);
         
            
            ta.setText(String.format("Plano mensal: %.2f \n Plano semestral: "
                    + "%.2f \n Plano anual: %.2f",
                    mensal, semestral, anual));
            
            }
           
        }
            
    }//GEN-LAST:event_btn02ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SocioTorcedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SocioTorcedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SocioTorcedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SocioTorcedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SocioTorcedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btn02;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbl;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
