package com.org.ws.cxf.jaxrs.restwserrorhandling.exceptions;

public class SomeBusinessException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SomeBusinessException(String message) {
		super(message);
	}
}
