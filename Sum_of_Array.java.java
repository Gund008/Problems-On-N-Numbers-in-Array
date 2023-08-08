/*
 * Write a Java Program which Accept two Arrays from  user and display Summation of each Array.
 * Input:2 9 7 5 2 3
 *       9 3 5 5 
 * 
 * Output:28  22
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
 
     public void displaySum()
    { 
         int iCnt=0;
         int iSum=0;
         int iSum1=0;
         for(iCnt=0;iCnt<Arr1.length;iCnt++)
         {
              iSum=iSum + Arr1[iCnt];
         }
         System.out.print(iSum+"\t");
         for(int iCnt1=0;iCnt1<Arr2.length;iCnt1++)
         {
              iSum1=iSum1 + Arr2[iCnt1];
         }
         System.out.print(iSum1+"\t");
         System.out.println("");
     }
 }
 ///////////////////////////////////////////////////////////////////////////////////////////////////
 
 class Program5
 {
     public static void main(String arg[])
     {
         int iNo1=6;
         int iNo2=4;
         MyArray mobj=new MyArray(iNo1,iNo2);
         mobj.accept();
         mobj.displaySum();
     }
 }
