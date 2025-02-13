import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int N=sc.nextInt();
		    int M=sc.nextInt();
		    int X=sc.nextInt();
		    int c=N*2;
		    int d=M*2;
		    int e=c+d;
		    int f=e*X;
		    System.out.println(f);
		}

	}
}
