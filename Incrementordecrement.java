import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a=N+1;
		int b=N-1;
		if(N%4==0){
		    System.out.println(a);
		}
		else
		{
		    System.out.println(b);
		}

	}
}
