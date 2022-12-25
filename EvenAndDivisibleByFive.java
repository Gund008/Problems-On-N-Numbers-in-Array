/*
Write Java Program which accept N numbers from user and display all such elements which are even and divisible by 5.
Input N: 6
      Elements: 85  66 3 80 93 88
Output: 80      

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
      public void displayEvenDivisibleByfive()
      {
          int iCnt=0;
          for(iCnt=0;iCnt<Arr.length;iCnt++)
          {
            if((Arr[iCnt] % 5==0) && (Arr[iCnt]%2==0))
            {
                  System.out.print("\t:"+Arr[iCnt]);
            }
          } 
          System.out.println("");
      }
}
///////////////////////////////////////////////////////////////////////////////////////////////
class Program3
{
      public static void main(String arg[])
      {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Please enter Number:");
            int iNo=sobj.nextInt();

            ArrayX aobj=new ArrayX(iNo);
            aobj.accept();
            aobj.displayEvenDivisibleByfive();
      }
}




