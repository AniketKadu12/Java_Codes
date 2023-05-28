//**********************************************************************************************
                                   //ARRAY//
//**********************************************************************************************

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
class vowal
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

/*// Create char type array store the element print accevaule of char//
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
			{
				System.out.println(b);
			}
		}
	}
}*/


/*//Create the floate type array store the element and print the element in intger format//
//**************************************************************************************

import java.util.Scanner;
class floate_type_array
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		float f1[]=new float [size];
		
		for (int i=0;i<f1.length;i++)
		{
			System.out.println("Enter the element");
			f1[i]=sc.nextFloat();
		}
		System.out.println("Show all float element beforeconverting in int ");
       for (int i=0;i<f1.length;i++)
		{
		
			System.out.println(f1[i]);
		}
		System.out.println("Show all float element after converting in int ");
		for (int i=0;i<f1.length;i++)
		{
		
			System.out.println((int)f1[i]);
		}
	}
}*/


/*//Create inter type array store the element cheak the element odd or even if the element in even to print sqaure and the element is odd to print cube//
//*****************************************************************************************************************************************************

import java.util.Scanner;
class prime_or_even
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
			if (a[i]%2==0)
			{
				System.out.println("sqaure of no");
				System.out.println(a[i]*a[i]);
			}
			else 
			{
				System.out.println("cube of no");
				System.out.println(a[i]*a[i]*a[i]);
			}
		}
	}
}/*

//wajp to print the addition (sum) of element in given array//
//************************************************/

/*import java.util.Scanner;
class add_of_array
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int b[]=new int [size];
		int sum=0;
		for (int i=0;i<b.length;i++)
		{
			System.out.println("Enter the element");
			b[i]=sc.nextInt();
		}
		System.out.println("Show the add of element");
		for (int i=0;i<b.length;i++)
		{
			sum=sum+b[i];
		}
			System.out.println(sum);
	}
}*/

//wajp to print the 2 combintion of array//
//*******************************************
/*import java.util.Scanner;
class combition_of_array
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the A size");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the  size");
		int size1=sc.nextInt();
		int a1[]=new int [size1];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter the B element");
			a[i]=sc.nextInt();
		}
		for (int i=0;i<a1.length;i++)
		{
			System.out.println("Enter the element");
			a1[i]=sc.nextInt();
		}
		System.out.print("[");
		int b[]=new int[a.length+a1.length];
		int index=0;
		for (int i=0;i<a.length;i++)
		{
			b[index++]=a[i];
		}
		for (int i=0;i<a1.length;i++)
		{
			b[index++]=a1[i];
		}
        for (int i=0;i<b.length;i++)
        {
			System.out.print(b[i]+" ");
        }
		System.out.print("]");
	}
}*/


// Wajp to print finding the index in given Array //
//*************************************************

/*import java.util.Scanner;
class finding_index
{
  public static void main(String []args)
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
    System.out.println("Enter the index");
    int index=sc.nextInt();
    System.out.println("Show the element");
    if (index <a.length)
    {
     System.out.println(a[index]);
    }
     else
       {
		System.out.println(a[index]);
       }
}
}*/


//wajp to print only all unique element of given array//
//******************************************************
/*import java.util.Scanner;
class all_unique_no
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
    System.out.println("Show the unique  element");
	for (int i=0;i<a.length;i++)
		{
			int c=1;
			if (a[i]!=0)
			{
				for (int j=i+1;j<a.length;j++)
				{
					if (a[i]==a[j])
					{
						c++;
						a[j]=0;
					}
				}
				if (c==1)
				{
					System.out.println(a[i]);
				}
			}
		}

    }
}*/


//wajp to print only all duplicate element of given array//
//*********************************************************
/*import java.util.Scanner;
class all_duplicate_no
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the size");
   int size=sc.nextInt();
   int a[]=new int [size];
   for (int i=0;i<a.length;i++)
   {
     System.out.println("Enter the element");
     a[i]=sc.nextInt();
   }
   System.out.println("Show all duplicate element");
   for (int i=0;i<a.length;i++)
   {
     int c=0;
     if (a[i]!=0)
     {
       for (int j=i+1;j<a.length;j++)
       {
         if (a[i]==a[j])
         { 
              c++;
              a[j]=0;
         }
       }
        if (c==1)
        { 
             System.out.println(a[i]);
        }
     }
   }
 }
}*/


//wajp to print only all unique String of given array//
//******************************************************

/*import java.util.Scanner;
class all_unique_string
{
 public static void main(String[]args)
  {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int size=sc.nextInt();
    String a[]=new String [size];
    for (int i=0;i<a.length;i++)
    {
      System.out.println("Enter the charater");
      a[i]=sc.next();
    }
      System.out.println("Show all unique charater");
      System.out.print("["+" ");
      for (int i=0;i<a.length;i++)
      {
       int c=1;
       if (a[i]!=null)
       {
        for (int j=i+1;j<a.length;j++)
        {
          if (a[i].equals(a[j]))
          {
             c++;
             a[j]=null;
          }
        }
          if (c==1)
          {
            System.out.print(a[i]+" ");
          }
      }
    }
      System.out.print("]");   
  }
}*/


//wajp to print only all duplicate String of given array//
//*********************************************************

/*import java.util.Scanner;
class all_duplicate_string
{
public static void main(String []args)
 {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int size=sc.nextInt();
    String a[]=new String[size];
    for (int i=0;i<a.length;i++)
    {
     System.out.println("Enter the element");
     a[i]=sc.next();
    }
    System.out.println("Show all duplicate String");
    System.out.print("["+" ");
    for (int i=0;i<a.length;i++)
    {
     int c=0;
     if (a[i]!=null)
     {
      for (int j=i+1;j<a.length;j++)
      {
       if (a[i].equals(a[j]))
       {
         c++;
         a[j]=null;
       }
      }
       if (c==1)
       {
          System.out.print(a[i]+" ");
       }
     }
   }
    System.out.print("]");
 }
}*/


//wajp to print the frist unique element in givn array//
//******************************************************

/*import java.util.Scanner;
class frist_unique_no
{
	public static void main(String[] args) 
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
		System.out.println("__________________________");
		System.out.println("the fristunique element");
		for (int i=0;i<a.length;i++)
		{
			int c=0;
			if (a[i]!=0)
			{
				for (int j=i+1;j<a.length;j++)
				{
					if (a[i]==a[j])
					{
						c++;
						a[j]=0;
					}
				}
				if (c==0)
				{
					System.out.println(a[i]);
					System.exit(0);
				}
			}
		}

	}
}*/


//wajp to print the frist duplicate element in givn array//
//******************************************************

/*import java.util.Scanner;
class frist_duplicate_no
{
 public static void main(String []args)
 {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the size");
   int size=sc.nextInt();
   int a[]=new int [size];
   for (int i=0;i<a.length;i++)
   {
     System.out.println("Enter the element");
     a[i]=sc.nextInt();
   }
   System.out.println("Show frist duplicate element");
   for (int i=0;i<a.length;i++)
   {
     int c=0;
     if (a[i]!=0)
     {
       for (int j=i+1;j<a.length;j++)
       {
         if (a[i]==a[j])
         { 
              c++;
              a[j]=0;
         }
       }
        if (c==1)
        { 
             System.out.println(a[i]);
             System.exit(0);
        }
     }
   }
 }
}*/


//*********************************************************************************************
                                     //Array of task 1//                             29-01-2023
//*********************************************************************************************

//1) Create a int type array and store element print only even
//*********************************************************
/*import java.util.Scanner;
class only_even
{
  public static void main(String []args)
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
     System.out.println("Show all even no");
     for (int i=0;i<a.length;i++)
     {
       if (a[i]%2==0)
       {
          System.out.println(a[i]);
       }
     } 
   }
}*/


//2) Create a int type array and store element print only odd
//*********************************************************
/*import java.util.Scanner;
class only_odd
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
     System.out.println("Show all odd no");
    for (int i=0;i<a.length;i++)
    {
        if (a[i]%2!=0)
        {
          System.out.println(a[i]);
        }
    }
  }
}*/



//3) Create a int type array and store element print sum of even no
//*****************************************************************
 /*import java.util.Scanner;
 class sum_of_even
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
     System.out.println("Show the sum of even no");
      int sum=0;
     for (int i=0;i<a.length;i++)
     {
       if (a[i]%2==0)
       {
         sum=sum+a[i];
       }
     }
       System.out.println(sum);
   }
 }*/


//4) Create a int type array and store element print sum of odd no
//*****************************************************************
/*
import java.util.Scanner;
class sum_of_odd
{
 public static void main(String []args)
 {
	Scanner sc=new Scanner (System.in);
    System.out.println("Enter the size");
    int size=sc.nextInt();
    int a[]=new int [size];
    for (int i=0;i<a.length;i++)
    {
      System.out.println("Enter the element");
      a[i]=sc.nextInt();
    }
    System.out.println("Show of sum of odd no");
    int sum=0;
    for (int i=0;i<a.length;i++)
    {
       if (a[i]%2!=0)
       {
         sum=sum+a[i];
       }
    }
       System.out.println(sum);
 }
}
*/

//5) Create a int type array and store element print count of even no
//*****************************************************************//
 import java.util.Scanner;
 class count_of_even
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
     System.out.println("Show the sum of even no");
      int count=0;
     for (int i=0;i<a.length;i++)
     {
       if (a[i]%2==0)
       {
         count++;
       }
     }
       System.out.println(count);
   }
 }

//**********************************************************************************************
                                   //2D ARRAY//
//**********************************************************************************************
/*import java.util.Scanner;
class program1_2D
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of row");
		int row=sc.nextInt();
		System.out.println("Enter the no of col");
		int col=sc.nextInt();
		int a[][]=new int [row][col];
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter the element");
				a[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.print("["+" ");
			for (int j=0;j<a[i].length;j++) 
			{
		    System.out.print(a[i][j]+" ");
			}
			System.out.print("]");
			System.out.println();
		}
	}
}*/


