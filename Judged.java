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
       int R1=sc.nextInt();
       int R2=sc.nextInt();
       int R3=sc.nextInt();
       int R4=sc.nextInt();
       int R5=sc.nextInt();
       int c=R1+R2+R3+R4+R5;
       if(c>=4){
           System.out.println("YES");
       }
       else
       {
           System.out.println("NO");
       }
   }

	}
}
