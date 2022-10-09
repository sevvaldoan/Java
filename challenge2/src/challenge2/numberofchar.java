package challenge2;

import java.util.HashMap;
import java.util.Scanner;

public class numberofchar {

	public static void main(String[] args) {
		
		        String text;
		        Scanner scn = new Scanner(System.in);
		        System.out.println("Enter text: ");
		        text = scn.nextLine();
		        
		        HashMap<Object, Object> hmap = new HashMap<Object, Object>();
		        
		        for (int i = 0; i < text.length(); i++) {
		            if(!hmap.containsKey(text.charAt(i)))
		            {
		                  hmap.put(text.charAt(i),1); 
		            }
		            //belirlenen anahtar değerlere erişir.
		            else
		            {
		                int count= (int)hmap.get(text.charAt(i));
		                hmap.put(text.charAt(i),count+1);
		            }    
		        }
		        System.out.println(text);
		        System.out.println(hmap);
	}
		 
}