import java.util.*;
class Educationday
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int A=sc.nextInt();
	int B=sc.nextInt();
	int C=sc.nextInt();
	int d=A*C;
	int e=B*C;
	if(A*C>B*C)
	{
	    System.out.println(d);
	}
	else{
	    System.out.println(e);
	}
	}
}
