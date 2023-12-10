package Second.src.Bank;

import Second.src.Bank.Exceptions.CantAddAccountException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class BankAccount extends Account {
    private static final int MAX_ACCOUNT_VALUE = 10;
    private int valueOfAccounts=0;
    private List<Account> listOfAccs = new ArrayList<>();

    public BankAccount(){
        this.listOfAccs=new ArrayList<>();
    }
    public void addAccount(Account account) throws CantAddAccountException{
        if(valueOfAccounts<MAX_ACCOUNT_VALUE){
            listOfAccs.add(account);
            valueOfAccounts+=1;
        }
        else{
            throw new CantAddAccountException("Maximum of accs is 10!");
        }

    }
    public List<Account> getListOfAccs(){
        return listOfAccs;
    }
    public int getTotalBalance(){
        int totalBalance=0;
        for(Account account : listOfAccs){
            totalBalance+= account.getBalance();
        }
        return totalBalance;
    }
}
