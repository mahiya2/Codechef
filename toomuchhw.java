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
		int a=Y*10;
        int b=X+a;
        if(b>=100){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
	}
}
