import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(n%10);
		n=n/10;
		while(n!=0)
		{
			int rem=n%10;
			System.out.print(" "+rem);
			n=n/10;
		}
	}
}
