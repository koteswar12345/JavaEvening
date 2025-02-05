package day2;

import java.util.Arrays;

public class ReadMultipleValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[]=new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(a[3]);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		int a[][]=new int[3][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		//System.out.println(a[1][0]);
		/*for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.println(a[i][j]);
			}
		}*/
		
		for(int x[]:a)
		{
			for(int l:x)
			{
				System.out.println(l);
			}
		}
		

	}

}
