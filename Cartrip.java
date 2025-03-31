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
	      if(X<300){
	          System.out.println(300*10);
	      }
	      else{
	          System.out.println(X*10);
	      }
	      }
	  }
}
