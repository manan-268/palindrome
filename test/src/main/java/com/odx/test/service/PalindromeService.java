package com.odx.test.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odx.test.model.String;

@Service
public class PalindromeService {

	public String palindrome(String string) throws Exception {

		if (string.isEmpty()) {
			return null;
		}

		if (string.length() == 1) {
			return string;
		}

		String longest = string.substring(0, 1);
		for (int i = 0; i < string.length(); i++) {
			
			String tmp = helper(string, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}

			tmp = helper(string, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}

		return longest;

	}

	private String helper(String string, int begin, int end) {
		while (begin >= 0 && end <= string.length() - 1 && string.charAt(begin) == string.charAt(end)) {
			begin--;
			end++;
		}
		return string.substring(begin + 1, end);
	}

}