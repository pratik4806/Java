class AlphabetPattern1
{
	public static void main(String[] args)
	{
		int count=64;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(count+j)+" ");
			}
			System.out.println();
		}
	}
}

/*
A
A B
A B C
A B C D
*/