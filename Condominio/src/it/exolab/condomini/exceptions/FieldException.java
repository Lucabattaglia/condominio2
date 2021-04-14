package it.exolab.condomini.exceptions;

public class FieldException extends Exception {
	private String field;

	public FieldException(String field) {
		super();
		this.field = field;
	}
	
	public String getField() {
		return field;
	}
}
