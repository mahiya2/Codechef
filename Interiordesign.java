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
	    int X1=sc.nextInt();
	    int Y1=sc.nextInt();
	    int X2=sc.nextInt();
	    int Y2=sc.nextInt();
	    int a=X1+Y1;
	    int b=X2+Y2;
	    if(a<b){
	        System.out.println(a);
	    }
	    else
	    System.out.println(b);
	}

	}
}
