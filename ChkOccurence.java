
//Accept N number from user and Accept one Number from user and Return Occurence of that Number

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
    protected int iValue;

    public ArrayX(int iSize,int i)
    {
        this.Arr=new int [iSize];
        this.iValue=i;
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
    public MarvellousX(int i,int j)
    {
        super(i,j);
    }

    public int chkOccurence() 
    {
        int iCnt=0;
        int iOcc=0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt]==iValue)
            {
                break;
            }
        }
        if(iCnt==Arr.length)
        {
            return -1;
        }
        else
        {
            return iCnt;
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////

class ChkOccurence
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter size of Array:");
        int iNo1=sobj.nextInt();

        System.out.println(" Enter the Number  Findout the index of first Occurence:");
        int iNo2=sobj.nextInt();

        MarvellousX aobj=new MarvellousX(iNo1,iNo2);
        
        aobj.accept();
        aobj.display();
        int iRet=aobj.chkOccurence();
        if(iRet==-1)
        {
            System.out.println(+iNo2+":is Not Occured in the Array Index:");
        }
        else
        {
            System.out.println(+iNo2+"is Occured in the Array Index:"+iRet);
        }

    }
}