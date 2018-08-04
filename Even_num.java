import java.util.*;
import java.lang.*;
import java.io.*;

class Even_num
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num%2==1)
		System.out.println(num-1);
		else
		System.out.println(num);
	}
}
