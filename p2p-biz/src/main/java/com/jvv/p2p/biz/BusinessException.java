package com.jvv.p2p.biz;

public class BusinessException extends RuntimeException {

	
   
	private static final long serialVersionUID = 490311425021118845L;


	public BusinessException() {
        super();
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

}
