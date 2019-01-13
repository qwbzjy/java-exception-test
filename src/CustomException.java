import java.util.spi.CurrencyNameProvider;

/**
 * @author created by qwb on 2019/1/9 16:11
 */
public class CustomException extends Exception {

    public CustomException(){}

    public CustomException(String message){}

    public CustomException(String message,Throwable cause){
        super(message,cause);
    }

    public CustomException(Throwable cause){
        super(cause);
    }


}
