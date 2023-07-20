package model.exceptions;

public class DomainException extends Exception{
    private static final long serialVersionUID = 1L;

    //Allow to instanciate the personalize Exception putting a message as argument
    public DomainException(String msg){
        super(msg);
    }
}
