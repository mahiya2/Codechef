import java.util.*;
import java.lang.*;
import java.io.*;

class Batterlow
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int X=sc.nextInt();
		    if(X<=15){
		        System.out.println("Yes");
		    }
		    else
		    System.out.println("No");
		}

	}
}
