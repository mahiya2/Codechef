import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int X=sc.nextInt();
	    if(X<3)
         {
             System.out.println("GOLD");
         }
         else if(X>=3&&X<6)
         {
             System.out.println("SILVER");
         }
         else if(X>=6){
         System.out.println("BRONZE");
         }
         else
         System.out.println("No");
	}
}
