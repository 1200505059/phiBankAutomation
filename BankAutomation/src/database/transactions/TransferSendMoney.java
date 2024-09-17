package database.transactions;

import database.DbConnection;
import database.IinformationController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransferSendMoney extends DbConnection implements IinformationController {

    private int money = 0;
    private String person = null;

   public boolean transferIsOkey() {
    if (informationIsValid()) {
    
       String query = "UPDATE userbalance SET balance = balance - " + this.money 
                + " WHERE userID = '" + this.accountInformation().getUserID() + "'";
                
String query2 = "UPDATE userbalance SET balance = balance + " + this.money 
                + " WHERE customerNumber = '" + this.person + "'";


        try {
          
            super.statement = super.connection.createStatement();
      
            if (statement.executeUpdate(query2) == 1) {
             
                statement.executeUpdate(query);
                accountInformation().setBalance(accountInformation().getBalance() - this.money);
                return true;
            } else {
             
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransferSendMoney.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    } else {
        return false;
    }
}


    @Override
    public boolean informationIsValid() {
        return !(this.money == 0 ||
                this.person == null ||
                this.money > accountInformation().getBalance() ||
                this.person.equals(accountInformation().getCustomerNumber())
        );
    }

    @Override
    public AccountInformation accountInformation() {
        return AccountInformation.getInstace(); 
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
