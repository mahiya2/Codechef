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
		    int X=sc.nextInt();
		    if(X<=70){
		        System.out.println("0");
		    }
		    else if(70<X&&X<=100){
		        System.out.println("500");
		    }
		    else if(X>100){
		        System.out.println("2000");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}

	}
}
