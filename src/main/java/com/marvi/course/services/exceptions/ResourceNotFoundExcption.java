package com.marvi.course.services.exceptions;

public class ResourceNotFoundExcption extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExcption(Object id) {
		super("Resource not found. Id " + id);
	}
}
