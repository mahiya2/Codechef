import java.util.*;
import java.lang.*;
import java.io.*;

class Fanpoll
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		if(A>B && A>C){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}
