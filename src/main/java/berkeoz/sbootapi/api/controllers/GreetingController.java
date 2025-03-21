package berkeoz.sbootapi.api.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import berkeoz.sbootapi.api.config.Greeting;

@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	
	private final AtomicLong counter = new AtomicLong();
	
	@CrossOrigin(origins = "http://localhost:5173")
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(required = false, defaultValue = "World") String name) {
		System.out.println("==== Get greeting from " + name + " ====" );
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
