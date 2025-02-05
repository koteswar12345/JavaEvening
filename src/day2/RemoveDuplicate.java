package day2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming";
		StringBuilder sb=new StringBuilder();
		/*for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
		    int idx=str.indexOf(ch,i+1);
		    if(idx==-1)
		    {
		    	sb.append(ch);
		    	
		    }
		}
		System.out.println(sb);*/
		
		//char[] chars = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			boolean status=false;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					status=true;
					break;
				}
			}
			if(!status)
			{
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb);

	}

}
