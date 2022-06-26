
public class Main 
{
//chnged by me
	public static void main(String[] args) 
	{
		int i, j;
		int sum = 0;
		int count = 0;
		int [] arr = {1, 4, 6, 2, 7, 9};
		int x = 11;
		
		for(i=0; i<arr.length-1; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				sum = arr[i] + arr[j];
				if(sum == x)
				{
					count++;
				}
			}
		}
		System.out.println("Number of pairs : " + count);
		
	}

}
