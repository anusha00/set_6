import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int p=m*n;
		if(p%2==0)
		{
			System.out.println("even");
		}
		else
		System.out.println("odd");
	}
}
