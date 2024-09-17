/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package database;

import database.transactions.AccountInformation;

/**
 *
 * @author pc
 */
public interface IinformationController {
    public boolean informationIsValid();
    public AccountInformation accountInformation();
}
