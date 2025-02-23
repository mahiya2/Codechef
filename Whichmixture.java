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
		    if(A>0 && B>0){
		        System.out.println("Solution");
		    }
		    else if(A==0 || B>0){
		        System.out.println("Liquid");
		    }
		    else if(B==0 || A>0){
		        System.out.println("Solid");
		    }
		    else
		    System.out.println("No");
		}

	}
}
