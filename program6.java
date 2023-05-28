/*// To print the address of array //
************************************
class program1
{
	public static void main(String[]args)
	{
		int []a={1,2,3};
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}*/

/* //To print the address of array//
*************************************
class program2
{
	public static void main(String[]args)
	{
     int []a={1,2,3};
	 System.out.println(a[0]);
	 System.out.println(a[1]);
	 System.out.println(a[2]);
	 System.out.println(a[3]);
	}
}
error : ArrayIndexOutOfBoundsException*/

 /*// Enter the user Data //
//*******************************
import java.util.Scanner;
class program3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int [size];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter the element");
			a[i]=sc.nextInt();
		}
		System.out.println("Show the element");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
    }
}*/

/*// Enter the user data the space between to element //
//****************************************************
import java.util.Scanner;
class program4
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the element");
		int size=sc.nextInt();
		int a[]=new int [size];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter the element");
			a[i]=sc.nextInt();
		}
		System.out.print("[");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if (i<a.length-1)
			{
				System.out.print(" ");
			}
		}
		System.out.print("]");
	}

}*/

/*// Create the charater type data array store the element then print //
//******************************************************************
import java.util.Scanner;
class program5
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		char c1[]=new char [size];
		for (int i=0;i<c1.length;i++)
		{
			System.out.println("Enter the charater");
			c1[i]=sc.next().charAt(0);
		}
		System.out.print("[");
		for (int i=0;i<c1.length;i++)
		{
			System.out.print(c1[i]);
			if (i<c1.length-1)
			{
				System.out.print(" ");
			}
		}
		System.out.print("]");
	}
}*/

/*// Create char type array store the element and print only vowels //
//*****************************************************************
import java.util.Scanner;
class program6
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		char c1[]=new char [size];
		for (int i=0;i<c1.length;i++)
		{
			System.out.println("Enter the charater");
			c1[i]=sc.next().charAt(0);
		}
		System.out.print("[");
		for (int i=0;i<c1.length;i++)
		{
			if (c1[i]=='a' || c1[i]=='e' || c1[i]=='i' || c1[i]=='o' || c1[i]=='u' ||
				c1[i]=='A' || c1[i]=='E' || c1[i]=='I' || c1[i]=='O' || c1[i]=='U')
			{
			  if (i<c1.length-1)
			  {
				  System.out.print(c1[i]);
			  }
			  System.out.print(" ");
			}
		}
        System.out.print("]");
	}
}*/

// Create char type array store the element print accevaule of char//
//*******************************************************************

import java.util.Scanner;
class acce_vaule
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		char a[]=new char [size];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter the element");
			a[i]=sc.next().charAt(0);
		}
		System.out.println("Show the acce vaule");
		for (int i=0;i<a.length;i++ )
		{
			int b=a[i];
		}
	}
}


