class pascalTringle
{
	public static void main(String[]args)
	{
		int n=5;int number =1;
		for(int i=0;i<n;i++)
		{
			for(int k=4;k>=i;k--)
			{
			System.out.print(" ");
			}
			for(int j=0; j<=i;j++)
			{
				if(i==0||j==0)
				number =1;
				else
				number=number*(i-j+1)/j;
				System.out.print(number+" ");
			}
			System.out.println();
		}
	}
}