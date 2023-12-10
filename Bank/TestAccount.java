package Second.src.Bank;

import Second.src.Bank.Exceptions.CantAddAccountException;
import Second.src.Bank.Exceptions.CantCreateAccountException;
import Second.src.Bank.Exceptions.InvalidCurrencyException;
import Second.src.Bank.Exceptions.NotEnoughMoneyOnAccount;

public class TestAccount {
    public static void main(String[] args) throws CantCreateAccountException, InvalidCurrencyException, CantAddAccountException, NotEnoughMoneyOnAccount {
        Client<String> client = new Client<>(1,"Norair");
        Client<String> client2 = new Client<>(1,"Norair2");
        if(client.equals(client2) && (client.hashCode()==client2.hashCode())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        Account account = new Account(1,10000,"TENGE");
        Account account2 = new Account(2,10000,"TENGE");
        Account account3 = new Account(3,10000,"TENGE");

        BankAccount wallet = new BankAccount();
        wallet.addAccount(account);
        wallet.addAccount(account2);
        wallet.addAccount(account3);

        client.takeMoneyFromAccount(account,10000);
        System.out.println(account.getBalance());
        System.out.println(client.getMoneyInOwnWallet(account));
    }
}
