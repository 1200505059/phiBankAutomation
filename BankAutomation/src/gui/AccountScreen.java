/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IinformationController;
import database.transactions.AccountInformation;
import gui.Settings.ActionSettings;
import gui.Settings.Dialogs;
import gui.Settings.IRegulator;
import gui.Settings.IconSetting;
import gui.Settings.buttonSettings;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import javax.swing.JButton;

/**
 *
 * @author pc
 */
public class AccountScreen extends javax.swing.JFrame implements IRegulator,IinformationController{

    /**
     * Creates new form AccountScreen
     */
    public AccountScreen() {
        initComponents();
        getedits();
        System.out.println(accountInformation().getNameSurname());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccountScreenPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userNameSurnameLabel = new javax.swing.JLabel();
        IconBalance = new javax.swing.JLabel();
        userBalanceLabel = new javax.swing.JLabel();
        WithdrawalIcon = new javax.swing.JLabel();
        btnWithDrawal = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        DepositIcon = new javax.swing.JLabel();
        btnTransfer = new javax.swing.JButton();
        TransferIcon = new javax.swing.JLabel();
        IconExit = new javax.swing.JLabel();
        btnPayments = new javax.swing.JButton();
        PaymentsIcon = new javax.swing.JLabel();
        IconSettings = new javax.swing.JLabel();
        lbltl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PHI BANK ACCOUNT SCREEN");
        setResizable(false);

        AccountScreenPanel.setBackground(new java.awt.Color(0, 0, 102));
        AccountScreenPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME");

        userNameSurnameLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        userNameSurnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameSurnameLabel.setText("[ NAME SURNAME ]");

        IconBalance.setForeground(new java.awt.Color(255, 255, 255));
        IconBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Turkish Lira1.png"))); // NOI18N

        userBalanceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userBalanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        userBalanceLabel.setText("[ BALANCE ]");

        WithdrawalIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Request Money.png"))); // NOI18N

        btnWithDrawal.setBackground(new java.awt.Color(255, 215, 0));
        btnWithDrawal.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnWithDrawal.setForeground(new java.awt.Color(255, 255, 255));
        btnWithDrawal.setText("WITHDRAWAL");
        btnWithDrawal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWithDrawal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnWithDrawalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnWithDrawalMouseExited(evt);
            }
        });
        btnWithDrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithDrawalActionPerformed(evt);
            }
        });

        btnDeposit.setBackground(new java.awt.Color(255, 215, 0));
        btnDeposit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposit.setText("DEPOSIT");
        btnDeposit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepositMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepositMouseExited(evt);
            }
        });
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        DepositIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Safe.png"))); // NOI18N

        btnTransfer.setBackground(new java.awt.Color(255, 215, 0));
        btnTransfer.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnTransfer.setForeground(new java.awt.Color(255, 255, 255));
        btnTransfer.setText("TRANSFER");
        btnTransfer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTransferMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTransferMouseExited(evt);
            }
        });
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        TransferIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Exchange.png"))); // NOI18N

        IconExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Logout.png"))); // NOI18N
        IconExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IconExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconExitMouseClicked(evt);
            }
        });

        btnPayments.setBackground(new java.awt.Color(255, 215, 0));
        btnPayments.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnPayments.setForeground(new java.awt.Color(255, 255, 255));
        btnPayments.setText("PAYMENTS");
        btnPayments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPayments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPaymentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPaymentsMouseExited(evt);
            }
        });
        btnPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentsActionPerformed(evt);
            }
        });

        PaymentsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Cash and Credit Card.png"))); // NOI18N

        IconSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Settings.png"))); // NOI18N
        IconSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IconSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconSettingsMouseClicked(evt);
            }
        });

        lbltl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbltl.setForeground(new java.awt.Color(255, 255, 255));
        lbltl.setText("TL");

        javax.swing.GroupLayout AccountScreenPanelLayout = new javax.swing.GroupLayout(AccountScreenPanel);
        AccountScreenPanel.setLayout(AccountScreenPanelLayout);
        AccountScreenPanelLayout.setHorizontalGroup(
            AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IconExit)
                        .addGap(18, 18, 18)
                        .addComponent(IconBalance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                                .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNameSurnameLabel)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IconSettings))
                            .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                                .addComponent(userBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbltl, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(WithdrawalIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(DepositIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addGap(52, 52, 52))
                            .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                                .addComponent(btnWithDrawal)
                                .addGap(47, 47, 47)
                                .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TransferIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(btnPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(PaymentsIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))))))
                .addContainerGap())
        );

        AccountScreenPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DepositIcon, TransferIcon, WithdrawalIcon});

        AccountScreenPanelLayout.setVerticalGroup(
            AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IconExit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addComponent(userNameSurnameLabel)
                            .addGap(18, 18, 18)
                            .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(userBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbltl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountScreenPanelLayout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(IconBalance)))
                    .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(IconSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AccountScreenPanelLayout.createSequentialGroup()
                        .addComponent(WithdrawalIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnWithDrawal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AccountScreenPanelLayout.createSequentialGroup()
                        .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AccountScreenPanelLayout.createSequentialGroup()
                                .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TransferIcon)
                                    .addComponent(PaymentsIcon))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountScreenPanelLayout.createSequentialGroup()
                                .addComponent(DepositIcon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AccountScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        AccountScreenPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDeposit, btnPayments, btnTransfer, btnWithDrawal});

        AccountScreenPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DepositIcon, TransferIcon, WithdrawalIcon});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccountScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccountScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
// Button Color Settings
     private void setBg(Component c  ){
        buttonSettings.setBg((JButton)c,Color.black);
    }
    private void btnWithDrawalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithDrawalMouseEntered
        this.setBg(evt.getComponent());
        IconSetting.changeIcon(WithdrawalIcon, "req1");
    }//GEN-LAST:event_btnWithDrawalMouseEntered

    private void btnWithDrawalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWithDrawalMouseExited
        buttonSettings.setOriginalBg((JButton)evt.getComponent());
        IconSetting.setOriginalIcon(WithdrawalIcon);
    }//GEN-LAST:event_btnWithDrawalMouseExited

    private void btnDepositMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositMouseEntered
                this.setBg(evt.getComponent());
                 IconSetting.changeIcon(DepositIcon, "Safe Out");

    }//GEN-LAST:event_btnDepositMouseEntered

    private void btnDepositMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositMouseExited
                buttonSettings.setOriginalBg((JButton)evt.getComponent());
                 IconSetting.setOriginalIcon(DepositIcon);

    }//GEN-LAST:event_btnDepositMouseExited

    private void btnTransferMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferMouseEntered
                this.setBg(evt.getComponent());
                         IconSetting.changeIcon(TransferIcon, "Exchange2");

    }//GEN-LAST:event_btnTransferMouseEntered

    private void btnTransferMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferMouseExited
                buttonSettings.setOriginalBg((JButton)evt.getComponent());
                IconSetting.setOriginalIcon(TransferIcon);

    }//GEN-LAST:event_btnTransferMouseExited

    private void btnPaymentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaymentsMouseEntered
                this.setBg(evt.getComponent());
 IconSetting.changeIcon(PaymentsIcon, "Money Transfer");
    }//GEN-LAST:event_btnPaymentsMouseEntered

    private void btnPaymentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaymentsMouseExited
                buttonSettings.setOriginalBg((JButton)evt.getComponent());
                 IconSetting.setOriginalIcon(PaymentsIcon);

    }//GEN-LAST:event_btnPaymentsMouseExited

    private void btnWithDrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithDrawalActionPerformed
       ActionSettings.setVisible(this, new WithDrawalScreen());
    }//GEN-LAST:event_btnWithDrawalActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
         ActionSettings.setVisible(this, new DepositScreen());
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
         ActionSettings.setVisible(this, new TransferScreen());
    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentsActionPerformed
        ActionSettings.setVisible(this, new PaymentsScreen());
    }//GEN-LAST:event_btnPaymentsActionPerformed

    private void IconExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconExitMouseClicked
            String question="Do you confirm that you will be logged out of your account?" ;
            if (Dialogs.okMessage(this, question)==1) {
            this.logOut();
        }

    }//GEN-LAST:event_IconExitMouseClicked
private void logOut(){
    accountInformation().logOut();
    ActionSettings.setVisible(this, new LoginScreen());
}
    private void IconSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconSettingsMouseClicked
             ActionSettings.setVisible(this, new SettingsScreen());

    }//GEN-LAST:event_IconSettingsMouseClicked

   
    
    @Override
    public void getedits() {
      this.setLocationRelativeTo(null);
      AccountScreenPanel.setFocusable(true);
      this.userNameSurnameLabel.setText(accountInformation().getNameSurname());
      this.userBalanceLabel.setText(String.valueOf(accountInformation().getBalance()));
    }

    @Override
    public boolean informationIsValid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AccountInformation accountInformation() {
return AccountInformation.getInstace();
        }

    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    try {
        // Yüklü tüm LookAndFeel seçeneklerini kontrol eder
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            // Eğer Nimbus teması varsa onu seç
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(AccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(AccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(AccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(AccountScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    // Nimbus teması çalışmazsa varsayılan tema kullanılır
    try {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
        e.printStackTrace();
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new AccountScreen().setVisible(true);
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccountScreenPanel;
    private javax.swing.JLabel DepositIcon;
    private javax.swing.JLabel IconBalance;
    private javax.swing.JLabel IconExit;
    private javax.swing.JLabel IconSettings;
    private javax.swing.JLabel PaymentsIcon;
    private javax.swing.JLabel TransferIcon;
    private javax.swing.JLabel WithdrawalIcon;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnPayments;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JButton btnWithDrawal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbltl;
    private javax.swing.JLabel userBalanceLabel;
    private javax.swing.JLabel userNameSurnameLabel;
    // End of variables declaration//GEN-END:variables
}
