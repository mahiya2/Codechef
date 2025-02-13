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
		    int Y=sc.nextInt();
		    int c=X*2;
		    int d=Y*5;
		    if(c>d){
		        System.out.println("Chocolate");
		    }
		    else if(c==d){
		        System.out.println("Either");
		    }
		    else if(c<d){
		        System.out.println("Candy");
		    }
		    else
		    {
		        System.out.println("No");
		    }
		}

	}
}
