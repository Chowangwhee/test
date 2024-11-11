package ThisIsJava.ch11.ExampleNo07;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){}
    public WrongPasswordException(String message){
        super("패스워드가 틀립니다.");
    }
}
