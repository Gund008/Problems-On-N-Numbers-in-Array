/* 
Write a Java Program which Accept two arrays from user and  copy the contents of that Array into another array in reverse order and return new array.

 */

 import java.util.*;
 class MyArrayX
 {
    public int copyContents(int Arr[],int Brr[])
    {
        int iRet=0;
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
          Brr[iCnt]=Arr[iCnt];
        }
        for(int iCnt=Brr.length-1;iCnt>=0;iCnt--)
        {
          iRet=Brr[iCnt];
        }
        return iRet;
    }
 }
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
  class PP
   {
    public static void main(String arg[]) 
    {
       MyArrayX mobj=new MyArrayX();
 
       Scanner sobj= new Scanner(System.in);
       
       System.out.println("Please Enter the First Array Size:");
       int iNo1=sobj.nextInt();
 
       int Arr[]=new int[iNo1];
 
       int Brr[]=new int[iNo1];
 
       System.out.println("Original Array:");
 
       for(int iCnt=0;iCnt<Arr.length;iCnt++)
       {
            Arr[iCnt]=sobj.nextInt();
       }
       
       int iRet=mobj.copyContents(Arr,Brr);
       System.out.println("Copied Array:");
 
       for(int j=Brr.length-1;j>=0;j--)
       {
         System.out.print(Brr[j]+"\t");
       }
       System.out.print("");
    }
  }