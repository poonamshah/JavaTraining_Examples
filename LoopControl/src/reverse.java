

public class reverse {
	public static void main(String[] args)
	{
		int x=1234;
		int n=1;
		
		System.out.print("Reverse of value'x=1234' is  ");
		while(n>0)
		{
		 int r=x%10;
			n=x/10;
		 x=n;
		 
		 System.out.print(+r);
		}
		
	}

}
