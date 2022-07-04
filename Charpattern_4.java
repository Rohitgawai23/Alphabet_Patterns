/*

A B C D E F
A B C D E
A B C D
A B C
A B
A
A
A B
A B C
A B C D
A B C D E
A B C D E F

*/
class Charpattern_4
{
	public static void main(String []args)
	{
		int i,j;
		for(i=70; i>=65; i--)
		{
		for(j=65; j<=i; j++)
			System.out.print((char)j+" ");
		
		System.out.println();
		}

		for( i=65; i<=70; i++)
                {
                     for(j=65; j<=i; j++)
                           System.out.print((char)j+" ");


                System.out.println();
                }
             

	}
}