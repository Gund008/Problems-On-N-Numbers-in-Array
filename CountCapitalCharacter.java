/*
 * Write a Java Program  which accept array of Characters from user and count number of capital characters.
 * Input: b N j B R b A d G G
 * 
 * Output:6
 * 
 */

 
import java.util.*;

 class MyArray
 {
    public char Arr[];

    public MyArray(int iSize)
    {
        Arr=new char[iSize];  //Arr char=new char[isize];
    }

    public void accept()
    {
        Scanner sobj=new Scanner(System.in);
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.println("Enter the character no:"+(iCnt+1));
            Arr [iCnt]=sobj.next().charAt(0);
        }
    }

    public int countCapital()
    {
        int iCnt=0;
        for(int i=0;i<Arr.length;i++)
        {
            if((Arr[i]>='A')&&(Arr[i]<='Z'))
            {
                  iCnt++;
            }
        }
        return iCnt;
    }

 }
 ////////////////////////////////////////////////////////////////////////////////////////////////
 
 class Program3
 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please Enter the size of Array that You want to create");
        int iSize=sobj.nextInt();  

        MyArray mobj=new MyArray(iSize);
        mobj.accept();
        int iRet=mobj.countCapital();
        System.out.println("Count of Capital character in Array:"+iRet);
    }
 }
