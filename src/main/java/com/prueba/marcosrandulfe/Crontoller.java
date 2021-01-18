package com.prueba.marcosrandulfe;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Crontoller {
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/world")
	public Regards regards(){
		return new Regards(counter.incrementAndGet());
	}
	
}
