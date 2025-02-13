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
		    int Z=sc.nextInt();
		    if(X>Y && X>Z){
		        System.out.println("Setter");
		    }
		    else if(Y>X && Y<Z){
		        System.out.println("Editorialist");
		    }
		    else
		    {
		        System.out.println("Tester");
		    }
		}

	}
}
