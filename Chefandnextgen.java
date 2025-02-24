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
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int c=A*B;
		    int d=X*Y;
		    if(d>=c){
		        System.out.println("Yes");
		    }
		    else
		    {
		        System.out.println("No");
		    }
		}

	}
}

