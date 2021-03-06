package com.org.ws.cxf.jaxrs.springsecurity;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.springframework.security.access.AccessDeniedException;

public class SecurityExceptionMapper implements ExceptionMapper<AccessDeniedException> {

	@Override
	public Response toResponse(AccessDeniedException arg0) {
		return Response.status(Response.Status.FORBIDDEN).build();
	}

}
