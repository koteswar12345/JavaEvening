package day2;

public class NonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AABBCDD";
		for(int i=0;i<s.length();i++)
		{
			Boolean status=true;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
				{
					status=false;
				}
			}
			if(status)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}

	}

}
