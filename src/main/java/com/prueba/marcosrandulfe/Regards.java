package com.prueba.marcosrandulfe;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class Regards {
	private final long id;
	private final static String MESSAGE ="Hello world";
	
	public Regards(long id) {
		this.id=id;
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getMessage() {
		return this.MESSAGE;
	}
}
