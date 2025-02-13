import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		if(X>Y){
		    System.out.println("New");
		}
       else if(X<Y)
       {
           System.out.println("Old");
       }
       else{
           System.out.println("Same");
       }
	}
}
