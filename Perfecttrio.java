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
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int C=sc.nextInt();
		    int a=A+B;
		    if(a==C){
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}

	}
}
