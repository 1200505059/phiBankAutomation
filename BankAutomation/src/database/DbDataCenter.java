/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author pc
 */
public class DbDataCenter extends DbConnection{
    protected int userID=0;
    protected String nameSurname,phoneNumber,identityNumber,customerNumber;
    protected double balance;
    protected double houseRent,waterBill,electricBill,naturalGasBill,internetBill;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(double houseRent) {
        this.houseRent = houseRent;
    }

    public double getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(double waterBill) {
        this.waterBill = waterBill;
    }

    public double getElectricBill() {
        return electricBill;
    }

    public void setElectricBill(double electricBill) {
        this.electricBill = electricBill;
    }

    public double getNaturalGasBill() {
        return naturalGasBill;
    }

    public void setNaturalGasBill(double naturalGasBill) {
        this.naturalGasBill = naturalGasBill;
    }

    public double getInternetBill() {
        return internetBill;
    }

    public void setInternetBill(double internetBill) {
        this.internetBill = internetBill;
    }
    
    
}
