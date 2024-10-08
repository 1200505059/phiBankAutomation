/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IinformationController;
import database.transactions.AccountInformation;
import database.transactions.UserSignUp;
import gui.Settings.ActionSettings;
import gui.Settings.Dialogs;
import gui.Settings.IRegulator;
import gui.Settings.TextSettings;
import gui.Settings.buttonSettings;
import java.awt.Color;
import java.awt.Dialog;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class SignUpScreen extends javax.swing.JFrame implements IRegulator,IinformationController {

   private UserSignUp userSignUpObject=null;
    
    
    public SignUpScreen() {
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

        SignUpScreenPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNameSurname = new javax.swing.JTextField();
        txtTCNumber = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbSecurityQuestion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        btnOk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PHI BANK SING UP SCREEN");
        setResizable(false);

        SignUpScreenPanel.setBackground(new java.awt.Color(102, 0, 51));
        SignUpScreenPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIGNUP SCREEN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("T.C NUMBER");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PHONE NUMBER ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NAME SURNAME");

        txtNameSurname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtTCNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("security information");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("personal information");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SECURITY QUESTION");

        cmbSecurityQuestion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbSecurityQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your favorite animal?", "What is your Mothers name?", "In what city were you born?", "What is your favorite book?", "what is your lucky number?" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ANSWER");

        txtAnswer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnSignUp.setBackground(new java.awt.Color(0, 51, 153));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("SINGUP");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignUpMouseExited(evt);
            }
        });
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Back.png"))); // NOI18N
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SignUpScreenPanelLayout = new javax.swing.GroupLayout(SignUpScreenPanel);
        SignUpScreenPanel.setLayout(SignUpScreenPanelLayout);
        SignUpScreenPanelLayout.setHorizontalGroup(
            SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpScreenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(134, 134, 134))
            .addGroup(SignUpScreenPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addGroup(SignUpScreenPanelLayout.createSequentialGroup()
                            .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(SignUpScreenPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(57, 57, 57))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpScreenPanelLayout.createSequentialGroup()
                                    .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(54, 54, 54)))
                            .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTCNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(SignUpScreenPanelLayout.createSequentialGroup()
                            .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8))
                            .addGap(33, 33, 33)
                            .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbSecurityQuestion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAnswer))))
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        SignUpScreenPanelLayout.setVerticalGroup(
            SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpScreenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOk)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtNameSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTCNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbSecurityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SignUpScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnSignUp)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SignUpScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseEntered
     buttonSettings.setBg(btnSignUp, Color.yellow);
    }//GEN-LAST:event_btnSignUpMouseEntered

    private void btnSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseExited
        buttonSettings.setOriginalBg(btnSignUp);
    }//GEN-LAST:event_btnSignUpMouseExited

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        if (this.informationIsValid()) {
            this.createAccount();
        }else{
           Dialogs.spaceError(this);
        }       
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        ActionSettings.setVisible(this, new LoginScreen());
    }//GEN-LAST:event_btnOkMouseClicked
       private void createAccount()
       {
           //physical information
           
           this.getUserSignUpObject().setNameSurname(this.txtNameSurname.getText().trim());
           this.getUserSignUpObject().setIdentityNumber(this.txtTCNumber.getText());
           this.getUserSignUpObject().setPhoneNumber(this.txtPhoneNumber.getText());
           
           
           //security information
           this.getUserSignUpObject().setSecurityQuestion(String.valueOf(this.cmbSecurityQuestion.getSelectedItem()));
           this.getUserSignUpObject().setSecurityQuestionAns(this.txtAnswer.getText().trim());
           
           // information provided by the system
               this.getUserSignUpObject().setCustomerNumber(this.randomCustomerNumber());
               this.getUserSignUpObject().setPassword(this.randomPassword());
            if (this.getUserSignUpObject().appBeenApproved()) {
               Dialogs.showPrivateMessage(this, "Your application has been accepted.\n"
                       + "Customer number :"+this.getUserSignUpObject().getCustomerNumber()
                       +"\n Password :"+this.getUserSignUpObject().getPassword());
             ActionSettings.setVisible(this, new LoginScreen());
           }else{
                Dialogs.showPrivateMessage(this, "Your application could not be accepted. \n"
                        + "Please check your information. !");
            }

        }
    
    private String randomCustomerNumber(){
        String number;
        do {            
              number=String.valueOf(100000+(int)(Math.random()*9000000));
        } while (this.getUserSignUpObject().customerNumberIsUsed());
      
        return number;
    }
    private String randomPassword(){
        String password;
        password=String.valueOf(1000+(int)(Math.random()*9000));
                return password;
    }
    @Override
    public void getedits() {
      this.setLocationRelativeTo(null);
      SignUpScreenPanel.setFocusable(true);
        TextSettings.setOnlyAlphabetic(txtNameSurname);
        TextSettings.setOnlyNumber(txtTCNumber);
        TextSettings.setOnlyNumber(txtPhoneNumber);
        TextSettings.setMaxLimit(txtTCNumber, 11);
        TextSettings.setMaxLimit(txtPhoneNumber, 11);
    }

    @Override
    public boolean informationIsValid() {
        return TextSettings.textAreaIsEmpty(SignUpScreenPanel);
    }

    @Override
    public AccountInformation accountInformation() {
        return AccountInformation.getInstace();
    }

    
    
    public UserSignUp getUserSignUpObject() {
        if (this.userSignUpObject==null) {
            userSignUpObject=new UserSignUp();
        }
        return userSignUpObject;
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
            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SignUpScreenPanel;
    private javax.swing.JLabel btnOk;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> cmbSecurityQuestion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtNameSurname;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtTCNumber;
    // End of variables declaration//GEN-END:variables
}
