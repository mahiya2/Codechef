import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int F1=sc.nextInt();
		int P1=sc.nextInt();
		int F2=sc.nextInt();
		int P2=sc.nextInt();
		int a=Math.abs(F1-P1);
		int b=Math.abs(F2-P2);
		if(a<b){
		    System.out.println("First");
		}
		else if(a==b){
		    System.out.println("Both");
		}
		else
		{
		    System.out.println("Second");
		}
		

	}
}
