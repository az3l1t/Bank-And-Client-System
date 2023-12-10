package Second.src.Bank.Exceptions;

public class NotEnoughMoneyOnAccount extends Exception{
    public NotEnoughMoneyOnAccount(String message){
        super(message);
    }
}
