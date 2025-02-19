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
		    int Y=sc.nextInt();
		    int a=X*100;
		    int b=Y*10;
		    if(a<b){
		        System.out.println("Disposable");
		    }
		    else
		    {
		        System.out.println("Cloth");
		    }
		}

	}
}
