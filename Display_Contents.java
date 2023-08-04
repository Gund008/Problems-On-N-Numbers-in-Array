/*
 * Write a Java Program which Accept two Arrays from  user and display contents of each Array.
 * Input:2 9 7 5 2 3
 *       9 3 5 5 
 * Output:2 9 7 5 2 3
 *        9 3 5 5 
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
         Scanner sobj=new Scanner(System.in);   //Time Complexity O(2N)
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
     }
 
     public void displayAllContents()
     {
         int iCnt=0;
         for(iCnt=0;iCnt<Arr1.length;iCnt++)
         {
             System.out.print("\t"+Arr1[iCnt]);
         }
         System.out.println("");
         for(int iCnt1=0;iCnt1<Arr2.length;iCnt1++)
         {
             System.out.print("\t"+Arr2[iCnt1]);
         }
         System.out.println("");
     }
 }
 //////////////////////////////////////////////////////////////////////////////////////////////////
 
 class Program1
 {
     public static void main(String arg[])
     {
         int iNo1=6;
         int iNo2=4;
         MyArray mobj=new MyArray(iNo1, iNo2); //Static and Hardcodeed
         mobj.accept();
         mobj.displayAllContents();
     }
 }
 
 
 
 
 
