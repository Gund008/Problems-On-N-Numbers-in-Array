/*
 * Write a Java Program which Accept two arrays from user and return diffrence between Summation of Arrays.
 * Input:2 9 7 5 2 3
 *       9 3 5 5
 * 
 * Output:6
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
            System.out.print("Array Elements:"+"\t"+(iCnt+1));
            Arr1[iCnt]=sobj.nextInt();
        }
        System.out.println("");
        for(int iCnt1=0;iCnt1<Arr2.length;iCnt1++)
        {
            System.out.print("Array Elements:"+"\t"+(iCnt1+1));
            Arr2[iCnt1]=sobj.nextInt();
        }
        System.out.println("");
    }

    public int summation()
    {
        int iCnt=0;
        int iSum1=0;
        int iSum2=0;
        for(iCnt=0;iCnt<Arr1.length;iCnt++)
        {
            iSum1=iSum1 +  Arr1[iCnt];
        }
        System.out.println("");
        for(int iCnt1=0;iCnt1<Arr2.length;iCnt1++)
        {
            iSum2=iSum2 + Arr2[iCnt1];
        }
        System.out.println("");
        return iSum1-iSum2;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////

class Program1
{
    public static void main(String arg[])
    {
        int iNo1=6;
        int iNo2=4;
        MyArray mobj=new MyArray(iNo1,iNo2);
        mobj.accept();
        int iRet=mobj.summation();
        System.out.println("Diffrence:"+iRet);
    }
}
