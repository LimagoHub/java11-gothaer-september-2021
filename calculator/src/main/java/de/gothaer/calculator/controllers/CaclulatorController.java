package de.gothaer.calculator.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class CaclulatorController {

	
	@GetMapping("/add")
	public double addRequestParam(@RequestParam(required = true) double a, @RequestParam(required = true) double b) {
		return a + b;
	}
	
	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public double addBody(@RequestBody Parameter parameter) {
		return parameter.getA() + parameter.getB();
	}
}
