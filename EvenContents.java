/*
 * Write a Java Program which Accept two Arrays from  user and display Even contents of each Array.
 * Input:2  9  6  5  2  3
 *       45 6  12 18 23 4
 * 
 * Output:2  6  2 
 *        6  12  18  4 
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
 
     public void displayEvenContents()
     {
         int iCnt=0;
         for(iCnt=0;iCnt<Arr1.length;iCnt++)
         {
             if(Arr1[iCnt] % 2==0)
             {
                 System.out.print("\t"+Arr1[iCnt]);
             }
         }
         System.out.println("");
         for(int iCnt1=0;iCnt1<Arr2.length;iCnt1++)
         {
             if(Arr2[iCnt1] % 2==0)
             {
                 System.out.print("\t"+Arr2[iCnt1]);
             } 
         }
         System.out.println("");
     }
 }
 ////////////////////////////////////////////////////////////////////////////////////////////////
 
 class Program2
 {
     public static void main(String arg[])
     {
         int iNo1=6;
         int iNo2=6;
         MyArray mobj=new MyArray(iNo1, iNo2);
         mobj.accept();
         mobj.displayEvenContents();
     }
 }