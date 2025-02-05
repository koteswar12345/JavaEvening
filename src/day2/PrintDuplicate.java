package day2;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="programming";
		char[] arr=s.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		int count=1;
		for(int i=1;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], count);
			}
			else
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Character key:map.keySet())
		{
			if(map.get(key)>1)
			{
				System.out.println(key+" "+map.get(key));
			}
		}
		
		

	}

}
