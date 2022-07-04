/*

F
F E
F E D
F E D C
F E D C B
F E D C B A

*/

class Charpattern_8
{
	public static void main(String []args)
	{
		  int i,j;
     		 for(i=70; i>=65; i--)
      		{
       			 for(j=70; j>=i; j--)
       			{
       		 		System.out.print((char)j+" ");
        		}
      			System.out.println();
     		}
	}
}