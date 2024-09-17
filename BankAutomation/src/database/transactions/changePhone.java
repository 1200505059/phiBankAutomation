
package database.transactions;

import database.DbConnection;
import database.IinformationController;
import gui.Settings.TextSettings;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class changePhone extends DbConnection implements IinformationController {
private String phoneNumber=null; 
    
  public boolean phoneIsChanged(){
      if (informationIsValid()) {
          String query="Update tblusers set phoneNumber='"+this.phoneNumber+"'"
                  + "where userID='"+accountInformation().getUserID()+"'";
       
          try {
              super.statement=super.connection.createStatement();
                 statement.executeUpdate(query);
                 accountInformation().setPhoneNumber(this.phoneNumber);
          } catch (SQLException ex) {
              Logger.getLogger(changePhone.class.getName()).log(Level.SEVERE, null, ex);
          }
          return  true;          
      }else{
          return false;
      }
  }
    
    
    
    
    
    @Override
    public boolean informationIsValid() {
    return !(this.phoneNumber==null||
            TextSettings.lenghtIsEnough(11, phoneNumber));
        
    }   
    @Override
    public AccountInformation accountInformation() {
       return AccountInformation.getInstace();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}
