import java.util.Scanner;

class BubbleSort
{
	static void Bubble(int[] arr,int n)
	{
		int i,j;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Bubble(arr,n);
		System.out.println("Array after Bubble Sort:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
