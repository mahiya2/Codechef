import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int C=sc.nextInt();
		    if(A + B > C && B + C > A && A + C >B){
		        System.out.println("Yes");
		    }
		    else
		    System.out.println("No");
		}

	}
