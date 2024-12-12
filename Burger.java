import java.util.*;
class Burger
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int A =sc.nextInt();
		    int B=sc.nextInt();
		     if(A<B){
		         System.out.println(A);
		     }
		     else{
		         System.out.println(B);
		     }
		}

	}
}
