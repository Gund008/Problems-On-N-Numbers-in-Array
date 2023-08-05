/* 
Write a Java Program which Accept two arrays from user and display minimum element of each array.
* Input:2 9 7 5 2 3
*       9 3 5 5
* 
* Output:2 3
 */

import java.util.*;

class MyArray
{
    public int Arr1[];
    public int Arr2[];

    public MyArray(int iValue1,int iValue2)
    {
        Arr1=new int[iValue1];
        Arr2=new int[iValue2];
    }
    public void accept()
    {
        Scanner sobj=new Scanner(System.in);
        int iCnt=0;
        for(iCnt=0;iCnt<Arr1.length;iCnt++)
        {
            System.out.print("Array Elements:"+(iCnt+1));
            Arr1[iCnt]=sobj.nextInt();
        }
        System.out.println("");
        for(int iCnt1=0;iCnt1<Arr2.length;iCnt1++)
        {
            System.out.print("Array Elements:"+(iCnt1+1));
            Arr2[iCnt1]=sobj.nextInt();
        }
        System.out.println("");
    }

    public void displayMinimum()
    {
        int iCnt=0;
        int iCnt1=0;
        int iMin=Arr1[0];
        int iMin1=Arr2[0];

        for(iCnt=0;iCnt<Arr1.length;iCnt++)
        {
           if(Arr1[iCnt]<iMin)
           {
              iMin=Arr1[iCnt];
           }
        }
        System.out.print(iMin+"\t");

        for(iCnt1=0;iCnt1<Arr2.length;iCnt1++)
        {
            if(Arr2[iCnt1]<iMin1)
            {
               iMin1=Arr2[iCnt1];
            }
        }
        System.out.print(iMin1+"\t");
        System.out.println("");
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////

class Program2
{
    public static void main(String arg[])
    {
        int iNo1=6;
        int iNo2=4;
        MyArray mobj=new MyArray(iNo1,iNo2);
        mobj.accept();
        mobj.displayMinimum();
    }
}
