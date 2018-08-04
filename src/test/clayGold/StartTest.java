package test.clayGold;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.clayGold.PermutationGenerator;

public class StartTest {

	String[] alpha = "abcdefghijklmnopqrstuvwxyz".split("");
	String[] alphaSmall = "ab".split("");
	String[] alphaSmall2 = "abc".split("");
	
	PermutationGenerator generator;
	
	@Before
	public void setup() {
		generator = new PermutationGenerator();
	}
	
	@Test
	public void givenEmptyString_ReturnEmptyList() {
		List<String> expected = new ArrayList<>();
		assertEquals(expected, generator.getAllPermutation("", alpha));
	}
	
	@Test
	public void givenSingleLetter_ReturnRestAll_Case1() {
		List<String> expected = new ArrayList<>();
		for (int i = 1; i < alpha.length; i++) {
			expected.add(alpha[i]);
		}
		assertEquals(expected, generator.getAllPermutation("a", alpha));
	}
	
	@Test
	public void givenSingleLetter_ReturnRestAll_Case2() {
		List<String> expected = new ArrayList<>();
		expected.add("a");
		for (int i = 2; i < alpha.length; i++) {
			expected.add(alpha[i]);
		}
		assertEquals(expected, generator.getAllPermutation("b", alpha));
	}
	
	@Test
	public void givenTwoLetter_ReturnRestAll_Case1() {
		List<String> expected = new ArrayList<>();
		expected.add("ba");
		expected.add("ab");
		
		assertEquals(expected, generator.getAllPermutation("aa", alphaSmall));
	}
	
	@Test
	public void givenTwoLetter_ReturnRestAll_Case2() {
		List<String> expected = new ArrayList<>();
		expected.add("bbc");
		expected.add("cbc");
		expected.add("aac");
		expected.add("acc");
		expected.add("aba");
		expected.add("abb");
		
		assertEquals(expected, generator.getAllPermutation("abc", alphaSmall2));
	}

}
