package day2;

public class S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="programming";
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					temp=temp+s.charAt(j);
				}
			}
		}
		System.out.println(temp);

	}

}
