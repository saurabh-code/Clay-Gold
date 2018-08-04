package main.clayGold;

public class Main {

	private static final String[] alpha = "abcdefghijklmnopqrstuvwxyz".split("");
	
	public static void main (String []args){
		
		PermutationGenerator generator = new PermutationGenerator();
		System.out.println(generator.getAllPermutation("abc", alpha));
	}

}
