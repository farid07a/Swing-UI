/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matjarokom.ui.view;

import javax.swing.JOptionPane;

/**
 *
 * @author horizon
 */
public class produitView extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
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
        Frn_ID12 = new javax.swing.JLabel();
        Frn_ID3 = new javax.swing.JLabel();
        Frn_ID9 = new javax.swing.JLabel();
        Frn_ID4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        TxtPrdDesg2 = new javax.swing.JTextField();
        Frn_ID15 = new javax.swing.JLabel();
        Frn_ID5 = new javax.swing.JLabel();
        TxtPrdDesg3 = new javax.swing.JTextField();
        TxtPrdPrix1 = new javax.swing.JTextField();
        Nbr_Pcs_label1 = new javax.swing.JLabel();
        TxtPrdPrix7 = new javax.swing.JTextField();
        Frn_ID11 = new javax.swing.JLabel();
        Frn_ID17 = new javax.swing.JLabel();
        Frn_ID6 = new javax.swing.JLabel();
        choice2 = new java.awt.Choice();
        jTextField7 = new javax.swing.JTextField();
        Frn_ID28 = new javax.swing.JLabel();
        Frn_ID29 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField11 = new javax.swing.JTextField();
        Frn_ID19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Frn_ID20 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        TxtPrdPrix8 = new javax.swing.JTextField();
        Frn_ID21 = new javax.swing.JLabel();
        Frn_ID22 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        TxtPrdPrix5 = new javax.swing.JTextField();
        Frn_ID10 = new javax.swing.JLabel();
        TxtPrdPrix6 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        TxtPrdPrix = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Frn_ID12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID12.setText("الباركـود :");
        jPanel1.add(Frn_ID12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, 60, 40));

        Frn_ID3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID3.setText(" المنتـج :");
        jPanel1.add(Frn_ID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 60, 40));

        Frn_ID9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID9.setText("سعر الشــراء :");
        jPanel1.add(Frn_ID9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 97, 40));

        Frn_ID4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID4.setText("النـــوع :");
        jPanel1.add(Frn_ID4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 110, -1, 40));

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(51, 0, 153));
        jTable1.setRowHeight(24);
        jTable1.setSelectionBackground(new java.awt.Color(51, 0, 51));
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 422, 1140, 230));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 250));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtPrdDesg2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPrdDesg2.setForeground(new java.awt.Color(204, 204, 204));
        TxtPrdDesg2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrdDesg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrdDesg2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPrdDesg2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPrdDesg2FocusLost(evt);
            }
        });
        TxtPrdDesg2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPrdDesg2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtPrdDesg2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrdDesg2KeyTyped(evt);
            }
        });
        jPanel3.add(TxtPrdDesg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 218, 40));

        Frn_ID15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID15.setText("الباركـود :");
        jPanel3.add(Frn_ID15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, 60, 40));

        Frn_ID5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID5.setText(" المنتـج :");
        jPanel3.add(Frn_ID5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 60, 40));

        TxtPrdDesg3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPrdDesg3.setForeground(new java.awt.Color(204, 204, 204));
        TxtPrdDesg3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrdDesg3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrdDesg3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPrdDesg3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPrdDesg3FocusLost(evt);
            }
        });
        TxtPrdDesg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrdDesg3ActionPerformed(evt);
            }
        });
        TxtPrdDesg3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPrdDesg3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtPrdDesg3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrdDesg3KeyTyped(evt);
            }
        });
        jPanel3.add(TxtPrdDesg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 218, 40));

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
        jPanel3.add(TxtPrdPrix1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 220, 32));

        Nbr_Pcs_label1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Nbr_Pcs_label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Nbr_Pcs_label1.setText("القطع داخل الوحدة :");
        jPanel3.add(Nbr_Pcs_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 97, 30));

        TxtPrdPrix7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPrdPrix7.setForeground(new java.awt.Color(204, 204, 204));
        TxtPrdPrix7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrdPrix7.setText("00");
        TxtPrdPrix7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrdPrix7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPrdPrix7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPrdPrix7FocusLost(evt);
            }
        });
        TxtPrdPrix7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrdPrix7ActionPerformed(evt);
            }
        });
        TxtPrdPrix7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPrdPrix7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrdPrix7KeyTyped(evt);
            }
        });
        jPanel3.add(TxtPrdPrix7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 230, 40));

        Frn_ID11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID11.setText("سعر البيع :");
        jPanel3.add(Frn_ID11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, 97, 40));

        Frn_ID17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID17.setText("سعر الشــراء :");
        jPanel3.add(Frn_ID17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 97, 40));

        Frn_ID6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID6.setText("النـــوع :");
        jPanel3.add(Frn_ID6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 110, -1, 40));
        jPanel3.add(choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 219, 40));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 85, 32));

        Frn_ID28.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        Frn_ID28.setText("الكمية المتاحة :");
        jPanel3.add(Frn_ID28, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, 32));

        Frn_ID29.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        Frn_ID29.setText("الوحدة :");
        jPanel3.add(Frn_ID29, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 46, 32));

        jComboBox4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "قطعة", "كرتونة", "لتر", "كيلو" }));
        jComboBox4.setBorder(null);
        jComboBox4.setOpaque(false);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 160, 30));

        jTextField11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 230, 30));

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

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 422, 1140, 230));

        jLabel2.setText("الاسعار القديمة");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 80, 30));

        Frn_ID20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID20.setText("ملاحظات :");
        jPanel3.add(Frn_ID20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 50, 30));

        jCheckBox3.setText("تاريخ الصلاحية :");
        jPanel3.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        jComboBox5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "قطعة", "كرتونة", "لتر", "كيلو" }));
        jComboBox5.setBorder(null);
        jComboBox5.setOpaque(false);
        jPanel3.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 90, 32));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 250));

        TxtPrdPrix8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPrdPrix8.setForeground(new java.awt.Color(204, 204, 204));
        TxtPrdPrix8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrdPrix8.setText("00");
        TxtPrdPrix8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrdPrix8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPrdPrix8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPrdPrix8FocusLost(evt);
            }
        });
        TxtPrdPrix8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrdPrix8ActionPerformed(evt);
            }
        });
        TxtPrdPrix8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPrdPrix8KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrdPrix8KeyTyped(evt);
            }
        });
        jPanel3.add(TxtPrdPrix8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 230, 40));

        Frn_ID21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID21.setText("آخر تاريخ للشراء :");
        jPanel3.add(Frn_ID21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 97, 40));

        Frn_ID22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID22.setText("كمية اعادة الطلب :");
        jPanel3.add(Frn_ID22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 97, 40));

        jTextField12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 220, 30));

        TxtPrdPrix5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPrdPrix5.setForeground(new java.awt.Color(204, 204, 204));
        TxtPrdPrix5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrdPrix5.setText("00");
        TxtPrdPrix5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrdPrix5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPrdPrix5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPrdPrix5FocusLost(evt);
            }
        });
        TxtPrdPrix5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrdPrix5ActionPerformed(evt);
            }
        });
        TxtPrdPrix5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPrdPrix5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrdPrix5KeyTyped(evt);
            }
        });
        jPanel3.add(TxtPrdPrix5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 230, 40));

        Frn_ID10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Frn_ID10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Frn_ID10.setText("سعر البيع :");
        jPanel3.add(Frn_ID10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 97, 40));

        TxtPrdPrix6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPrdPrix6.setForeground(new java.awt.Color(204, 204, 204));
        TxtPrdPrix6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrdPrix6.setText("00");
        TxtPrdPrix6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrdPrix6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPrdPrix6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPrdPrix6FocusLost(evt);
            }
        });
        TxtPrdPrix6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrdPrix6ActionPerformed(evt);
            }
        });
        TxtPrdPrix6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPrdPrix6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrdPrix6KeyTyped(evt);
            }
        });
        jPanel3.add(TxtPrdPrix6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 220, 40));

        jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 220, 30));

        TxtPrdPrix.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TxtPrdPrix.setForeground(new java.awt.Color(204, 204, 204));
        TxtPrdPrix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrdPrix.setText("00.00");
        TxtPrdPrix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrdPrix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPrdPrixFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPrdPrixFocusLost(evt);
            }
        });
        TxtPrdPrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrdPrixActionPerformed(evt);
            }
        });
        TxtPrdPrix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPrdPrixKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPrdPrixKeyTyped(evt);
            }
        });
        jPanel3.add(TxtPrdPrix, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 220, 32));

        jTextField9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 230, 30));

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

    private void TxtPrdPrixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrixFocusGained
        // TODO add your handling code here:
        /*  if (TxtPrdPrix.getText().equals("Prix du produit")) {
            TxtPrdPrix.setText("");
        }
        TxtPrdPrix.setForeground(Color.black);*/
    }//GEN-LAST:event_TxtPrdPrixFocusGained

    private void TxtPrdPrixFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrixFocusLost
        // TODO add your handling code here:
        // CalculePrix();
        //JOptionPane.showMessageDialog(null, "The value is"+Integer.parseInt(TxtPrdPrix.getText()));
    }//GEN-LAST:event_TxtPrdPrixFocusLost

    private void TxtPrdPrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrdPrixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrixActionPerformed

    private void TxtPrdPrixKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrixKeyPressed
        // TODO add your handling code here:
        /*
        if (evt.getKeyCode()==KeyEvent.VK_ENTER||evt.getKeyCode()==KeyEvent.VK_TAB) {
            CalculePrix(TxtPrdQty,TxtPrdPrix,ResPrdQtyAndPrix);
        }
        */
    }//GEN-LAST:event_TxtPrdPrixKeyPressed

    private void TxtPrdPrixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrixKeyTyped
        // TODO add your handling code here:
        /*    char c=evt.getKeyChar();

        if ( !(Character.isDigit(c)

            ||(c==KeyEvent.VK_DELETE)

            ||(c==KeyEvent.VK_BACK_SPACE)
            ||(c==KeyEvent.VK_PERIOD))
        )
        {

            //         JOptionPane.showMessageDialog(null, "I AMA kEY nOT nUMERIC");
            getToolkit().beep();

            evt.consume();

        }*/
    }//GEN-LAST:event_TxtPrdPrixKeyTyped

    private void TxtPrdPrix5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix5FocusGained

    private void TxtPrdPrix5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix5FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix5FocusLost

    private void TxtPrdPrix5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrdPrix5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix5ActionPerformed

    private void TxtPrdPrix5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix5KeyPressed

    private void TxtPrdPrix5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix5KeyTyped

    private void TxtPrdPrix6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix6FocusGained

    private void TxtPrdPrix6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix6FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix6FocusLost

    private void TxtPrdPrix6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrdPrix6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix6ActionPerformed

    private void TxtPrdPrix6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix6KeyPressed

    private void TxtPrdPrix6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix6KeyTyped

    private void TxtPrdDesg2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdDesg2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdDesg2FocusGained

    private void TxtPrdDesg2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdDesg2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdDesg2FocusLost

    private void TxtPrdDesg2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdDesg2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdDesg2KeyPressed

    private void TxtPrdDesg2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdDesg2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdDesg2KeyReleased

    private void TxtPrdDesg2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdDesg2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdDesg2KeyTyped

    private void TxtPrdDesg3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdDesg3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdDesg3FocusGained

    private void TxtPrdDesg3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdDesg3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdDesg3FocusLost

    private void TxtPrdDesg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrdDesg3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdDesg3ActionPerformed

    private void TxtPrdDesg3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdDesg3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdDesg3KeyPressed

    private void TxtPrdDesg3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdDesg3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdDesg3KeyReleased

    private void TxtPrdDesg3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdDesg3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdDesg3KeyTyped

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

    private void TxtPrdPrix7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix7FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix7FocusGained

    private void TxtPrdPrix7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix7FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix7FocusLost

    private void TxtPrdPrix7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrdPrix7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix7ActionPerformed

    private void TxtPrdPrix7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix7KeyPressed

    private void TxtPrdPrix7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix7KeyTyped

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void TxtPrdPrix8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix8FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix8FocusGained

    private void TxtPrdPrix8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPrdPrix8FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix8FocusLost

    private void TxtPrdPrix8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrdPrix8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix8ActionPerformed

    private void TxtPrdPrix8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix8KeyPressed

    private void TxtPrdPrix8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrdPrix8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrdPrix8KeyTyped

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
    private javax.swing.JLabel Frn_ID10;
    private javax.swing.JLabel Frn_ID11;
    private javax.swing.JLabel Frn_ID12;
    private javax.swing.JLabel Frn_ID15;
    private javax.swing.JLabel Frn_ID17;
    private javax.swing.JLabel Frn_ID19;
    private javax.swing.JLabel Frn_ID20;
    private javax.swing.JLabel Frn_ID21;
    private javax.swing.JLabel Frn_ID22;
    private javax.swing.JLabel Frn_ID28;
    private javax.swing.JLabel Frn_ID29;
    private javax.swing.JLabel Frn_ID3;
    private javax.swing.JLabel Frn_ID4;
    private javax.swing.JLabel Frn_ID5;
    private javax.swing.JLabel Frn_ID6;
    private javax.swing.JLabel Frn_ID9;
    private javax.swing.JLabel Nbr_Pcs_label1;
    private javax.swing.JTextField TxtPrdDesg2;
    private javax.swing.JTextField TxtPrdDesg3;
    private javax.swing.JTextField TxtPrdPrix;
    private javax.swing.JTextField TxtPrdPrix1;
    private javax.swing.JTextField TxtPrdPrix5;
    private javax.swing.JTextField TxtPrdPrix6;
    private javax.swing.JTextField TxtPrdPrix7;
    private javax.swing.JTextField TxtPrdPrix8;
    private java.awt.Choice choice2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
