/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matjarokom.ui.view;

import java.awt.Cursor;
import java.awt.Dimension;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import matjarokom.Model.com.SousUnit;
import matjarokom.Model.com.Unit;
import matjarokom.Model.com.Unit_SousUnit;

/**
 *
 * @author farid
 */
public class unitView extends javax.swing.JDialog {

    /**
     * Creates new form unitView
     */
    //how to change Size of jtable or jpanel
    Unit unit_getData, unit_SetData;
    SousUnitView SousUnitGetDataView;
    SousUnit Sousunit_GetData = new SousUnit();
    Unit_SousUnit unit_SousUnitGetData=new Unit_SousUnit();
    dialgMsgUnits UnitCnfMsg;

    public unitView(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ButtonGroup btnG = new ButtonGroup();
        btnG.add(OnePiece);
        btnG.add(ManyPiece);

        //ManyPiece.setSelected(true);
        UnitCnfMsg = new dialgMsgUnits(this, modal);
        SousUnitGetDataView = new SousUnitView(this, modal);

        unit_getData = new Unit();                        // Initialise Object Unit Of Get Data 

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(2);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        jTable1.getColumnModel().getColumn(4).setCellRenderer(cellRenderer);
//      jTable1.getColumnModel().getColumn(5).setCellRenderer(cellRenderer);
        super.setLocationRelativeTo(null);
        jPanel2.setPreferredSize(new Dimension(500, 20));
        //jPanel2.repaint();
        jPanel2.revalidate();
        //jPanel2.setSize(50, 50);

        // DisplayData_in_GUI_Unit();
    }

    public void DisplayData_in_GUI_Unit() { //display data In Component
        unit_getData.FillingAllUnit_InTable(jTable1); //// Fill Table In UnitView
        int OrderUnit = unit_getData.GetLast_Order_Unit() + 1;
        StringBuilder StBl = new StringBuilder();
        StBl.append(OrderUnit);
        LstOrd_Unit.setText(StBl.toString());

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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Unit_Nam = new javax.swing.JTextField();
        Unit_Desc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LstOrd_Unit = new javax.swing.JTextField();
        DelInputUntDt = new matjarokom.ui.view.ButtonView();
        CnlInputUntDt = new matjarokom.ui.view.ButtonView();
        UpdInputUntDt = new matjarokom.ui.view.ButtonView();
        SavInputUntDt = new matjarokom.ui.view.ButtonView();
        buttonView1 = new matjarokom.ui.view.ButtonView();
        ManyPiece = new javax.swing.JRadioButton();
        OnePiece = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PanPropManyPcs = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SousUnitCmbx = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 470, 250));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("ادخل اسم النوع");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 200, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/IconUnits.png"))); // NOI18N
        jLabel3.setText("الوحدة    :   ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 100, 30));

        Unit_Nam.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Unit_Nam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Unit_Nam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(Unit_Nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 200, 30));

        Unit_Desc.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Unit_Desc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Unit_Desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(Unit_Desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 200, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("لم يتم ادخال الوحدة الاساسية");
        jLabel2.setVisible(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/IconHashTagNbr.png"))); // NOI18N
        jLabel4.setText("الرقــم       :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 90, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 30, 20));

        LstOrd_Unit.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        LstOrd_Unit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LstOrd_Unit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LstOrd_Unit.setEnabled(false);
        jPanel2.add(LstOrd_Unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 90, 30));

        DelInputUntDt.setBackground(new java.awt.Color(255, 51, 51));
        DelInputUntDt.setForeground(new java.awt.Color(255, 255, 255));
        DelInputUntDt.setText("حذف");
        DelInputUntDt.setBackgroundPainted(true);
        DelInputUntDt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DelInputUntDt.setLineColor(new java.awt.Color(0, 51, 51));
        DelInputUntDt.setLinePainted(true);
        DelInputUntDt.setRounded(true);
        jPanel2.add(DelInputUntDt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 80, 30));

        CnlInputUntDt.setBackground(new java.awt.Color(255, 51, 51));
        CnlInputUntDt.setForeground(new java.awt.Color(255, 255, 255));
        CnlInputUntDt.setText("الغاء");
        CnlInputUntDt.setBackgroundPainted(true);
        CnlInputUntDt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CnlInputUntDt.setLineColor(new java.awt.Color(0, 51, 51));
        CnlInputUntDt.setLinePainted(true);
        CnlInputUntDt.setRounded(true);
        CnlInputUntDt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnlInputUntDtActionPerformed(evt);
            }
        });
        jPanel2.add(CnlInputUntDt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 30));

        UpdInputUntDt.setBackground(new java.awt.Color(255, 51, 51));
        UpdInputUntDt.setForeground(new java.awt.Color(255, 255, 255));
        UpdInputUntDt.setText("تعديل");
        UpdInputUntDt.setBackgroundPainted(true);
        UpdInputUntDt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UpdInputUntDt.setLineColor(new java.awt.Color(0, 51, 51));
        UpdInputUntDt.setLinePainted(true);
        UpdInputUntDt.setRounded(true);
        UpdInputUntDt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdInputUntDtActionPerformed(evt);
            }
        });
        jPanel2.add(UpdInputUntDt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 80, 30));

        SavInputUntDt.setBackground(new java.awt.Color(255, 51, 51));
        SavInputUntDt.setForeground(new java.awt.Color(255, 255, 255));
        SavInputUntDt.setText("حفظ");
        SavInputUntDt.setBackgroundPainted(true);
        SavInputUntDt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SavInputUntDt.setLineColor(new java.awt.Color(0, 51, 51));
        SavInputUntDt.setLinePainted(true);
        SavInputUntDt.setRounded(true);
        SavInputUntDt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SavInputUntDtMouseClicked(evt);
            }
        });
        SavInputUntDt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavInputUntDtActionPerformed(evt);
            }
        });
        jPanel2.add(SavInputUntDt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 80, 30));

        buttonView1.setBackground(new java.awt.Color(255, 255, 255));
        buttonView1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/SearchIconUnits.png"))); // NOI18N
        buttonView1.setBackgroundPainted(false);
        buttonView1.setOpaque(true);
        jPanel2.add(buttonView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 40, 30));

        ManyPiece.setBackground(new java.awt.Color(255, 255, 255));
        ManyPiece.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ManyPiece.setText("عدة وحدات");
        ManyPiece.setContentAreaFilled(false);
        ManyPiece.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManyPiece.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManyPiece.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        ManyPiece.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ManyPieceStateChanged(evt);
            }
        });
        ManyPiece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManyPieceActionPerformed(evt);
            }
        });
        jPanel2.add(ManyPiece, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        OnePiece.setBackground(new java.awt.Color(255, 255, 255));
        OnePiece.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OnePiece.setSelected(true);
        OnePiece.setText("وحدة واحدة");
        OnePiece.setContentAreaFilled(false);
        OnePiece.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OnePiece.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OnePiece.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        OnePiece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnePieceActionPerformed(evt);
            }
        });
        jPanel2.add(OnePiece, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("نوع الوحدة الداخلية");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 0, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/descIconUnit.png"))); // NOI18N
        jLabel6.setText("الوصف  :  ");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 100, 30));

        PanPropManyPcs.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/C_Add_Mini.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        SousUnitCmbx.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("نوع الوحدة الداخلية  :  ");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("قطعة،قارورة،علبة...");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout PanPropManyPcsLayout = new javax.swing.GroupLayout(PanPropManyPcs);
        PanPropManyPcs.setLayout(PanPropManyPcsLayout);
        PanPropManyPcsLayout.setHorizontalGroup(
            PanPropManyPcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanPropManyPcsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SousUnitCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanPropManyPcsLayout.setVerticalGroup(
            PanPropManyPcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanPropManyPcsLayout.createSequentialGroup()
                .addGroup(PanPropManyPcsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SousUnitCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(PanPropManyPcs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 470, 30));
        //jPanel2.setVisible(false);
        PanPropManyPcs.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int col = jTable1.columnAtPoint(evt.getPoint());
        int row = jTable1.rowAtPoint(evt.getPoint());
        DefaultTableModel defMdl = (DefaultTableModel) jTable1.getModel();
        int IdOrder = (int) jTable1.getValueAt(row, 4);
        byte conf;
        switch (col) {
            case 0:
                UnitCnfMsg.SetMsgTextShow("هل تريد حذف الوحدة");
                dialgMsgUnits.ShowmessgConf();
//           int Conf=JOptionPane.showConfirmDialog(this, "Confirm Delete data","Confirm ", JOptionPane.YES_NO_OPTION);
//           JOptionPane.showMessageDialog(null, Conf);

                conf = dialgMsgUnits.getYes_No();
                if (conf == 1) {
                    int valCon = unit_getData.DeleteUnit(IdOrder);
                    if (valCon > 0) {
                        defMdl.removeRow(row); //add Mesg information data;
                    }
                }
                // Function Delete Categorie
                //JOptionPane.showMessageDialog(null, "Col :"+jTable1.getSelectedColumn() +" === Row : "+jTable1.getSelectedRow());
                break;
            case 1:
                UnitCnfMsg.SetMsgTextShow("هل تريد تعديل الوحدة");
                dialgMsgUnits.ShowmessgConf();
                conf = dialgMsgUnits.getYes_No();
                if (conf == 1) {
                    Unit_Desc.setText((String) jTable1.getValueAt(row, 2));
                    Unit_Nam.setText((String) jTable1.getValueAt(row, 3));
                    int OrderUnit = (int) jTable1.getValueAt(row, 4);
                    LstOrd_Unit.setText((int) jTable1.getValueAt(row, 4) + "");
                    if (unit_getData.GetTypeUnite(OrderUnit) == 1) {
                        ManyPiece.setSelected(true);
                        
                    } else {
                        OnePiece.setSelected(true);
                    }
                }
                break;
        }

    }//GEN-LAST:event_jTable1MouseClicked


    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseMoved

        int col = jTable1.columnAtPoint(evt.getPoint());
        //int row=jTable1.rowAtPoint(evt.getPoint());

        Cursor handCursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
        Cursor DefaultCursor = Cursor.getDefaultCursor();

        switch (col) {
            case 0:
            case 1:
                //JOptionPane.showMessageDialog(null, "Col :"+jTable1.getSelectedColumn() +" === Row : "+jTable1.getSelectedRow());
                jTable1.setCursor(handCursor);
                break;

            default:
                jTable1.setCursor(DefaultCursor);
                break;
        }
    }//GEN-LAST:event_jTable1MouseMoved

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void SavInputUntDtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SavInputUntDtMouseClicked


    }//GEN-LAST:event_SavInputUntDtMouseClicked

    private void SavInputUntDtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavInputUntDtActionPerformed
        UnitCnfMsg.SetMsgTextShow("do you want to save new record ");
        dialgMsgUnits.ShowmessgConf();
        byte conf = dialgMsgUnits.getYes_No();
        byte Nbrpiece = 1;// for many sousUnit
        int id_SousUnit = 1;
        if (conf == 1) {

            if (OnePiece.isSelected()) {
                Nbrpiece = 0;   //  for no many sousunit in main unit 
            } else {  // for Many Pcs 
                
                id_SousUnit = Sousunit_GetData.GetID_SousUnit((String) SousUnitCmbx.getSelectedItem()); // get idSouUnit(ForgeinKey) of sousUnit For insert in table unit
            
            }
            unit_SetData = new Unit(Integer.valueOf(LstOrd_Unit.getText()), Unit_Nam.getText(), Unit_Desc.getText(), Nbrpiece);
            unit_SetData.addUnit();
            int MaxIdUnit=unit_SetData.GetLast_Order_Unit(); // Get Last Order in table Unit To save in RelationShip Unit & SousUnit
            unit_SousUnitGetData=new Unit_SousUnit(MaxIdUnit, id_SousUnit);
            unit_SousUnitGetData.AddRelationShipUnit_SousUnit();
            
            DisplayData_in_GUI_Unit();
            CnlInputUntDtActionPerformed(null);

        } else {
            CnlInputUntDtActionPerformed(null);
        }
        //DisplayData_in_GUI_Unit();


    }//GEN-LAST:event_SavInputUntDtActionPerformed

    private void CnlInputUntDtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnlInputUntDtActionPerformed
        Unit_Nam.setText("");
        Unit_Desc.setText("");
    }//GEN-LAST:event_CnlInputUntDtActionPerformed

    private void UpdInputUntDtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdInputUntDtActionPerformed

        byte Nbrpiece = 1;
        int id_SousUnit = 1;
        if (OnePiece.isSelected()) {
            Nbrpiece = 0;
        } else {
            id_SousUnit = Sousunit_GetData.GetID_SousUnit((String) SousUnitCmbx.getSelectedItem()); // get idSouUnit(ForgeinKey) of sousUnit For insert in table unit
        }
        unit_SetData = new Unit(Integer.valueOf(LstOrd_Unit.getText()), Unit_Nam.getText(), Unit_Desc.getText(), Nbrpiece);
        UnitCnfMsg.SetMsgTextShow("do you want to Update data ");
        dialgMsgUnits.ShowmessgConf();
        byte conf = dialgMsgUnits.getYes_No();
        if (conf == 1) {
            unit_SetData.UpdateUnit();      // update data 
            DisplayData_in_GUI_Unit();    // Reload data in frame 
            CnlInputUntDtActionPerformed(null);//n for clear textField 
            unit_SetData = null;   // free the object
        } else {
            CnlInputUntDtActionPerformed(null);
            unit_SetData = null;  // free the object of Unit
            //DisplayData_in_GUI_Unit();
        }
    }//GEN-LAST:event_UpdInputUntDtActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (Unit_Nam.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ادخل اسم الوحدة");
            jLabel2.setVisible(true);
        } else {
            SousUnitGetDataView.SetNameMainUnit(Unit_Nam.getText());// to display Main Unit for sous units
            SousUnitGetDataView.setLocationRelativeTo(this);
            SousUnitGetDataView.setVisible(true);

        }


    }//GEN-LAST:event_jLabel1MouseClicked

    private void ManyPieceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManyPieceActionPerformed
        if (ManyPiece.isSelected()) {
            PanPropManyPcs.setVisible(true);
        } else {
            PanPropManyPcs.setVisible(false);
        }
    }//GEN-LAST:event_ManyPieceActionPerformed

    private void OnePieceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnePieceActionPerformed
        if (OnePiece.isSelected()) {
            PanPropManyPcs.setVisible(false);
        } else {
            PanPropManyPcs.setVisible(true);
        }
    }//GEN-LAST:event_OnePieceActionPerformed

    private void ManyPieceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ManyPieceStateChanged
         if (ManyPiece.isSelected()) {
            PanPropManyPcs.setVisible(true);
        } else {
            PanPropManyPcs.setVisible(false);
        }
    }//GEN-LAST:event_ManyPieceStateChanged

    public void FillSousUnit() {  // to fill Combo for sous units
        int lenght = Sousunit_GetData.GetlistSousUnitsItems().size();
        SousUnitCmbx.removeAllItems();
        Iterator<SousUnit> itr = Sousunit_GetData.GetlistSousUnitsItems().iterator();
        SousUnit next;
        while (itr.hasNext()) {
            next = itr.next();
            SousUnitCmbx.addItem(next.getSousUnit_Name());
        }

    }

    public void SelectedSousUnit(String ItemSousUnit) {
        SousUnitCmbx.setSelectedItem(ItemSousUnit);
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(unitView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            unitView dialog = new unitView(null, true);
            dialog.DisplayData_in_GUI_Unit();

            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private matjarokom.ui.view.ButtonView CnlInputUntDt;
    private matjarokom.ui.view.ButtonView DelInputUntDt;
    private javax.swing.JTextField LstOrd_Unit;
    private javax.swing.JRadioButton ManyPiece;
    private javax.swing.JRadioButton OnePiece;
    private javax.swing.JPanel PanPropManyPcs;
    private matjarokom.ui.view.ButtonView SavInputUntDt;
    private javax.swing.JComboBox<String> SousUnitCmbx;
    private javax.swing.JTextField Unit_Desc;
    private javax.swing.JTextField Unit_Nam;
    private matjarokom.ui.view.ButtonView UpdInputUntDt;
    private matjarokom.ui.view.ButtonView buttonView1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
