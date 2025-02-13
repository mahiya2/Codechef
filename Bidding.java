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
          int C=sc.nextInt();
          if(A>B&&A>C){
              System.out.println("Alice");
          }
          else if(B>A&&B>C){
              System.out.println("Bob");
          }
          else
          {
              System.out.println("Charlie");
          }
      }
	}
}

