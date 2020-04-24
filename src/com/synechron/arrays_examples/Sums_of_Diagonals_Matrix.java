package com.synechron.arrays_examples;

public class Sums_of_Diagonals_Matrix 
{
	static void printDiagonalSums(int[][] mat, int n) 
	{
		int principal = 0, secondary = 0;
		/*for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) //O(N^2)
			{
				// Condition for principal 
				// diagonal 
				if (i == j)
					principal += mat[i][j];

				// Condition for secondary 
				// diagonal 
				if ((i + j) == (n - 1))
					secondary += mat[i][j];
			}
		}*/
		
		for (int i = 0; i < n; i++)  //O(N)
		{ 
            principal += mat[i][i]; 
            secondary += mat[i][n - i - 1];  
        } 

		System.out.println("Principal Diagonal:" + principal);

		System.out.println("Secondary Diagonal:" + secondary);
	}
    public static void main(String[] args)
    {

		int[][] a = { { 1, 2, 3, 4 }, 
					  { 5, 6, 7, 8 }, 
					  { 1, 2, 3, 4 }, 
					  { 5, 6, 7, 8 } };

		printDiagonalSums(a, 4);
	}

}
