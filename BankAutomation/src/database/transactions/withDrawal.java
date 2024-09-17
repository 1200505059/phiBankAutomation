package database.transactions;

import database.DbConnection;
import database.IinformationController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class withDrawal extends DbConnection implements IinformationController {
    
    private int amount = 0;

    public boolean isWithDrawal() {
        if (informationIsValid()) {
            String query = "UPDATE userbalance SET balance = balance - '" + this.amount + "' WHERE userID = '" + accountInformation().getUserID() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                accountInformation().setBalance(accountInformation().getBalance()-this.amount);
            } catch (SQLException ex) {
                Logger.getLogger(withDrawal.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean informationIsValid() {
        return !(this.amount == 0 || accountInformation().getBalance() < this.amount);
    }

    @Override
    public AccountInformation accountInformation() {
       
        return AccountInformation.getInstace(); 
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
