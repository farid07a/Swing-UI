/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matjarokom.ui.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import matjarokom.Model.com.Categorie;
import matjarokom.Model.com.produit_stock;

/**
 *
 * @author horizon
 */
public class produitView extends javax.swing.JFrame {

    private produit_stock prduitStock;
    
    Categorie categorie=null;
    public produitView() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Frn_ID15 = new javax.swing.JLabel();
        Frn_ID5 = new javax.swing.JLabel();
        Desg_produit = new javax.swing.JTextField();
        NbrPcsInQty_produit = new javax.swing.JTextField();
        Nbr_Pcs_label1 = new javax.swing.JLabel();
        prixVente_produit = new javax.swing.JTextField();
        Frn_ID11 = new javax.swing.JLabel();
        Frn_ID6 = new javax.swing.JLabel();
        Catg_produit = new java.awt.Choice();
        QuantityStok_produit = new javax.swing.JTextField();
        Frn_ID28 = new javax.swing.JLabel();
        Frn_ID29 = new javax.swing.JLabel();
        Unit_produit = new javax.swing.JComboBox<>();
        LastDateAchat_produit = new javax.swing.JTextField();
        Frn_ID19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        View_prices = new javax.swing.JLabel();
        Frn_ID20 = new javax.swing.JLabel();
        ShowScreen_produit = new javax.swing.JCheckBox();
        UnitForQuantity_produit = new javax.swing.JComboBox<>();
        MinStok_produit = new javax.swing.JTextField();
        Frn_ID21 = new javax.swing.JLabel();
        Frn_ID22 = new javax.swing.JLabel();
        Postion_produit = new javax.swing.JTextField();
        Stokage_produit = new javax.swing.JTextField();
        Frn_ID10 = new javax.swing.JLabel();
        Ref_produit = new javax.swing.JTextField();
        CheckDateExp_produit = new javax.swing.JCheckBox();
        Frn_ID9 = new javax.swing.JLabel();
        Frn_ID23 = new javax.swing.JLabel();
        Frn_ID24 = new javax.swing.JLabel();
        TxtPrdPrix9 = new javax.swing.JTextField();
        Forns_produit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        DateDormatField = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarque_produit = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 190, 220));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Frn_ID15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID15.setText("الباركـود :");
        jPanel3.add(Frn_ID15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 60, 30));

        Frn_ID5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID5.setText(" المنتـج :");
        jPanel3.add(Frn_ID5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 50, 60, 40));

        Desg_produit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Desg_produit.setForeground(new java.awt.Color(204, 204, 204));
        Desg_produit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Desg_produit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Desg_produit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Desg_produitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Desg_produitFocusLost(evt);
            }
        });
        Desg_produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Desg_produitActionPerformed(evt);
            }
        });
        Desg_produit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Desg_produitKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Desg_produitKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Desg_produitKeyTyped(evt);
            }
        });
        jPanel3.add(Desg_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 218, 30));

        NbrPcsInQty_produit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NbrPcsInQty_produit.setForeground(new java.awt.Color(204, 204, 204));
        NbrPcsInQty_produit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NbrPcsInQty_produit.setText("00.00");
        NbrPcsInQty_produit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NbrPcsInQty_produit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NbrPcsInQty_produitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NbrPcsInQty_produitFocusLost(evt);
            }
        });
        NbrPcsInQty_produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NbrPcsInQty_produitActionPerformed(evt);
            }
        });
        NbrPcsInQty_produit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NbrPcsInQty_produitKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NbrPcsInQty_produitKeyTyped(evt);
            }
        });
        jPanel3.add(NbrPcsInQty_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 250, 32));

        Nbr_Pcs_label1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Nbr_Pcs_label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Nbr_Pcs_label1.setText("القطع داخل الوحدة :");
        jPanel3.add(Nbr_Pcs_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 97, 30));

        prixVente_produit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        prixVente_produit.setForeground(new java.awt.Color(204, 204, 204));
        prixVente_produit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prixVente_produit.setText("00");
        prixVente_produit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        prixVente_produit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                prixVente_produitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                prixVente_produitFocusLost(evt);
            }
        });
        prixVente_produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prixVente_produitActionPerformed(evt);
            }
        });
        prixVente_produit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prixVente_produitKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prixVente_produitKeyTyped(evt);
            }
        });
        jPanel3.add(prixVente_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 230, 40));

        Frn_ID11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID11.setText("سعر البيع :");
        jPanel3.add(Frn_ID11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1047, 290, 60, 40));

        Frn_ID6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID6.setText("النـــوع :");
        jPanel3.add(Frn_ID6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 110, -1, 40));
        jPanel3.add(Catg_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 219, 30));

        QuantityStok_produit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        QuantityStok_produit.setText("20");
        QuantityStok_produit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(QuantityStok_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 85, 32));

        Frn_ID28.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        Frn_ID28.setText("الكمية المتاحة :");
        jPanel3.add(Frn_ID28, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, 32));

        Frn_ID29.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        Frn_ID29.setText("الوحدة :");
        jPanel3.add(Frn_ID29, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 46, 32));

        Unit_produit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Unit_produit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "قطعة", "كرتونة", "لتر", "كيلو" }));
        Unit_produit.setBorder(null);
        Unit_produit.setOpaque(false);
        Unit_produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Unit_produitActionPerformed(evt);
            }
        });
        jPanel3.add(Unit_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 160, 30));

        LastDateAchat_produit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LastDateAchat_produit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(LastDateAchat_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 250, 30));

        Frn_ID19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID19.setText("مكان المنتج :");
        jPanel3.add(Frn_ID19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 90, 30));

        jTable2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "المخزن", "تعديل", "صورة", "ملاحظات", "حد الطلب", "الكمية", "سعر البيع", "سعر الشراء", "وحدة الشراء", "اسم الصنف", "المنتج", "الباركود", "اسم المنتج"
            }
        ));
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable2.setGridColor(new java.awt.Color(51, 0, 153));
        jTable2.setRowHeight(24);
        jTable2.setSelectionBackground(new java.awt.Color(51, 0, 51));
        jTable2.getTableHeader().setResizingAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 1140, 170));

        View_prices.setText("الاسعار القديمة");
        jPanel3.add(View_prices, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 80, 30));

        Frn_ID20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID20.setText("ملاحظات :");
        jPanel3.add(Frn_ID20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 50, 30));

        ShowScreen_produit.setText("اظهار المنتج في شاشة المنتجات :");
        jPanel3.add(ShowScreen_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 200, -1));

        UnitForQuantity_produit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        UnitForQuantity_produit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "قطعة", "كرتونة", "لتر", "كيلو" }));
        UnitForQuantity_produit.setBorder(null);
        UnitForQuantity_produit.setOpaque(false);
        jPanel3.add(UnitForQuantity_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 110, 32));

        MinStok_produit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MinStok_produit.setForeground(new java.awt.Color(204, 204, 204));
        MinStok_produit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MinStok_produit.setText("00");
        MinStok_produit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MinStok_produit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MinStok_produitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MinStok_produitFocusLost(evt);
            }
        });
        MinStok_produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinStok_produitActionPerformed(evt);
            }
        });
        MinStok_produit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MinStok_produitKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MinStok_produitKeyTyped(evt);
            }
        });
        jPanel3.add(MinStok_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 250, 40));

        Frn_ID21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID21.setText("آخر تاريخ للشراء :");
        jPanel3.add(Frn_ID21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 97, 40));

        Frn_ID22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID22.setText("كمية اعادة الطلب :");
        jPanel3.add(Frn_ID22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 97, 40));

        Postion_produit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Postion_produit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(Postion_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 250, 30));

        Stokage_produit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Stokage_produit.setForeground(new java.awt.Color(204, 204, 204));
        Stokage_produit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Stokage_produit.setText("00");
        Stokage_produit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Stokage_produit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Stokage_produitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Stokage_produitFocusLost(evt);
            }
        });
        Stokage_produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stokage_produitActionPerformed(evt);
            }
        });
        Stokage_produit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Stokage_produitKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Stokage_produitKeyTyped(evt);
            }
        });
        jPanel3.add(Stokage_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 230, 40));

        Frn_ID10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID10.setText("المخزن :");
        jPanel3.add(Frn_ID10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1037, 350, 70, 40));

        Ref_produit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Ref_produit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(Ref_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 220, 30));

        CheckDateExp_produit.setText("تاريخ الصلاحية :");
        jPanel3.add(CheckDateExp_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 150, -1, -1));

        Frn_ID9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID9.setText("سعر الشــراء :");
        jPanel3.add(Frn_ID9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 230, 97, 40));

        Frn_ID23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID23.setText("فاتورات الشراء :");
        jPanel3.add(Frn_ID23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, 30));

        Frn_ID24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID24.setText("الموردين :");
        jPanel3.add(Frn_ID24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 90, 30));

        TxtPrdPrix9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPrdPrix9.setForeground(new java.awt.Color(204, 204, 204));
        TxtPrdPrix9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrdPrix9.setText("00");
        TxtPrdPrix9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrdPrix9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPrdPrix9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPrdPrix9FocusLost(evt);
            }
        });
        TxtPrdPrix9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrdPrix9ActionPerformed(evt);
            }
        });
        TxtPrdPrix9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPrdPrix9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrdPrix9KeyTyped(evt);
            }
        });
        jPanel3.add(TxtPrdPrix9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 30));

        Forns_produit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Forns_produit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(Forns_produit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        jButton2.setText("jButton1");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        try {
            DateDormatField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DateDormatField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(DateDormatField, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 220, 30));

        remarque_produit.setColumns(20);
        remarque_produit.setRows(5);
        jScrollPane1.setViewportView(remarque_produit);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 270, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Stokage_produitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Stokage_produitFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Stokage_produitFocusGained

    private void Stokage_produitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Stokage_produitFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Stokage_produitFocusLost

    private void Stokage_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stokage_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Stokage_produitActionPerformed

    private void Stokage_produitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Stokage_produitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Stokage_produitKeyPressed

    private void Stokage_produitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Stokage_produitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Stokage_produitKeyTyped

    private void Desg_produitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Desg_produitFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Desg_produitFocusGained

    private void Desg_produitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Desg_produitFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Desg_produitFocusLost

    private void Desg_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Desg_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Desg_produitActionPerformed

    private void Desg_produitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Desg_produitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Desg_produitKeyPressed

    private void Desg_produitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Desg_produitKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Desg_produitKeyReleased

    private void Desg_produitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Desg_produitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Desg_produitKeyTyped

    private void NbrPcsInQty_produitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NbrPcsInQty_produitFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_NbrPcsInQty_produitFocusGained

    private void NbrPcsInQty_produitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NbrPcsInQty_produitFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_NbrPcsInQty_produitFocusLost

    private void NbrPcsInQty_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NbrPcsInQty_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NbrPcsInQty_produitActionPerformed

    private void NbrPcsInQty_produitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NbrPcsInQty_produitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NbrPcsInQty_produitKeyPressed

    private void NbrPcsInQty_produitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NbrPcsInQty_produitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_NbrPcsInQty_produitKeyTyped

    private void prixVente_produitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prixVente_produitFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_prixVente_produitFocusGained

    private void prixVente_produitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prixVente_produitFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_prixVente_produitFocusLost

    private void prixVente_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prixVente_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prixVente_produitActionPerformed

    private void prixVente_produitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixVente_produitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_prixVente_produitKeyPressed

    private void prixVente_produitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixVente_produitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_prixVente_produitKeyTyped

    private void Unit_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Unit_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Unit_produitActionPerformed

    private void MinStok_produitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MinStok_produitFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_MinStok_produitFocusGained

    private void MinStok_produitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MinStok_produitFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_MinStok_produitFocusLost

    private void MinStok_produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinStok_produitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinStok_produitActionPerformed

    private void MinStok_produitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MinStok_produitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinStok_produitKeyPressed

    private void MinStok_produitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MinStok_produitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_MinStok_produitKeyTyped

    private void TxtPrdPrix9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix9FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix9FocusGained

    private void TxtPrdPrix9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix9FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix9FocusLost

    private void TxtPrdPrix9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrdPrix9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix9ActionPerformed

    private void TxtPrdPrix9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix9KeyPressed

    private void TxtPrdPrix9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix9KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        categorie=new Categorie();
        
        String RefProduit=Ref_produit.getText();
        String DesgProduit=Desg_produit.getText();
        
        
        
        int id_categorie=categorie.GetIdCategorie("عام");
        
        int QtyStok=Integer.valueOf(QuantityStok_produit.getText());
        double Prix_Vente=Double.valueOf(prixVente_produit.getText());
        
        String Stocke=Stokage_produit.getText();
        int QuantityStock=Integer.valueOf(QuantityStok_produit.getText());
        Date DateExpirProduit=null;
        String StringDate=DateDormatField.getText();
        
        try {
             DateExpirProduit=new SimpleDateFormat("dd/MM/yyyy").parse(StringDate);   //create Date expiration Of product
             
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "The Date Entree is Not Valid please verify ");
            
            return;
        
        }
        
        int NbrPcsInQty_prd=Integer.valueOf(NbrPcsInQty_produit.getText());  /// nbr pcs in unit stockeé dans le stock
        
        String Postion_produit_in_stock=Postion_produit.getText();
        int MinStok_produit_in_stock=Integer.valueOf(MinStok_produit.getText());// get Min Stock for produit
        double LastDateAchat_prod=Double.valueOf(LastDateAchat_produit.getText());
        
        byte check=1;
        
        
      check= (byte) ((ShowScreen_produit.isSelected()) ? 1 :0);   //check in panel access product
        
      StringBuilder RemarqueProduit=new StringBuilder();
      RemarqueProduit.append(remarque_produit.getText());
      
      
      
      
        
        
        
        
        
        
        
    
       
       
       
        
       
      /*  
        
        prduitStock=new produit_stock(1,DesgProduit , RefProduit, 
                id_categorie, QtyStok, DateExpirProduit, Prix_Vente, LastDateAchat_prod, WIDTH, WIDTH, 
                EXIT_ON_CLOSE, rootPaneCheckingEnabled, Remarque_Produit);*/
      
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(produitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(produitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(produitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(produitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new produitView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice Catg_produit;
    private javax.swing.JCheckBox CheckDateExp_produit;
    private javax.swing.JFormattedTextField DateDormatField;
    private javax.swing.JTextField Desg_produit;
    private javax.swing.JTextField Forns_produit;
    private javax.swing.JLabel Frn_ID10;
    private javax.swing.JLabel Frn_ID11;
    private javax.swing.JLabel Frn_ID15;
    private javax.swing.JLabel Frn_ID19;
    private javax.swing.JLabel Frn_ID20;
    private javax.swing.JLabel Frn_ID21;
    private javax.swing.JLabel Frn_ID22;
    private javax.swing.JLabel Frn_ID23;
    private javax.swing.JLabel Frn_ID24;
    private javax.swing.JLabel Frn_ID28;
    private javax.swing.JLabel Frn_ID29;
    private javax.swing.JLabel Frn_ID5;
    private javax.swing.JLabel Frn_ID6;
    private javax.swing.JLabel Frn_ID9;
    private javax.swing.JTextField LastDateAchat_produit;
    private javax.swing.JTextField MinStok_produit;
    private javax.swing.JTextField NbrPcsInQty_produit;
    private javax.swing.JLabel Nbr_Pcs_label1;
    private javax.swing.JTextField Postion_produit;
    private javax.swing.JTextField QuantityStok_produit;
    private javax.swing.JTextField Ref_produit;
    private javax.swing.JCheckBox ShowScreen_produit;
    private javax.swing.JTextField Stokage_produit;
    private javax.swing.JTextField TxtPrdPrix9;
    private javax.swing.JComboBox<String> UnitForQuantity_produit;
    private javax.swing.JComboBox<String> Unit_produit;
    private javax.swing.JLabel View_prices;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField prixVente_produit;
    private javax.swing.JTextArea remarque_produit;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the prduitStock
     */
    public produit_stock getPrduitStock() {
        return prduitStock;
    }

    /**
     * @param prduitStock the prduitStock to set
     */
    public void setPrduitStock(produit_stock prduitStock) {
        this.prduitStock = prduitStock;
    }
}
