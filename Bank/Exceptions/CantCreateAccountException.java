package Second.src.Bank.Exceptions;

public class CantCreateAccountException extends Exception{
    public CantCreateAccountException(String message){
        super(message);
    }
}
