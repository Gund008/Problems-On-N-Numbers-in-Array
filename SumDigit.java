/*
 * Write a Java Program  which accept array from user and replace each member with summation of its digit.
 * Input: 89 687 56 549 87 9
 * 
 * Output:17 21 11 18 15 9
 * 
 */

 import java.util.*;
 class MyArray
 {
    public int Arr[];

    public MyArray(int iValue)
    {
        Arr=new int[iValue];
    }
    public void accept()
    {
        Scanner sobj=new Scanner(System.in);
        int iCnt=0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            System.out.print("Array Elements:"+(iCnt+1));
            Arr[iCnt]=sobj.nextInt();
        }
    }
    public void summationDigit()
    {
        int iDigit=0;
        int iCnt=0;
        int iSum=0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            while(Arr[iCnt]!=0)
            {
                iDigit=Arr[iCnt] % 10;
                iSum=iSum + iDigit;
                Arr[iCnt]=Arr[iCnt] / 10;
            }
            System.out.print("\t"+iSum);
            iSum=0;
        }
    }
 }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

 class Program2
 {
    public static void main(String arg[])
    {
        int iNo=6;
        MyArray mobj=new MyArray(iNo);
        mobj.accept();
        mobj.summationDigit();
    }
 }
