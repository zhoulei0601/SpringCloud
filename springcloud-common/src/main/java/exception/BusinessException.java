package exception;

/**
 * @ClassName : BusinessException
 * @Description : 业务异常类
 * @Author : zhoul
 * @Date: 2021-03-19 22:47
 */
public class BusinessException extends Exception {

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
