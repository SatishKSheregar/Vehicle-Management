package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class VehicalNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String vehicalName; //emplpyee
	private String fieldName; // id
	private int fieldValue; // 2
	
	
	
	public VehicalNotFoundException(String vehicalName, String fieldName, int vid) {
		super(vehicalName+"not found for" +fieldName+" with value "+vid);
		this.vehicalName = vehicalName;
		this.fieldName = fieldName;
		this.fieldValue = vid;
	}
	
	public String getVehicalName() {
		return vehicalName;
	}
	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public int getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(int fieldValue) {
		this.fieldValue = fieldValue;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
