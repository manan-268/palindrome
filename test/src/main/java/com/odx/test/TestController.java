package com.odx.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odx.test.service.PalindromeService;

@RestController
public class TestController {

	@GetMapping("/palindrome")
	public String palindromeString() {
		return PalindromeService.palindrome;
		
	}
	
}