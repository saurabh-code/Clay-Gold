package main.clayGold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PermutationGenerator {

	public List<String> getAllPermutation(String s, String[] letters) {
		List<String> possiblePerm = new ArrayList<>();
		
		if (!s.isEmpty()) {
			for (int i = 0; i < s.length(); i++){
				char currentLetter = s.charAt(i);
				
				for (String str : getAllOtherLetters(currentLetter, letters)){
					possiblePerm.add(getPrefix(i, s) + str + getPostFix(i, s));
				}
			}
		}
		
		return possiblePerm;
	}
	
	public List<String> getAllOtherLetters(char s, String[] letters) {
		return Arrays.asList(letters)
				.stream()
				.filter(t -> t.charAt(0) != s)
				.collect(Collectors.toList());
	}
	
	private String getSubstring(int begin, int end, String s) {
		return s.substring(begin, end);
	}
	
	private String getPrefix(int end, String s) {
		return getSubstring(0, end, s);
	}
	
	private String getPostFix(int begin, String s) {
		return getSubstring(begin + 1, s.length(), s);
	}
}
