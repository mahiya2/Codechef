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
		    int X=sc.nextInt();
		    int K=sc.nextInt();
		    int d=N*X;
		    if(d<=K){
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}

	}
}
