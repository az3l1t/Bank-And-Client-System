package Second.src.Bank;

import Second.src.Bank.Exceptions.NotEnoughMoneyOnAccount;

public class Client <T> extends BankAccount implements ChangeInfo{
    public T nickName;
    private static final int MAX_VALUE_OF_BANK_ACCOUNTS = 3;
    private int ownWallet=0;
    private int amountMoney;
    public Client(T nickName){
        this.nickName=nickName;
    }
    @Override
    public void takeMoneyFromAccount(Account account, int amountMoney) throws NotEnoughMoneyOnAccount{
        if(account.getBalance()>=amountMoney){
            ownWallet = account.getBalance() - amountMoney;
            account.balance=account.balance-amountMoney;
        }
        else{
            throw new NotEnoughMoneyOnAccount("Not enough money on account");
        }
    }

    public int getMoneyInOwnWallet(Account account){
        return account.getBalance();
    }
}
