package Second.src.Bank;

import Second.src.Bank.Exceptions.CantCreateAccountException;
import Second.src.Bank.Exceptions.InvalidCurrencyException;

public class Account {
    private int id;
    protected int balance;
    private String currency; //валюта счета
    /*
    RUB
    DOLLAR
    TENGE
     */

    public Account(int id,int balance,String currency) throws CantCreateAccountException, InvalidCurrencyException {
        if(id<0 || balance < 0){
            throw new CantCreateAccountException("Cant create an account! Something is negative!");
        }
        if(currency!="RUB" && currency!="DOLLAR" && currency!="TENGE"){
            throw new InvalidCurrencyException("Invalid currency, change it!");
        }
        this.id=id;
        this.balance=balance;
        this.currency=currency;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }
    public int getBalance() {
        return balance;
    }
    public String getCurrency() {
        return currency;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void setId(int id) {
        this.id = id;
    }
}
