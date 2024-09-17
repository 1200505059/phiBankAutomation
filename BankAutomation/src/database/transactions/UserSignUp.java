
package database.transactions;

import database.DbConnection;
import database.IinformationController;
import gui.Settings.TextSettings;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class UserSignUp extends DbConnection implements IinformationController{
    private String nameSurname=null, phoneNumber=null, identityNumber=null;
    private String securityQuestion=null,securityQuestionAns=null;
    
    
    private String  customerNumber=null;
    private String password=null;

    public boolean appBeenApproved(){
        if (this.informationIsValid()) {
            if (this.idNumberIsUsed()) {
                return false;
            }else{
                this.approveApplication();
                return true;
            }
        }else {
            return false;
        }
    }
           
         private boolean idNumberIsUsed(){
             String query="Select identityNumber from tblusers where identityNumber='"+this.identityNumber+"'";
        try {
            super.statement=super.connection.createStatement();
           ResultSet rs= statement.executeQuery(query);
            while (rs.next()) {                
                return true;// if data >0 --> true
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
         }
         
        private void approveApplication() {
    String query = "insert into tblusers(customerNumber, identityNumber, nameSurname, phoneNumber, "
            + "securityQuestion, securityQuestionAns, userPassword) "
            + "values ("
            + "'" + this.customerNumber + "', "
            + "'" + this.identityNumber + "', "
            + "'" + this.nameSurname + "', "
            + "'" + this.phoneNumber + "', "
            + "'" + this.securityQuestion + "', "
            + "'" + this.securityQuestionAns + "', "
            + "'" + this.password + "'"
            + ") ";
        try {
            super.statement=super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(UserSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public boolean customerNumberIsUsed(){
 String query = "select customerNumber from tblusers where customerNumber='" + this.customerNumber + "'";

        try {
            super.statement=super.connection.createStatement();
            ResultSet rs=statement.executeQuery(query);
            while (rs.next()) {                
                return true;// if data >0 --> true
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserSignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
}
        @Override
    public boolean informationIsValid() {
        return !(
                this.nameSurname==null ||
                this.phoneNumber==null ||
                this.identityNumber==null||
                this.securityQuestion==null||
                this.securityQuestionAns==null||
                this.customerNumber==null||
                this.password==null||
                TextSettings.lenghtIsEnough(11, this.identityNumber)||
                TextSettings.lenghtIsEnough(11, this.phoneNumber)
                );
        
    }

    @Override
    public AccountInformation accountInformation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityQuestionAns() {
        return securityQuestionAns;
    }

    public void setSecurityQuestionAns(String securityQuestionAns) {
        this.securityQuestionAns = securityQuestionAns;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
