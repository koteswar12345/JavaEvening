package day2;

import java.util.HashMap;
import java.util.Map;

public class S4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aabbbc";
		//out a2b3c1
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			 char ch = str.charAt(i);
			 
			 if(map.containsKey(ch))
			 {
				 int count=map.get(ch);
				 count++;
				 map.replace(ch, count);
			 }
			 else
			 {
				 map.put(ch, 1);
			 }
		}
		for(Character key:map.keySet())
		{
			System.out.print(key+""+map.get(key));
		}

	}

}
