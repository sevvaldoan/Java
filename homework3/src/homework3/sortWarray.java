package homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class sortWarray {

	public static void main(String[] args){

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
				zippedText += countOfChar(str, character);
			}		
			System.out.println("-> Zip With ArrayList :");
			System.out.println(zippedText);
			}

			private static int countOfChar(String str, char character) {
				int count = 0;
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == character) {
						count++;
					}
				}
				return count;
			}
}