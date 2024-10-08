/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IinformationController;
import database.transactions.AccountInformation;
import database.transactions.TransferSendMoney;
import gui.Settings.ActionSettings;
import gui.Settings.Dialogs;
import gui.Settings.IRegulator;
import gui.Settings.TextSettings;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class TransferScreen extends javax.swing.JFrame implements IRegulator,IinformationController{
private TransferSendMoney transferSendMoneyObject=null;
    
    private int transferAmount=0;
private final String PersonSend="";

    /**
     * Creates new form TransferScreen
     */
    public TransferScreen() {
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

        transferScreenPanel = new javax.swing.JPanel();
        lblNameSurname3 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        balancaLabel = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        txtTransferPerson = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        nameSurnameLabel = new javax.swing.JLabel();
        btnOk = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        txtSendPerson = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        transferScreenPanel.setBackground(new java.awt.Color(0, 51, 0));
        transferScreenPanel.setForeground(new java.awt.Color(102, 0, 102));

        lblNameSurname3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblNameSurname3.setForeground(new java.awt.Color(255, 255, 255));
        lblNameSurname3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameSurname3.setText("TRANSFER PAGE");

        lbl10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl10.setForeground(new java.awt.Color(255, 255, 255));
        lbl10.setText("A maximum of 20.000 TL can be transfer at a time.");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Exclamation Point Key.png"))); // NOI18N

        lbl11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl11.setForeground(new java.awt.Color(255, 255, 255));
        lbl11.setText("BALANCE:");

        balancaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        balancaLabel.setForeground(new java.awt.Color(255, 255, 255));
        balancaLabel.setText("[BALANCE]");

        lbl12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl12.setForeground(new java.awt.Color(255, 255, 255));
        lbl12.setText("PERSON TO BE SEND NO:");

        txtTransferPerson.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTransferPersonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTransferPersonFocusLost(evt);
            }
        });
        txtTransferPerson.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTransferPersonKeyReleased(evt);
            }
        });

        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/OK Button.png"))); // NOI18N
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Male User.png"))); // NOI18N

        nameSurnameLabel.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        nameSurnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameSurnameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameSurnameLabel.setText("[USER NAME AND SURNAME]");

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Back.png"))); // NOI18N
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Card Payment.png"))); // NOI18N

        lbl13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl13.setForeground(new java.awt.Color(255, 255, 255));
        lbl13.setText("AMOUNT TO BE TRANSFER:");

        javax.swing.GroupLayout transferScreenPanelLayout = new javax.swing.GroupLayout(transferScreenPanel);
        transferScreenPanel.setLayout(transferScreenPanelLayout);
        transferScreenPanelLayout.setHorizontalGroup(
            transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferScreenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transferScreenPanelLayout.createSequentialGroup()
                        .addComponent(btnOk)
                        .addGap(134, 134, 134)
                        .addComponent(lblNameSurname3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferScreenPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(lbl10)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferScreenPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameSurnameLabel)
                                .addGroup(transferScreenPanelLayout.createSequentialGroup()
                                    .addComponent(lbl11)
                                    .addGap(18, 18, 18)
                                    .addComponent(balancaLabel))
                                .addGroup(transferScreenPanelLayout.createSequentialGroup()
                                    .addGroup(transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(transferScreenPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lbl12))
                                        .addGroup(transferScreenPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbl13)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtTransferPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSendPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnOK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))))
        );
        transferScreenPanelLayout.setVerticalGroup(
            transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferScreenPanelLayout.createSequentialGroup()
                .addGroup(transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transferScreenPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnOk))
                    .addGroup(transferScreenPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblNameSurname3)))
                .addGap(38, 38, 38)
                .addComponent(nameSurnameLabel)
                .addGap(33, 33, 33)
                .addGroup(transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl11)
                    .addComponent(balancaLabel))
                .addGap(52, 52, 52)
                .addGroup(transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transferScreenPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl12)
                            .addComponent(txtSendPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl13)
                            .addComponent(txtTransferPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transferScreenPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(transferScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transferScreenPanelLayout.createSequentialGroup()
                        .addComponent(lbl10)
                        .addGap(14, 14, 14))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transferScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(transferScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getedits() {
        this.setLocationRelativeTo(null);
        transferScreenPanel.setFocusable(true);
        TextSettings.setOnlyNumber(txtTransferPerson);
        TextSettings.setMaxLimit(txtTransferPerson, 5);
        TextSettings.setOnlyNumber(txtSendPerson);
        txtSendPerson.setText(PersonSend);
        this.nameSurnameLabel.setText(this.accountInformation().getNameSurname());
        this.balancaLabel.setText(String.valueOf(this.accountInformation().getBalance()));
    }

    public TransferSendMoney getTransferSendMoneyObject() {
        if (this.transferSendMoneyObject==null) {
            transferSendMoneyObject=new TransferSendMoney();
        }
        return transferSendMoneyObject;
    }

    
    @Override
    public boolean informationIsValid() {
return !(this.txtSendPerson.getText().equals("")|| this.txtTransferPerson.getText().equals(""));
    }

    @Override
  public AccountInformation accountInformation() {
   return AccountInformation.getInstace(); 
}

    
    

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        ActionSettings.setVisible(this, new AccountScreen());
    }//GEN-LAST:event_btnOkMouseClicked

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        if (this.informationIsValid()) {
            this.sendMoney();
        }
        else{
            Dialogs.spaceError(this);
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void sendMoney(){
    getTransferSendMoneyObject().setMoney(this.transferAmount);
    getTransferSendMoneyObject().setPerson(this.txtSendPerson.getText());
    if (getTransferSendMoneyObject().transferIsOkey()) {
        Dialogs.showPrivateMessage(this, "Transfer process successful!");
        ActionSettings.setVisible(this, new TransferScreen());
    }else{
        Dialogs.showPrivateMessage(this, "Transfer failed\nPlease try again!");
    }
}

    private void txtTransferPersonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTransferPersonKeyReleased
        this.transferAmount=TextSettings.checkTheKeyReleased(txtTransferPerson, 20000);
        System.out.println(transferAmount);
    }//GEN-LAST:event_txtTransferPersonKeyReleased

    private void txtTransferPersonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTransferPersonFocusGained
     TextSettings.chechTheTextFocusGained(txtTransferPerson, PersonSend);
    }//GEN-LAST:event_txtTransferPersonFocusGained

    private void txtTransferPersonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTransferPersonFocusLost
     TextSettings.checkTheTextFocusLost(txtTransferPerson);
    }//GEN-LAST:event_txtTransferPersonFocusLost

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
            java.util.logging.Logger.getLogger(TransferScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balancaLabel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel btnOk;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lblNameSurname3;
    private javax.swing.JLabel nameSurnameLabel;
    private javax.swing.JPanel transferScreenPanel;
    private javax.swing.JTextField txtSendPerson;
    private javax.swing.JTextField txtTransferPerson;
    // End of variables declaration//GEN-END:variables
}
