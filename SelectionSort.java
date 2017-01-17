import java.util.Scanner;
class SelectionSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of Elements");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int min,temp;
		for(int i=0;i<(n-1);i++)
		{
			min = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[min]>arr[j])
				{
					min = j;
				}
					
			}
			if(i!=min)
			{
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				
			}
		}
		System.out.println("The sorted array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
