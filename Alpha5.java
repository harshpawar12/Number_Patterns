class Alpha5
{
	public static void main(String[]args)
	{
		int n=6;int ascii=70;
		for(int i=n;i>=1;i--)
		{
			int a=ascii;
			for(int j=i;j>=1;j--)
			{
			System.out.print((char)a+" ");
			
			a--;
			}
			System.out.println();
			ascii--;
		}
		n=6;int ascii1=65;
		for(int i=1;i<=n;i++)
		{
			
			int b=ascii1;
			for(int j=1;j<=i;j++)
			{
			System.out.print((char)b+" ");
		
			b--;
			}
			System.out.println();
			ascii1++;
		}
	}
}