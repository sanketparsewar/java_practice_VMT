package pattern;

/*
*
**
* *
*  *
*****
*/

public class Pattern4
{
	public static void main(String []args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{	if(i==1||i==n||j==1||j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}
//------------------------------------------------------
		System.out.println();

/*
    *
   **
  * *
 *  *
*****
*/
//--------------------------------------------------------------------------
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==1||i==n||j==1||j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		
		}
//---------------------------------------------------------
		System.out.println();
/*

  *
  *
*****
  *
  *

*/

//--------------------------------------------------------------------------
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{	if(j==(n/2)+1||i==(n/2)+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
//-----------------------------------------------------------
		System.out.println();
/*

    *
   * *
  *   *
 *     *
*       *

*/
//--------------------------------------------------------------------------
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				if(j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				if(j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
//--------------------------------------------------------------
		System.out.println();
/*

     *
    * *
   *   *
  *     *
 *       *
  *     *
   *   *
    * *
     *
*/

//--------------------------------------------------------------------------
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{	if(j==i)
					System.out.print("*");
				else
					System.out.print(" ");		
			}
			for(int j=i-1;j>=1;j--)
			{
				if(j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{	if(j==i)
					System.out.print("*");
				else
					System.out.print(" ");		
			}
			for(int j=i-1;j>=1;j--)
			{
				if(j==1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
//---------------------------------------------------------------------
		System.out.println();
/*

*********
*   *   *
*   *   *
*********
*   *   *
*   *   *
*********

*/
//--------------------------------------------------------------------------
		for (int j=1;j<=(n*2)-1;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		for(int i=1;i<=n;i++)
		{	for(int j=1;j<=(n*2)-1;j++)
			{
				if(j==((n*2)/2)||i==(n/2)+1||j==1||j==(n*2)-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int j=1;j<=(n*2)-1;j++)
			{
				System.out.print("*");
			}
		System.out.println();
//--------------------------------------------------------------------------
		System.out.println();

/*

*   *****
*   *
*   *
*********
    *   *
    *   *
*****   *

*/
//--------------------------------------------------------------------------

		for(int i=1;i<=((n*2)-1);i++)
		{	if(i==1||i>=(n*2)/2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n*2)-1;j++)
			{	if(j==((n*2)/2)||i==(n/2)+1)
					System.out.print("*");
				else if((j==1 && i<(n/2)+1)||(j==(n*2)-1 && i>=(n/2)+1))
					System.out.print("*");
				else
					System.out.print(" ");	
		}
			System.out.println();
		}

		for(int i=1;i<=(n*2)-1;i++)
		{	if(i==(n*2)-1||i<=(n*2)/2)
				System.out.print("*");
			else
				System.out.print(" ");	
		}
		System.out.println();

	}
}

