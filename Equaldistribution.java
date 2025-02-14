import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc=new Scanner(System.in);
      int t = sc.nextInt();
	  for(int i=0;i<t;i++){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    if((A+B)%2==0){
		        System.out.println("YES");
		        
		    }else{
		        System.out.println("NO");
		    }

	}
}
}