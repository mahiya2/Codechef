import java.util.*;
class Cskvsrcb
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int c=X-Y;
		if(c>=18)
		{
		    System.out.println("RCB");
		}
		else{
		    System.out.println("CSK");
		}
	}
}
