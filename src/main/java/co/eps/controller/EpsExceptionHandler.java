package co.eps.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import co.eps.exception.EpsException;
import co.eps.exception.ExceptionBody;

@ControllerAdvice
public class EpsExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = {EpsException.class})
	public ResponseEntity<Object> handleEpsException(RuntimeException ex, WebRequest request) {
		ExceptionBody body = new ExceptionBody();
		body.setCodigo("600");
		body.setMensaje(ex.getMessage());
		return handleExceptionInternal(ex, body, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	}
	
}
