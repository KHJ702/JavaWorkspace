
package com.kh.practice.numRange.exception;

import java.io.IOException;

public class NumRangeException extends IOException { //or IOException
	
	public NumRangeException() {
		
	}
	
	public NumRangeException(String msg) {
		super(msg);
	}

}