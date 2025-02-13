import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int A1=sc.nextInt();
	int A2=sc.nextInt();
	int B1=sc.nextInt();
	int B2=sc.nextInt();
	int C1=sc.nextInt();
	int C2=sc.nextInt();
	int  d=Math.max(A1,A2);
	int  e=Math.max(B1,B2);
	int  f=Math.max(C1,C2);
	int  g=d+e+f;
	System.out.println(g);
	}
}