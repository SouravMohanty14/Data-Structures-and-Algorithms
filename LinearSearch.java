import java.util.Scanner;
class LinearSearch
{
	public static void main(String args[])
	{
	int n, num,i;
	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the number of elements");
 	n = sc.nextInt();
	int[] arr = new int[n];
 	System.out.println("Enter the elements");
 	for(i=0;i<n;i++)
 	{
 		arr[i] = sc.nextInt();
 	}
 	System.out.println("Enter the element to search");
 	num = sc.nextInt();
 	for(i=0;i<n;i++)
 	{
 		if(arr[i] == num)
 		{
 			System.out.println("Number found at location "+(i+1));
 			break;
 		}
 	}
 	if(i==n)
 	{
 		System.out.println("Number not found");
 	}
	}
}		
