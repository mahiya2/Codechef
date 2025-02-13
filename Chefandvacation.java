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
		    int a=X+Y;
		    if(a>Z){
		        System.out.println("TRAIN");
		    }
		    else if(a<Z){
		        System.out.println("PLANEBUS");
		    }
		    else
		    System.out.println("EQUAL");
		}

	}
}
