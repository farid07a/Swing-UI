/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matjarokom.ui.view;

import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import matjarokom.Model.com.Unit;

/**
 *
 * @author farid
 */
public class unitView extends javax.swing.JDialog {

    /**
     * Creates new form unitView
     */
    
    //how to change Size of jtable or jpanel
    
    Unit unit_getData,unit_SetData;
    
    public unitView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        unit_getData=new Unit();                        // Initialise Object Unit Of Get Data 
        
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(cellRenderer);
//      jTable1.getColumnModel().getColumn(5).setCellRenderer(cellRenderer);
        this.setLocationRelativeTo(null);
        jPanel2.setPreferredSize(new Dimension(500,20));
        //jPanel2.repaint();
        jPanel2.revalidate();
        //jPanel2.setSize(50, 50);
        
        DisplayData_in_GUI_Unit();
    }
    
    public void DisplayData_in_GUI_Unit(){ //display data In Component
    unit_getData.FillingAllUnit_InTable(jTable1); //// Fill Table In UnitView
    int OrderUnit=unit_getData.GetLast_Order_Categorie();
    
    StringBuilder StBl=new StringBuilder();
    StBl.append(OrderUnit);
    
    LstOrd_Ctg.setText(StBl.toString());
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){

            public Class getColumnClass(int column) {
                return (column == 0 || column == 1 ) ? Icon.class : Object.class;
            }

        };
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Unit_Nam = new javax.swing.JTextField();
        Unit_Desc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LstOrd_Ctg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(363, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "حذف", "تعديل", "الوصـف", "الوحـدة", "الرقــم"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(102, 0, 102));
        jTable1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTable1MouseMoved(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 186, 520, 250));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/SearchIconUnits.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 155, 30, 30));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("ادخل اسم النوع");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 155, 200, 30));

        jButton4.setText("حفظ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 90, 30));

        jButton3.setText("حذف");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 90, 33));

        jButton1.setText("جديد");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 80, 34));

        jButton2.setText("تعديل");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 80, 28));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/IconUnits.png"))); // NOI18N
        jLabel3.setText("الوحدة    :   ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 100, 30));

        Unit_Nam.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Unit_Nam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Unit_Nam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(Unit_Nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 200, 30));

        Unit_Desc.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Unit_Desc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Unit_Desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(Unit_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 200, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/descIconUnit.png"))); // NOI18N
        jLabel2.setText("الوصف  :  ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 100, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/IconHashTagNbr.png"))); // NOI18N
        jLabel4.setText("الرقــم       :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 10, 90, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 30, 20));

        LstOrd_Ctg.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        LstOrd_Ctg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LstOrd_Ctg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LstOrd_Ctg.setEnabled(false);
        jPanel2.add(LstOrd_Ctg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int col=jTable1.columnAtPoint(evt.getPoint());
       int row=jTable1.rowAtPoint(evt.getPoint());
        DefaultTableModel defMdl=(DefaultTableModel) jTable1.getModel();
       
       switch(col){
       case 0:
           
           int IdOrder=(int) jTable1.getValueAt(row, 4);
           int Conf=JOptionPane.showConfirmDialog(this, "Confirm Delete data","Confirm ", JOptionPane.YES_NO_OPTION);
           JOptionPane.showMessageDialog(null, Conf);
           
           if (Conf==0) {
               
           int valCon=unit_getData.DeleteCategorie(IdOrder);
           
           if (valCon>0) defMdl.removeRow(row); //add Mesg information data;
           }
           
            
           
           
           
           
           
           
           
           
           // Function Delete Categorie
           
           
           
           //JOptionPane.showMessageDialog(null, "Col :"+jTable1.getSelectedColumn() +" === Row : "+jTable1.getSelectedRow());
           break;
       case 1:
           
           Unit_Desc.setText((String) jTable1.getValueAt(row, 2));
           Unit_Nam.setText((String) jTable1.getValueAt(row, 3));
           LstOrd_Ctg.setText( jTable1.getValueAt(row, 4)+"");
           
           //JOptionPane.showMessageDialog(null, "Col :"+jTable1.getSelectedColumn() +" === Row : "+jTable1.getSelectedRow());
           break;

       }
        
        
    }//GEN-LAST:event_jTable1MouseClicked
    
    
    
    
    
    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseMoved
        
         int col=jTable1.columnAtPoint(evt.getPoint());
        //int row=jTable1.rowAtPoint(evt.getPoint());
        
        Cursor handCursor=Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
        Cursor DefaultCursor=Cursor.getDefaultCursor();
        
       switch(col){
       case 0: case 1:
           //JOptionPane.showMessageDialog(null, "Col :"+jTable1.getSelectedColumn() +" === Row : "+jTable1.getSelectedRow());
           jTable1.setCursor(handCursor);
           
           
           break;
           
       default:
            jTable1.setCursor(DefaultCursor);
           //JOptionPane.showMessageDialog(null, "Col :"+jTable1.getSelectedColumn() +" === Row : "+jTable1.getSelectedRow());
           
           break;
       
       
       }
        
    }//GEN-LAST:event_jTable1MouseMoved

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(unitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(unitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(unitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(unitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                unitView dialog = new unitView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LstOrd_Ctg;
    private javax.swing.JTextField Unit_Desc;
    private javax.swing.JTextField Unit_Nam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
