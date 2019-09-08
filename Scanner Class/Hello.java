import java.util.*;
class Hello
{
	public static void main(String args[])
	{
		System.out.print("My name is: ");
		Scanner sc =new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("My name is: "+name);
		System.out.print("Age: ");
		int age=sc.nextInt();
		System.out.println("Age: "+age);
	}
}
