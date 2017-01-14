import java.util.Scanner;
class BinarySearch
{
	public static void main(String args[])
	{
		int n,num,i,first,last,middle;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in sorted order");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		num = sc.nextInt();
		
		first = 0;
		last = n-1;
		middle=(first+last)/2;
		while(first<=last)
		{
		 	if(arr[middle]==num)
		 	{
		 		System.out.println("Number found!");
		 		break;
		 	}
		 	else if(arr[middle]<num)
		 	{
		 		first = middle+1;
		 	}
		 	else
		 	{
		 		//if(arr[middle]>num
		 		last = middle-1;
		 	}
		 	middle = (first+last)/2;
		}
		if(first>last)
		{
			System.out.println("Number not found!");
		}
	}
}
