/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.transactions;

import com.mysql.cj.protocol.Resultset;
import database.DbConnection;
import database.IinformationController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class userLogin extends DbConnection implements IinformationController{
private String customerIdentity=null;
private String customerPassword=null;
    
    
    
    
    @Override
    public boolean informationIsValid() {
        return !(this.customerIdentity==null
                || this.customerPassword==null
                );
    }

    @Override
    public AccountInformation accountInformation() {
        return AccountInformation.getInstace();
    }

    public String getCustomerIdentity() {
        return customerIdentity;
    }

    public void setCustomerIdentity(String customerIdentity) {
        this.customerIdentity = customerIdentity;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }
    
    public boolean loginInformationIsValid(){
        if (informationIsValid()) {
            if (isItSuccessfully()) {
                this.accountInformation().logIn(customerIdentity);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
 private boolean isItSuccessfully() {
    String query = "SELECT identityNumber, customerNumber, userPassword FROM tblusers "
                 + "WHERE (identityNumber = '" + this.customerIdentity + "' OR customerNumber = '" + this.customerIdentity + "') "
                 + "AND userPassword = '" + this.customerPassword + "'";

    try {
        super.statement = super.connection.createStatement();
        ResultSet rs = statement.executeQuery(query);

        // Eğer sonuç varsa doğruyu döndür
        if (rs.next()) {            
            return true;
        }          
        
    } catch (SQLException ex) {
        Logger.getLogger(userLogin.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    // Sonuç yoksa yanlış döndür
    return false;
}


}
