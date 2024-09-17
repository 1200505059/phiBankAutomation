package database.transactions;

import database.DbConnection;
import database.IinformationController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DepositMoney extends DbConnection implements IinformationController {

    private int amountToBeDeposit = 0;

    public boolean moneyBeenDeposit() {
        if (informationIsValid()) {
            String query = "UPDATE userbalance SET balance = balance + '" +
                    this.amountToBeDeposit + "' WHERE userID = '" + accountInformation().getUserID() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                accountInformation().setBalance(accountInformation().getBalance() + this.amountToBeDeposit);
            } catch (SQLException ex) {
                Logger.getLogger(DepositMoney.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean informationIsValid() {
        return this.amountToBeDeposit > 0;
    }

    @Override
    public AccountInformation accountInformation() {
        return AccountInformation.getInstace(); // Tekil örnek döndürür
    }

    public int getAmountToBeDeposit() {
        return amountToBeDeposit;
    }

    public void setAmountToBeDeposit(int amountToBeDeposit) {
        this.amountToBeDeposit = amountToBeDeposit;
    }
}
