package database.transactions;

import com.mysql.cj.protocol.Resultset;
import database.DbConnection;
import database.DbDataCenter;
import database.IinformationController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountInformation extends DbDataCenter implements IinformationController{
    /* Singleton design pattern */
    
    private static AccountInformation accountInformation=null;
    public static AccountInformation getInstace(){
        if (accountInformation==null) {
            accountInformation=new AccountInformation();
        }
        return accountInformation;
    }

    @Override
    public boolean informationIsValid() {
return!(super.userID==0);
        }

   @Override
  public AccountInformation accountInformation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void logIn(String customerIdentity) {
        this.GETUSER(customerIdentity);
        this.GETBALANCE();
        this.GETINVOICES();
    }
    public void logOut(){
        System.out.println("logOut is work");
    }
    private void  GETUSER(String customerIdentity){
String query = "SELECT * FROM tblusers WHERE "
             + "identityNumber = '" + customerIdentity + "' "
             + "OR customerNumber = '" + customerIdentity + "'";

        try {
            super.statement=super.connection.createStatement();
            ResultSet rs= statement.executeQuery(query);
            while (rs.next()) {                
                super.userID=rs.getInt("userID");
                super.nameSurname=rs.getNString("nameSurname");
                super.identityNumber=rs.getNString("identityNumber");
                super.phoneNumber=rs.getNString("phoneNumber");
                super.customerNumber=rs.getNString("customerNumber");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void GETBALANCE(){
       if (this.informationIsValid()) {
    String query = "SELECT * FROM userbalance "
                 + "WHERE userID = '" + super.getUserID() + "'";
    try {
        super.statement = super.connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {                    
            super.balance = rs.getDouble("balance");
        }
    } catch (SQLException ex) {
        Logger.getLogger(AccountInformation.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    }
    
    private void GETINVOICES(){
       if (this.informationIsValid()) {
    String query = "SELECT * FROM userinvoices "
                 + "WHERE userID = '" + super.getUserID() + "'";
    
    try {
        super.statement = super.connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        
        while (rs.next()) {                    
            super.electricBill = rs.getDouble("electric");
            super.waterBill = rs.getDouble("water");
            super.naturalGasBill = rs.getDouble("naturalGas");
            super.internetBill = rs.getDouble("internet");
            super.houseRent = rs.getDouble("houseRent");
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(AccountInformation.class.getName()).log(Level.SEVERE, null, ex);
    }
       }
    }

}
