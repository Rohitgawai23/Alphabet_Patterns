/*
A B C D E F
A B C D E
A B C D
A B C
A B
A
*/


class Charpattern_9
{
	public static void main(String []args)
	{
		int i,j;
      		for(i=70; i>=65; i--)
      		{
        		for(j=65; j<=i; j++)
        		{
        			System.out.print((char)j+" ");
        		}
      			System.out.println();
     		}
	}
}