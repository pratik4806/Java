class CharLiteralsDemo
{
	public static void main(String[] args)
	{
		char c1='x';	//single quotes character
		char c2=100;	//character as integer literal
		// char c3=-100; wrong
		char c4='\u0061';	//unicode representation
		char c5='\n';		//escape characters

		System.out.println(c1 + " " + c2 + " " + c4+ " " + c5);
	}
}