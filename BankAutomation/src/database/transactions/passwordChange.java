
package database.transactions;

import database.DbConnection;
import database.IinformationController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class passwordChange extends DbConnection implements IinformationController{
private String identityNumber=null;
private String phoneNumber=null;
private String securityAns=null;
private String oldPassword=null;
private String newPassword=null;
    @Override
    public boolean informationIsValid() {
        return!(this.identityNumber==null||
                this.phoneNumber==null||
                this.securityAns==null||
                this.newPassword==null);
    }

    
    
    public boolean passwordIsChanged(){
        if (informationIsValid()) {           
           String query = "UPDATE tblusers SET userPassword = '" + this.newPassword + "'" +
               "WHERE identityNumber = '" + this.identityNumber + "' AND " +
               "phoneNumber = '" + this.phoneNumber + "' AND " +
               "securityQuestionAns = '" + this.securityAns + "'";
            if (this.oldPassword!=null) {
                query+="AND userPassword='"+this.oldPassword+"'";
            }
            try {
                super.statement=super.connection.createStatement();
                return statement.executeUpdate(query)==1;
            } catch (SQLException ex) {
                Logger.getLogger(passwordChange.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }

        }else {
            return false;
        }
    }
    @Override
    public AccountInformation accountInformation() {
      return AccountInformation.getInstace();
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSecurityAns() {
        return securityAns;
    }

    public void setSecurityAns(String securityAns) {
        this.securityAns = securityAns;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    
    
}
