/*
F E D C B A
E D C B A
D C B A
C B A
B A
A
A
B A
C B A
D C B A
E D C B A
F E D C B A
*/

class Charpattern_5
{
	public static void main(String []args)
	{
		int i,j;
   
     		for(i=70; i>=65; i--)
     		{
        		for(j=i; j>=65;j--)
        		{
        			System.out.print((char)j+" ");
        		}
     			System.out.println();
    		 }
    
     		for(i=65; i<=70; i++)
     		{
        		for(j=i; j>=65; j--)
        		{
        			System.out.print((char)j+" ");
        		}
      			System.out.println();
     		}


	}
}