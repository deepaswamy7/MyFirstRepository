package com.example.c.lers;

	import java.util.Date;

	public class CustomError {
		
		 private int code;
		 private String errorMessage;
		 private Date timeStamp;
		 
		 public CustomError(Date timeStamp, int code, String errorMessage){
			 this.timeStamp = new Date();
			 this.code = code;
		        this.errorMessage = errorMessage;
		    }
		 
		    public int getCode() {
			return code;
		}


		public Date getTimeStamp() {
			return timeStamp;
		}


		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

			
		 
		    public String getErrorMessage() {
		        return errorMessage;
		    }

	}