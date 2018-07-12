package org.edi.freamwork.exception;

/**
 * Created by asus on 2018/7/9.
 *
 */

public class BusinessException extends RuntimeException {


    private static final long serialVersionUID = 1L;

    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
