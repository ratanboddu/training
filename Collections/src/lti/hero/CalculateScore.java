package lti.hero;

import java.util.ArrayList;

public class CalculateScore {
	
	private static int[] result=new int[7];

	public static void main(String[] args) {
		ArrayList<String> score=new ArrayList<>();
		score.add("1011000");
		score.add("0000100");
		score.add("1010100");
		score.add("0000100");
		score.add("0000000");
		score.add("0010101");
		score.add("1011000");
		score.add("0011100");
		score.add("0001110");
		score.add("0101011");
		score.add("1000001");
		score.add("1111100");
		score.add("1100001");
		score.add("1000101");
		
		for (String value : score) {
			
			addString(value);
			
		}
		
		for (int i : result) {
			
			System.out.println(i);
			
		}
		
		
	}
	
	
	
	

private static void addString(String input)
{
	
	String[] star=input.split("");
	
	for (int i = 0; i < star.length; i++) {
					
		result[i]+=Integer.parseInt(star[i]);
		
	}
	

}
}
