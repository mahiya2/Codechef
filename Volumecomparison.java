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
		int X=sc.nextInt();
        int d=A*B*C;
        int e=X*X*X;
        if(d>e){
            System.out.println("Cuboid");
        }
        else if(e>d){
        System.out.println("Cube");
        }
        else
        {
            System.out.println("Equal");
        }
	}
}
