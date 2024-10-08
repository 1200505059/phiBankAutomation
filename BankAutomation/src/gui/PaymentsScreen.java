/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IinformationController;
import database.transactions.AccountInformation;
import database.transactions.invoicesPayments;
import gui.Settings.ActionSettings;
import gui.Settings.Dialogs;
import gui.Settings.IRegulator;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class PaymentsScreen extends javax.swing.JFrame implements IRegulator,IinformationController{
private invoicesPayments paymentsObject=null;
  
    public PaymentsScreen() {
        initComponents();
        getedits();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton10 = new javax.swing.JButton();
        PaymentsPanel = new javax.swing.JPanel();
        nameSurnameLabel = new javax.swing.JLabel();
        lblNameSurname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        waterBillLabel = new javax.swing.JLabel();
        houseRentLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        electricBillLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gasBillLabel = new javax.swing.JLabel();
        btnHouseRentPay = new javax.swing.JButton();
        btnWaterBillPay = new javax.swing.JButton();
        BtnGasBillPay = new javax.swing.JButton();
        BtnElectricBillPay = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        internetBillLabel = new javax.swing.JLabel();
        btnInternetBill = new javax.swing.JButton();

        jButton10.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PaymentsPanel.setBackground(new java.awt.Color(51, 51, 51));

        nameSurnameLabel.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        nameSurnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameSurnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameSurnameLabel.setText("[USER NAME AND SURNAME]");

        lblNameSurname.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblNameSurname.setForeground(new java.awt.Color(255, 255, 255));
        lblNameSurname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameSurname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/2942632_credit_mastercard_money_online_pay_icon.png"))); // NOI18N
        lblNameSurname.setText("PAYMENTS PAGE");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Back.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("house rent :");

        waterBillLabel.setBackground(new java.awt.Color(255, 255, 255));
        waterBillLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        waterBillLabel.setForeground(new java.awt.Color(255, 255, 255));
        waterBillLabel.setText("[WATER BILL]");

        houseRentLabel.setBackground(new java.awt.Color(255, 255, 255));
        houseRentLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        houseRentLabel.setForeground(new java.awt.Color(255, 255, 255));
        houseRentLabel.setText("[HOUSE RENT]");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("water bill :");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Electiric bill :");

        electricBillLabel.setBackground(new java.awt.Color(255, 255, 255));
        electricBillLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        electricBillLabel.setForeground(new java.awt.Color(255, 255, 255));
        electricBillLabel.setText("[ELECTIRIC BILL]");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Natural Gas bill :");

        gasBillLabel.setBackground(new java.awt.Color(255, 255, 255));
        gasBillLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        gasBillLabel.setForeground(new java.awt.Color(255, 255, 255));
        gasBillLabel.setText("[GAS BILL]");

        btnHouseRentPay.setBackground(new java.awt.Color(102, 102, 102));
        btnHouseRentPay.setForeground(new java.awt.Color(255, 255, 255));
        btnHouseRentPay.setText("PAY");
        btnHouseRentPay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHouseRentPay.setPreferredSize(new java.awt.Dimension(80, 23));
        btnHouseRentPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHouseRentPayActionPerformed(evt);
            }
        });

        btnWaterBillPay.setBackground(new java.awt.Color(102, 102, 102));
        btnWaterBillPay.setForeground(new java.awt.Color(255, 255, 255));
        btnWaterBillPay.setText("PAY");
        btnWaterBillPay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWaterBillPay.setPreferredSize(new java.awt.Dimension(80, 23));
        btnWaterBillPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWaterBillPayActionPerformed(evt);
            }
        });

        BtnGasBillPay.setBackground(new java.awt.Color(102, 102, 102));
        BtnGasBillPay.setForeground(new java.awt.Color(255, 255, 255));
        BtnGasBillPay.setText("PAY");
        BtnGasBillPay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGasBillPay.setPreferredSize(new java.awt.Dimension(80, 23));
        BtnGasBillPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGasBillPayActionPerformed(evt);
            }
        });

        BtnElectricBillPay.setBackground(new java.awt.Color(102, 102, 102));
        BtnElectricBillPay.setForeground(new java.awt.Color(255, 255, 255));
        BtnElectricBillPay.setText("PAY");
        BtnElectricBillPay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnElectricBillPay.setPreferredSize(new java.awt.Dimension(80, 23));
        BtnElectricBillPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElectricBillPayActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Internet bill :");

        internetBillLabel.setBackground(new java.awt.Color(255, 255, 255));
        internetBillLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        internetBillLabel.setForeground(new java.awt.Color(255, 255, 255));
        internetBillLabel.setText("[INTERNET BILL]");

        btnInternetBill.setBackground(new java.awt.Color(102, 102, 102));
        btnInternetBill.setForeground(new java.awt.Color(255, 255, 255));
        btnInternetBill.setText("PAY");
        btnInternetBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInternetBill.setPreferredSize(new java.awt.Dimension(80, 23));
        btnInternetBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternetBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaymentsPanelLayout = new javax.swing.GroupLayout(PaymentsPanel);
        PaymentsPanel.setLayout(PaymentsPanelLayout);
        PaymentsPanelLayout.setHorizontalGroup(
            PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentsPanelLayout.createSequentialGroup()
                .addGroup(PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaymentsPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addComponent(lblNameSurname))
                    .addGroup(PaymentsPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PaymentsPanelLayout.createSequentialGroup()
                                .addGroup(PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PaymentsPanelLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(internetBillLabel))
                                    .addGroup(PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(PaymentsPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(gasBillLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(PaymentsPanelLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(houseRentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(PaymentsPanelLayout.createSequentialGroup()
                                                    .addGap(46, 46, 46)
                                                    .addComponent(jLabel5)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(waterBillLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PaymentsPanelLayout.createSequentialGroup()
                                                    .addGap(28, 28, 28)
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(electricBillLabel))))))
                                .addGap(18, 18, 18)
                                .addGroup(PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnHouseRentPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnWaterBillPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnElectricBillPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnGasBillPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInternetBill, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PaymentsPanelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(nameSurnameLabel)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        PaymentsPanelLayout.setVerticalGroup(
            PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentsPanelLayout.createSequentialGroup()
                .addGroup(PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaymentsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(PaymentsPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblNameSurname)))
                .addGap(33, 33, 33)
                .addComponent(nameSurnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(houseRentLabel)
                    .addComponent(btnHouseRentPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(waterBillLabel)
                    .addComponent(btnWaterBillPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(electricBillLabel)
                    .addComponent(BtnElectricBillPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gasBillLabel)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGasBillPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(internetBillLabel)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInternetBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaymentsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaymentsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getedits() {
        this.setLocationRelativeTo(null);
        PaymentsPanel.setFocusable(true);
        this.nameSurnameLabel.setText(accountInformation().getNameSurname());
        this.houseRentLabel.setText(String.valueOf(accountInformation().getHouseRent()));
        this.waterBillLabel.setText(String.valueOf(accountInformation().getWaterBill()));
        this.electricBillLabel.setText(String.valueOf(accountInformation().getElectricBill()));
        this.gasBillLabel.setText(String.valueOf(accountInformation().getNaturalGasBill()));
        this.internetBillLabel.setText(String.valueOf(accountInformation().getInternetBill()));
        
        
    }

    @Override
    public boolean informationIsValid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AccountInformation accountInformation() {
return AccountInformation.getInstace();
    }

    public invoicesPayments getPaymentsObject() {
        if (this.paymentsObject==null) {
            paymentsObject=new invoicesPayments();
        }
        return paymentsObject;
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ActionSettings.setVisible(this, new AccountScreen());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnHouseRentPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHouseRentPayActionPerformed
            double houseRent= Double.valueOf(this.houseRentLabel.getText());
               if (this.billIsOkey(houseRent)) {
                   Dialogs.showPrivateMessage(this, "the invoice has been paid before !");
        }else{
                   this.payBill("houseRent", houseRent);
               }
        
    }//GEN-LAST:event_btnHouseRentPayActionPerformed

    private void btnWaterBillPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWaterBillPayActionPerformed
                      double water= Double.valueOf(this.waterBillLabel.getText());
               if (this.billIsOkey(water)) {
                   Dialogs.showPrivateMessage(this, "the invoice has been paid before !");
        }else{
                   this.payBill("water", water);
               }

    }//GEN-LAST:event_btnWaterBillPayActionPerformed

    private void BtnElectricBillPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElectricBillPayActionPerformed
               double electric= Double.valueOf(this.electricBillLabel.getText());
               if (this.billIsOkey(electric)) {
                   Dialogs.showPrivateMessage(this, "the invoice has been paid before !");
        }else{
                   this.payBill("electric", electric);
               }

    }//GEN-LAST:event_BtnElectricBillPayActionPerformed

    private void BtnGasBillPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGasBillPayActionPerformed
             
                             double naturalGas= Double.valueOf(this.gasBillLabel.getText());
               if (this.billIsOkey(naturalGas)) {
                   Dialogs.showPrivateMessage(this, "the invoice has been paid before !");
        }else{
                   this.payBill("naturalGas", naturalGas);
               }


    }//GEN-LAST:event_BtnGasBillPayActionPerformed

    private void btnInternetBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInternetBillActionPerformed
                           double internet= Double.valueOf(this.internetBillLabel.getText());
               if (this.billIsOkey(internet)) {
                   Dialogs.showPrivateMessage(this, "the invoice has been paid before !");
        }else{
                   this.payBill("internet", internet);
               }


    }//GEN-LAST:event_btnInternetBillActionPerformed
private boolean billIsOkey( double bill){
   return bill==0.0;
}
private void payBill(String billName,double billMoney){
    this.getPaymentsObject().setBillName(billName);
     this.getPaymentsObject().setBillMoney(billMoney);
     if (getPaymentsObject().billIsOkey()) {
        Dialogs.showPrivateMessage(this, "Your invoice has been paid successfully.");
        ActionSettings.setVisible(this, new PaymentsScreen());
    }else{
               Dialogs.showPrivateMessage(this, "Payment transaction failed!");
     }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaymentsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnElectricBillPay;
    private javax.swing.JButton BtnGasBillPay;
    private javax.swing.JPanel PaymentsPanel;
    private javax.swing.JButton btnHouseRentPay;
    private javax.swing.JButton btnInternetBill;
    private javax.swing.JButton btnWaterBillPay;
    private javax.swing.JLabel electricBillLabel;
    private javax.swing.JLabel gasBillLabel;
    private javax.swing.JLabel houseRentLabel;
    private javax.swing.JLabel internetBillLabel;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblNameSurname;
    private javax.swing.JLabel nameSurnameLabel;
    private javax.swing.JLabel waterBillLabel;
    // End of variables declaration//GEN-END:variables
}
