package database.transactions;

import database.DbConnection;
import database.IinformationController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class invoicesPayments extends DbConnection implements IinformationController {

    private String billName = null;
    private double billMoney = 0;

    public boolean billIsOkey() {
        if (informationIsValid()) {
            String query = "UPDATE userinvoices SET " + 
                    this.billName + " = 0 WHERE userID = '" +
                    accountInformation().getUserID() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                this.reduceBalance();
                this.resetBill();
            } catch (SQLException ex) {
                Logger.getLogger(invoicesPayments.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    private void reduceBalance() {
        String query = "UPDATE userbalance SET balance = balance - " + this.billMoney +
                " WHERE userID = '" + accountInformation().getUserID() + "'";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
            accountInformation().setBalance(accountInformation().getBalance() - this.billMoney);
        } catch (SQLException ex) {
            Logger.getLogger(invoicesPayments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void resetBill() {
        if (informationIsValid()) {
            switch (this.billName) {
                case "electric":
                    accountInformation().setElectricBill(0);
                    break;
                case "water":
                    accountInformation().setWaterBill(0);
                    break;
                case "naturalGas":
                    accountInformation().setNaturalGasBill(0);
                    break;
                case "houseRent":
                    accountInformation().setHouseRent(0);
                    break;
                case "internet":
                    accountInformation().setInternetBill(0);
                    break;
            }
        }
    }

    @Override
    public boolean informationIsValid() {
        return !(this.billName == null || this.billMoney == 0 ||
                accountInformation().getBalance() < this.billMoney);
    }

    @Override
    public AccountInformation accountInformation() {
        return AccountInformation.getInstace();
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public double getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(double billMoney) {
        this.billMoney = billMoney;
    }
}
