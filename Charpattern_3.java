/*

A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E

*/

class Charpattern_3
{
	public static void main(String []args)
	{
		int i,j;
	
                for( i=65; i<=70; i++)
                {
                      for(j=65; j<=i; j++)
			
                   	  System.out.print((char)j+" ");
			
                System.out.println();
                }

		for( i=69; i>=69; i--)
                {
                      for(j=65; j<=i; j++)
			
                   	  System.out.print((char)j+" ");
			
                System.out.println();
                }

	}
}