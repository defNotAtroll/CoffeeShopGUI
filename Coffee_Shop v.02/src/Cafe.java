import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cafe extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    
    public Cafe() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingOrdersTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        americanoC = new javax.swing.JCheckBox();
        expressoC = new javax.swing.JCheckBox();
        cappuccinoC = new javax.swing.JCheckBox();
        gingerTeaC = new javax.swing.JCheckBox();
        latteMacchiatoC = new javax.swing.JCheckBox();
        oolongTeaC = new javax.swing.JCheckBox();
        masalaChaiC = new javax.swing.JCheckBox();
        greenTeaC = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        baguetteS = new javax.swing.JCheckBox();
        croissantS = new javax.swing.JCheckBox();
        doughnutS = new javax.swing.JCheckBox();
        cinnamonRollsS = new javax.swing.JCheckBox();
        wafflesS = new javax.swing.JCheckBox();
        tiramisuS = new javax.swing.JCheckBox();
        wheatToastS = new javax.swing.JCheckBox();
        eggSandwichS = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ConfirmBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        totalTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        taxTF = new javax.swing.JTextField();
        subtotalTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        calculateBtn = new javax.swing.JButton();
        resetTableBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cafe");

        pendingOrdersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Queue", "Orders", "Price", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pendingOrdersTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Pending Orders");

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setText("COMPLETE AN ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("CANCEL AN ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(204, 204, 204));
        exitBtn.setText("EXIT APPLICATION");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        americanoC.setText("A1 Americano PHP 50.00");
        americanoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americanoCActionPerformed(evt);
            }
        });

        expressoC.setText("A2 Expresso PHP 50.00");

        cappuccinoC.setText("A3 Cappuccino PHP 70.00");

        gingerTeaC.setText("A8 Ginger Tea PHP 65.75");

        latteMacchiatoC.setText("A4 Latte Macchiato PHP 65.00");

        oolongTeaC.setText("A5 Oolong Tea PHP 45.00");

        masalaChaiC.setText("A7 Masala Chai PHP 55.00");

        greenTeaC.setText("A6 Green Tea PHP 45.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(greenTeaC)
                    .addComponent(gingerTeaC)
                    .addComponent(masalaChaiC)
                    .addComponent(oolongTeaC)
                    .addComponent(latteMacchiatoC)
                    .addComponent(cappuccinoC)
                    .addComponent(expressoC)
                    .addComponent(americanoC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(americanoC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expressoC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cappuccinoC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(latteMacchiatoC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oolongTeaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greenTeaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(masalaChaiC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gingerTeaC)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        baguetteS.setText("B1 Baguette PHP 25.00");

        croissantS.setText("B2 Croissant PHP 30.00");

        doughnutS.setText("B3 Doughnut PHP 30.00");

        cinnamonRollsS.setText("B4 Cinnamon Rolls PHP 45.25");

        wafflesS.setText("B5 Waffles PHP 35.00");

        tiramisuS.setText("B6 Tiramisu PHP 50.00");

        wheatToastS.setText("B7 Wheat Toast PHP 20.00");

        eggSandwichS.setText("B8 Egg Sandwich PHP 45.75");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eggSandwichS)
                    .addComponent(wheatToastS)
                    .addComponent(tiramisuS)
                    .addComponent(wafflesS)
                    .addComponent(cinnamonRollsS)
                    .addComponent(doughnutS)
                    .addComponent(croissantS)
                    .addComponent(baguetteS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(baguetteS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(croissantS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doughnutS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cinnamonRollsS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wafflesS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiramisuS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wheatToastS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eggSandwichS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Snacks");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Drinks");

        ConfirmBtn.setBackground(new java.awt.Color(51, 255, 0));
        ConfirmBtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ConfirmBtn.setText("CONFIRM");
        ConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(255, 0, 0));
        resetBtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        resetBtn.setText("RESET");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        totalTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTFActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("TOTAL");

        taxTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        taxTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxTFActionPerformed(evt);
            }
        });

        subtotalTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subtotalTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalTFActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("TAX");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("SUBTOTAL");

        calculateBtn.setBackground(new java.awt.Color(204, 204, 204));
        calculateBtn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        calculateBtn.setText("CALCULATE");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        resetTableBtn.setBackground(new java.awt.Color(204, 204, 204));
        resetTableBtn.setText("RESET TABLE");
        resetTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTableBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6))
                                                .addGap(35, 35, 35)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(totalTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(subtotalTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(taxTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(calculateBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ConfirmBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(resetBtn))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resetTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtotalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taxTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(resetBtn)
                            .addComponent(ConfirmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void americanoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americanoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_americanoCActionPerformed

    private void totalTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTFActionPerformed

    private void ConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBtnActionPerformed
        String Queue = "no.1";
        String Orders = "";
        if(americanoC.isSelected()){
            Orders = Orders + "A1";
        }
        if(expressoC.isSelected()){
            Orders = Orders + "A2 ";
        }
        if(cappuccinoC.isSelected()){
            Orders = Orders + "A3 ";
        }
        if(latteMacchiatoC.isSelected()){
            Orders = Orders + "A4 ";
        }
        if(oolongTeaC.isSelected()){
            Orders = Orders + "A5 ";
        }
        if(greenTeaC.isSelected()){
            Orders = Orders + "A6 ";
        }
        if(masalaChaiC.isSelected()){
            Orders = Orders + "A7 ";
        }
        if(gingerTeaC.isSelected()){
            Orders = Orders + "A7 ";
        }
        
        
        if(baguetteS.isSelected()){
            Orders = Orders + "B1 ";
        }
        if(croissantS.isSelected()){
            Orders = Orders + "B2 ";
        }
        if(doughnutS.isSelected()){
            Orders = Orders + "B3 ";
        }
        if(cinnamonRollsS.isSelected()){
            Orders = Orders + "B4 ";
        }
        if(wafflesS.isSelected()){
            Orders = Orders + "B5 ";
        }
        if(tiramisuS.isSelected()){
            Orders = Orders + "B6 ";
        }
        if(wheatToastS.isSelected()){
            Orders = Orders + "B7 ";
        }
        if(eggSandwichS.isSelected()){
            Orders = Orders + "B8 ";
        }
        
        double subtotal=0, tax=0;
        final double TaxRate = 0.06;
        
        if(americanoC.isSelected()){
            subtotal = subtotal + 50.00;
        }
        if(expressoC.isSelected()){
            subtotal = subtotal + 50.00;
        }
        if(cappuccinoC.isSelected()){
            subtotal = subtotal + 70.00;
        }
        if(latteMacchiatoC.isSelected()){
            subtotal = subtotal + 65.00;
        }
        if(oolongTeaC.isSelected()){
            subtotal = subtotal + 45.00;
        }
        if(greenTeaC.isSelected()){
            subtotal = subtotal + 45.00;
        }
        if(masalaChaiC.isSelected()){
            subtotal = subtotal + 55.00;
        }
        if(gingerTeaC.isSelected()){
            subtotal = subtotal + 65.75;
        }
        
        
        
        if(baguetteS.isSelected()){
            subtotal = subtotal + 25.00;
        }
        if(croissantS.isSelected()){
            subtotal = subtotal + 30.00;
        }
        if(doughnutS.isSelected()){
            subtotal = subtotal + 30.00;
        }
        if(cinnamonRollsS.isSelected()){
            subtotal = subtotal + 45.25;
        }
        if(wafflesS.isSelected()){
            subtotal = subtotal + 35.00;
        }
        if(tiramisuS.isSelected()){
            subtotal = subtotal + 50.00;
        }
        if(wheatToastS.isSelected()){
            subtotal = subtotal + 20.00;
        }
        if(eggSandwichS.isSelected()){
            subtotal = subtotal + 45.75;
        }
        
        tax = subtotal * TaxRate;
        total = subtotal + tax;
        
        String Price = String.valueOf(total);
        String State = "Pending";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbpendingorders","root","");
            pst = con.prepareStatement("insert into tbpendingorders (Queue,Orders,Price,State) values (?,?,?,?)");
            
            pst.setString(1, Queue);
            pst.setString(2, Orders);
            pst.setString(3, Price);
            pst.setString(4, State);
            pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "New order has been added");
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            Logger.getLogger(Cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_ConfirmBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void taxTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxTFActionPerformed

    private void subtotalTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtotalTFActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        americanoC.setSelected(false);
        expressoC.setSelected(false);
        cappuccinoC.setSelected(false);
        latteMacchiatoC.setSelected(false);
        oolongTeaC.setSelected(false);
        greenTeaC.setSelected(false);
        masalaChaiC.setSelected(false);
        gingerTeaC.setSelected(false);

        baguetteS.setSelected(false);
        croissantS.setSelected(false);
        doughnutS.setSelected(false);
        cinnamonRollsS.setSelected(false);
        wafflesS.setSelected(false);
        tiramisuS.setSelected(false);
        wheatToastS.setSelected(false);
        eggSandwichS.setSelected(false);

        subtotalTF.setText("");
        taxTF.setText("");
        totalTF.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed
double total=0;
    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        double subtotal=0, tax=0;
        final double TaxRate = 0.06;
        
        if(americanoC.isSelected()){
            subtotal = subtotal + 50.00;
        }
        if(expressoC.isSelected()){
            subtotal = subtotal + 50.00;
        }
        if(cappuccinoC.isSelected()){
            subtotal = subtotal + 70.00;
        }
        if(latteMacchiatoC.isSelected()){
            subtotal = subtotal + 65.00;
        }
        if(oolongTeaC.isSelected()){
            subtotal = subtotal + 45.00;
        }
        if(greenTeaC.isSelected()){
            subtotal = subtotal + 45.00;
        }
        if(masalaChaiC.isSelected()){
            subtotal = subtotal + 55.00;
        }
        if(gingerTeaC.isSelected()){
            subtotal = subtotal + 65.75;
        }
        
        
        
        if(baguetteS.isSelected()){
            subtotal = subtotal + 25.00;
        }
        if(croissantS.isSelected()){
            subtotal = subtotal + 30.00;
        }
        if(doughnutS.isSelected()){
            subtotal = subtotal + 30.00;
        }
        if(cinnamonRollsS.isSelected()){
            subtotal = subtotal + 45.25;
        }
        if(wafflesS.isSelected()){
            subtotal = subtotal + 35.00;
        }
        if(tiramisuS.isSelected()){
            subtotal = subtotal + 50.00;
        }
        if(wheatToastS.isSelected()){
            subtotal = subtotal + 20.00;
        }
        if(eggSandwichS.isSelected()){
            subtotal = subtotal + 45.75;
        }
        
        tax = subtotal * TaxRate;
        total = subtotal + tax;
        
        subtotalTF.setText(String.format("%.2f",subtotal));
        taxTF.setText(String.format("%.2f",tax));
        totalTF.setText(String.format("%.2f",total));
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void resetTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTableBtnActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbpendingorders","root","");
            pst = con.prepareStatement("DELETE FROM tbpendingorders;");
            
            pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "The orders has successfully reset.");
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            Logger.getLogger(Cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resetTableBtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(Cafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cafe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cafe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmBtn;
    private javax.swing.JCheckBox americanoC;
    private javax.swing.JCheckBox baguetteS;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JCheckBox cappuccinoC;
    private javax.swing.JCheckBox cinnamonRollsS;
    private javax.swing.JCheckBox croissantS;
    private javax.swing.JCheckBox doughnutS;
    private javax.swing.JCheckBox eggSandwichS;
    private javax.swing.JButton exitBtn;
    private javax.swing.JCheckBox expressoC;
    private javax.swing.JCheckBox gingerTeaC;
    private javax.swing.JCheckBox greenTeaC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox latteMacchiatoC;
    private javax.swing.JCheckBox masalaChaiC;
    private javax.swing.JCheckBox oolongTeaC;
    private javax.swing.JTable pendingOrdersTable;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton resetTableBtn;
    private javax.swing.JTextField subtotalTF;
    private javax.swing.JTextField taxTF;
    private javax.swing.JCheckBox tiramisuS;
    private javax.swing.JTextField totalTF;
    private javax.swing.JCheckBox wafflesS;
    private javax.swing.JCheckBox wheatToastS;
    // End of variables declaration//GEN-END:variables
}
