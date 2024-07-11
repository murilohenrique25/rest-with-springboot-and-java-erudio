package br.com.murilodev.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ExceptionResponse  extends RuntimeException{

private static final long serialVersionUID = 1L;

private Date timestamp;
private String message;
private String details;

public ExceptionResponse(Date timestamp, String message, String details) {
	this.timestamp = timestamp;
	this.message = message;
	this.details = details;
}
public Date getTimestamp() {
	return timestamp;
}
public String getMessage() {
	return message;
}
public String getDetails() {
	return details;
}

}