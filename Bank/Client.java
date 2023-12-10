package Second.src.Bank;

import Second.src.Bank.Exceptions.NotEnoughMoneyOnAccount;

public class Client <T> extends BankAccount implements ChangeInfo{
    public T nickName;
    public int bank_id;
    private static final int MAX_VALUE_OF_BANK_ACCOUNTS = 3;
    private int ownWallet=0;
    private int amountMoney;
    public Client(int bank_id,T nickName){
        this.nickName=nickName;
        this.bank_id=bank_id;
    }
    public int hashCode(){
        return (3*bank_id);
    }
    public boolean equals(Client client){
        return (this.bank_id==client.bank_id);
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
