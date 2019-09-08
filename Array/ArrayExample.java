import java.util.*;
public class ArrayExample
{
	public static void main(String args[])
	{
		System.out.println("Create an array and enter the value of user: ");
		int arr[]=new int[5];
		System.out.println("Enter five value");
		Scanner sc=new Scanner(System.in);
		
			for(int i=0;i<5;i++)
				arr[i]=sc.nextInt();
		
			for(int i=0;i<5;i++)
			System.out.println("arr["+i+"]="+arr[i]);
	}
	
}