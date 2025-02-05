package day2;

import java.util.HashMap;
import java.util.Map;

public class S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming";
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		char[] chars = str.toCharArray();
		for(Character ch:chars)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				Integer value = map.get(ch);
				map.put(ch, value+1);
			}
		}
		System.out.println(map);
		

	}

}
