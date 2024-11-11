package ThisIsJava.ch11.ExampleNo07;

public class NotExistIDException extends Exception{
    public NotExistIDException(){}
    public NotExistIDException(String message){
        super("ID가 존재하지 않습니다.");
    }
}
