import java.util.*;

class Batteryhealth
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int X=sc.nextInt();
		    if(X>=80)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}