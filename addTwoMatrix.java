
package addtwomatrix;
public class addTwoMatrix {

	public static void main(String[] args) {
		int x[][]={{1,3,4},{2,4,3},{3,4,5}}; 
                int y[][]={{1,3,4},{2,4,3},{1,2,4}};
                int[][] sum = new int[3][3];
		int i, j;
		
		for(i = 0; i < x.length; i++)
		{
			for(j = 0; j < x[0].length; j++)
			{
				sum[i][j] = x[i][j] + y[i][j];
			}
		}
		System.out.println("------ The addition of two Matrices ------");
		
		for(i = 0; i < x.length; i++)
		{
			for(j = 0; j < x[0].length; j++)
			{
				System.out.format("%d \t", sum[i][j]);
			}
			System.out.println("");
		}
	}
}

