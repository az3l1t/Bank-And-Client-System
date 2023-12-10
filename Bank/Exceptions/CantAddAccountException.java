package Second.src.Bank.Exceptions;

public class CantAddAccountException extends Exception{
    public CantAddAccountException(String message){
        super(message);
    }
}
