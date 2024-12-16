import java.util.*;
class Olympic2024
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int G=sc.nextInt();
		int S=sc.nextInt();
		int B=sc.nextInt();
		int c=5-G;
		int d=5-S;
		int e=5-B;
		int f=c+d+e;
		if(G==5 && S==5 && B==5)
		System.out.println(0);
		else
		System.out.println(f);

	}
}