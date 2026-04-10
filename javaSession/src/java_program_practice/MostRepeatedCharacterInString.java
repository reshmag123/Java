package java_program_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostRepeatedCharacterInString {
	
		public static void main(String[] args) {
			
			String str = "BxcaDA0nMXx";
			
			String lwrStr = str.toLowerCase();
			
			//System.out.println(lwrStr);
			
			char [] strarray = lwrStr.toCharArray();
			Map<Character,Integer> mp = new HashMap<>();
			
			for(char c : strarray)
			{
				mp.put(c,mp.getOrDefault(c,0)+1);
			}
			System.out.println(mp);
			
			char maxChar = ' ';
			int maxCount = 0;
			for(Entry<Character,Integer> entry : mp.entrySet())
			{
				if(entry.getValue()>maxCount)
				{
					maxCount = entry.getValue();
					maxChar = entry.getKey();
				}
			}
			
			System.out.println("Maxcount is :"+ maxCount);
			System.out.println("Max repeated charater is :"+ maxChar);

		}

}



