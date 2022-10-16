package homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class Warray {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter text: ");
		String str= scn.nextLine();
				

		ArrayList<Character> CharList = new ArrayList<>();
		String zippedText = "";
		for (int i = 0; i < str.length(); i++) {
			if (!CharList.contains(str.charAt(i))) {
				CharList.add(str.charAt(i));
			}
		}
		for (Character character : CharList) {
			zippedText += character;
		}
		System.out.println("-> Zipping With ArrayList :");
		System.out.println(zippedText);
	}

}
