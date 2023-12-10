package Second.src.Bank;

import Second.src.Bank.Exceptions.NotEnoughMoneyOnAccount;

public interface ChangeInfo {
    void takeMoneyFromAccount(Account account, int amountMoney) throws NotEnoughMoneyOnAccount;
}
