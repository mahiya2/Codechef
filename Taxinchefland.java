import java.util.*;
class Taxinchefland
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=0;i<t;i++){
		    int X =sc.nextInt();
		    if(X>100){
		        System.out.println(X-10);
		    }else{
		        System.out.println(X);
		    }
		}

	}
}