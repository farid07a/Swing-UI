/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matjarokom.ui.view;

/**
 *
 * @author horizon
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        Frn_ID48 = new javax.swing.JLabel();
        TxtPrdPrix3 = new javax.swing.JTextField();
        TxtPrdQty3 = new javax.swing.JTextField();
        TxtPrdPrix1 = new javax.swing.JTextField();
        Frn_ID28 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Frn_ID47 = new javax.swing.JLabel();
        TxtPrdQty1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Frn_ID48.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        Frn_ID48.setText("الحد الأدنى للمخزون :");

        TxtPrdPrix3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPrdPrix3.setForeground(new java.awt.Color(204, 204, 204));
        TxtPrdPrix3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrdPrix3.setText("00");
        TxtPrdPrix3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrdPrix3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPrdPrix3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPrdPrix3FocusLost(evt);
            }
        });
        TxtPrdPrix3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrdPrix3ActionPerformed(evt);
            }
        });
        TxtPrdPrix3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPrdPrix3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrdPrix3KeyTyped(evt);
            }
        });

        TxtPrdQty3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPrdQty3.setForeground(new java.awt.Color(204, 204, 204));
        TxtPrdQty3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrdQty3.setText("00");
        TxtPrdQty3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrdQty3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPrdQty3FocusGained(evt);
            }
        });
        TxtPrdQty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrdQty3ActionPerformed(evt);
            }
        });
        TxtPrdQty3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrdQty3KeyTyped(evt);
            }
        });

        TxtPrdPrix1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPrdPrix1.setForeground(new java.awt.Color(204, 204, 204));
        TxtPrdPrix1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrdPrix1.setText("00.00");
        TxtPrdPrix1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrdPrix1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPrdPrix1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPrdPrix1FocusLost(evt);
            }
        });
        TxtPrdPrix1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrdPrix1ActionPerformed(evt);
            }
        });
        TxtPrdPrix1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPrdPrix1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrdPrix1KeyTyped(evt);
            }
        });

        Frn_ID28.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        Frn_ID28.setText("سعر البيع :");

        jLabel12.setText("jLabel4");

        Frn_ID47.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        Frn_ID47.setText("رصيد المخزون الافتتاحي :");

        TxtPrdQty1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPrdQty1.setForeground(new java.awt.Color(204, 204, 204));
        TxtPrdQty1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrdQty1.setText("00");
        TxtPrdQty1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrdQty1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPrdQty1FocusGained(evt);
            }
        });
        TxtPrdQty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrdQty1ActionPerformed(evt);
            }
        });
        TxtPrdQty1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrdQty1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(TxtPrdQty3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(Frn_ID48, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(TxtPrdPrix3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(TxtPrdPrix1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9)
                                    .addComponent(Frn_ID28, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(144, 144, 144))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(TxtPrdQty1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9)
                                    .addComponent(Frn_ID47, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(280, 280, 280)))
                            .addGap(135, 135, 135)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtPrdQty1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Frn_ID47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtPrdPrix1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Frn_ID28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TxtPrdQty3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Frn_ID48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtPrdPrix3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(94, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPrdPrix3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix3FocusGained

    private void TxtPrdPrix3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix3FocusLost

    private void TxtPrdPrix3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrdPrix3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix3ActionPerformed

    private void TxtPrdPrix3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix3KeyPressed

    private void TxtPrdPrix3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix3KeyTyped

    private void TxtPrdQty3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdQty3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdQty3FocusGained

    private void TxtPrdQty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrdQty3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdQty3ActionPerformed

    private void TxtPrdQty3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdQty3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdQty3KeyTyped

    private void TxtPrdPrix1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix1FocusGained

    private void TxtPrdPrix1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix1FocusLost

    private void TxtPrdPrix1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrdPrix1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix1ActionPerformed

    private void TxtPrdPrix1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix1KeyPressed

    private void TxtPrdPrix1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix1KeyTyped

    private void TxtPrdQty1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdQty1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdQty1FocusGained

    private void TxtPrdQty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrdQty1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdQty1ActionPerformed

    private void TxtPrdQty1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdQty1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdQty1KeyTyped

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Frn_ID28;
    private javax.swing.JLabel Frn_ID47;
    private javax.swing.JLabel Frn_ID48;
    private javax.swing.JTextField TxtPrdPrix1;
    private javax.swing.JTextField TxtPrdPrix3;
    private javax.swing.JTextField TxtPrdQty1;
    private javax.swing.JTextField TxtPrdQty3;
    private javax.swing.JLabel jLabel12;
    // End of variables declaration//GEN-END:variables
}
