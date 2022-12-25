/*
Write Java Program which accept N numbers from user and return diffrence between Summation of even elements and summation of odd elements.
Input N: 6
      Elements: 85  66 3 80 93 88
Output: 53 (234-181)      

*/

import java.lang.*;
import java.util.*;

class ArrayX
{
      public int iValue;
      public int Arr[];

      public ArrayX(int A)
      {
            iValue=A;
            Arr=new int[iValue];
      }
      public void accept()
      {
            Scanner sobj=new Scanner(System.in);
            int iCnt=0;
            for(iCnt=0;iCnt<Arr.length;iCnt++)
            {
                  System.out.println("Enter the elements no:"+(iCnt+1));
                  Arr[iCnt]=sobj.nextInt();
            }
      }
      public int DiffEvenOdd()
      {
          int iCnt=0;
          int iSum=0;
          int iSum1=0;
          for(iCnt=0;iCnt<Arr.length;iCnt++)
          {
             if((Arr[iCnt] % 2)==0)
             {
                  iSum=iSum + Arr[iCnt];
             }
          }
          for(iCnt=0;iCnt<Arr.length;iCnt++)
          {
            if((Arr[iCnt] % 2)!=0)
            {
                  iSum1=iSum1 + Arr[iCnt];
            }
          }
          return iSum-iSum1;
      }
}
//////////////////////////////////////////////////////////////////////////////////////////////
class Program1
{
      public static void main(String arg[])
      {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Please enter Number:");
            int iNo=sobj.nextInt();

            ArrayX aobj=new ArrayX(iNo);
            aobj.accept();
            int iRet=aobj.DiffEvenOdd();
            System.out.println("Diffrence between Even and odd:"+iRet);            
      }
}




