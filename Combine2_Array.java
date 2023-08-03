/*
 * Write a Java Program which Accept two Arrays from  user and form new Array which is combination of contents of first and second array,
 * Input:12 57 28 3
 *       99 23 54 58 6 67
 * Output:12 57 28 3  99 23 54 58 6 67
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
 
     public void displayCombineContents()
     {
         int iCnt=0;
         for(iCnt=0;iCnt<Arr1.length;iCnt++)
         {
             System.out.print(Arr1[iCnt]+"\t");
         }
         for(int iCnt1=0;iCnt1<Arr2.length;iCnt1++)
         {
             System.out.print(Arr2[iCnt1]+"\t");
         }
         System.out.println("");
     }
 }
 //////////////////////////////////////////////////////////////////////////////////////////////////
 
 class Program4
 {
     public static void main(String arg[])
     {
         int iNo1=4;
         int iNo2=6;
         MyArray mobj=new MyArray(iNo1,iNo2);
         mobj.accept();
         mobj.displayCombineContents();
     }
 }
