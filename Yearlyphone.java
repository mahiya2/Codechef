import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int a=X%100;
		System.out.println("K"+String.format("%02d",a));
        sc.close();
	}
}
