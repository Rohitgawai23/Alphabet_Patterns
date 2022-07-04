/*
F E D C B A
F E D C B
F E D C
F E D
F E
F
*/

class Charpattern_7
{
	public static void main(String []args)
	{
		  int i,j;
      		for(i=65; i<=70; i++)
      		{
        		for(j=70; j>=i; j--)
        		{
        			System.out.print((char)j+" ");
        		}
      			System.out.println();
     		}
		
	}
}