//Accept N number from user and Return  Even Count of Array.

import java.lang.*;
import java.util.Scanner;

/*
 * Below Concept used in Class Designing :-
 *       Encapsulation:Characetristices,Beahviour
 *       Inheritance:(Single Level)
 *       keyword:this,super
 *       Access Specifier:Public
 */
class ArrayX
{
    public int Arr[];

    public ArrayX(int iSize)
    {
        this.Arr=new int [iSize];
    }
    public void  accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter"+Arr.length +"Elements");
    
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
               System.out.println("Enter the Elements Number:"+(iCnt + 1));  
               Arr[iCnt]=sobj.nextInt();
        }
    }

    public void display()
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
    public int countEven() 
    {
        int iCnt=0;
        int iEven=0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt] % 2==0)
            {
               iEven++;
            }
        }
       return iEven;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////

class  CountEven
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter size of Array:");
        int iNo=sobj.nextInt();

        MarvellousX aobj=new MarvellousX(iNo);
        
        aobj.accept();
        aobj.display();
        int iRet=aobj.countEven();
        System.out.println("Count of Even elements:"+iRet);
    }
}
