package day2;

public class s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AABCBD";
		for(int i=0;i<s.length();i++)
		{
			boolean status=true;
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
