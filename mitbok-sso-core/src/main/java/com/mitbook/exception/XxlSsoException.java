package com.mitbook.exception;
/**
 * @author pengzhengfa
 */
public class XxlSsoException extends RuntimeException {

    private static final long serialVersionUID = 42L;

    public XxlSsoException(String msg) {
        super(msg);
    }

    public XxlSsoException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public XxlSsoException(Throwable cause) {
        super(cause);
    }

}
