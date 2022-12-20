//Accept N number from user and Display EvenOdd Count from Array.

import java.lang.*;
import java.util.Scanner;

/*
 * Below Concept used in Class Designing :-
 *       Encapsulation:
 *       Inheritance:(Single Level)
 *       keyword:this,super 
 *       Access Specifier:Protected
 */
class ArrayX
{
    protected int Arr[];

    public ArrayX(int iSize)
    {
        this.Arr=new int [iSize];
    }

    protected void  accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter"+Arr.length +"Elements");
    
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
               System.out.println("Enter the Elements Number:"+(iCnt + 1));  
               Arr[iCnt]=sobj.nextInt();
        }
    }

    protected void display()
    {
        System.out.println("Array Elements are:");
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.print("\t"+Arr[iCnt]);
        }
        System.out.println();   
    } 
}
//////////////////////////////////////////////////////////////////////////////////////////////

class MarvellousX extends ArrayX
{
    public MarvellousX(int i)
    {
        super(i);
    }

    public void displayEvenOdd() 
    {
        int iCnt=0;
        int iEven=0;
        int iOdd=0;

        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt] % 2==0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }
        System.out.println("Number of Even Elements are:"+iEven);
        System.out.println("Number of odd  Elements are:"+iOdd);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////

class CountEvenOdd
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter size of Array:");
        int iNo=sobj.nextInt();

        MarvellousX aobj=new MarvellousX(iNo);
        
        aobj.accept();
        aobj.display();
        aobj.displayEvenOdd();
    }
}