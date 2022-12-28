/*
Write Java Program Which accept N numbers from user and Accept Range,Display all elements from that range.

Input: N:  6
       Start: 60
       End : 90
       Elements: 85  66 3 76 93 88
Output:66  76  88

Input: N:  6
       Start: 30
       End : 50
       Elements: 85  66 3 76 93 88
Output:

*/

import java.lang.*;
import java.util.*;

class Program4
{
      public static void main(String arg[])
      {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Please enter Number:");
            int iNo1=sobj.nextInt();

            System.out.println("Please Accept Starting Number:");
            int iNo2=sobj.nextInt();
            System.out.println("Please Accept Ending Number:");
            int iNo3=sobj.nextInt();
            
            ArrayX aobj=new ArrayX(iNo1);
            aobj.accept();
            aobj.display();
            aobj.range(iNo2,iNo3);
      }
}
      
class ArrayX
{
      public int Arr[];
      
      public ArrayX(int iValue1)
      {
            Arr=new int[iValue1];
      }
      public void accept()
      {
            Scanner sobj=new Scanner(System.in);
            for(int iCnt=0;iCnt<Arr.length;iCnt++)
            {
                System.out.println("Enter the elements no:"+(iCnt+1));
                Arr[iCnt]=sobj.nextInt();
            }
      }
      public void display()
      {
            Scanner sobj=new Scanner(System.in);
            for(int iCnt=0;iCnt<Arr.length;iCnt++)
            {
               System.out.print(Arr[iCnt]+"\t");
            }
            System.out.println();
      }
     public void range(int iStart,int iEnd)
     {
        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if((Arr[iCnt]>=iStart)&&(Arr[iCnt]<=iEnd))
            {
                  System.out.print(Arr[iCnt]+"\t");
            }
           
        }
     }
       
}