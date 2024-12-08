import java.util.*;
class Healthysleep
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		if(H<8)
		{
		    System.out.println("LESS");
		}
		else if(H==8)
		{
		    System.out.println("PERFECT");
		}
		else if(H>8)
		{
		    System.out.println("MORE");
		}

	}
}
