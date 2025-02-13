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
		    if(X<3){
		        System.out.println("LIGHT");
		    }
		    else if(X>=3&&X<7)
		    {
		        System.out.println("MODERATE");
		    }
		    else if(X>=7){
		        System.out.println("HEAVY");
		    }
		    else
		    System.out.println("NO");
		}

	}
}
