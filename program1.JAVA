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

 // Enter the user Data //
//*******************************
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
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
    }
}
