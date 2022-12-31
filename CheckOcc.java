/*
Write Java Program Which accept N number from user and Accept one Another Number as No,Check whether No is Present or Not.

Input : N  6
        NO: 66
        Elements: 85  66 3 66 93 88
Output:1

Input:  N  6
        NO:12
        Elements:85 11 3 15 11 111
Output:-1
        
*/

import java.lang.*;
import java.util.*;

class Program2
{
      public static void main(String arg[])
      {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Please enter Number:");
            int iNo1=sobj.nextInt();
            System.out.println("Please Accept one Another Number:");
            int iNo2=sobj.nextInt();
            
            ArrayX aobj=new ArrayX(iNo1);
            aobj.accept();
            aobj.display();
            int iRet=aobj.check(iNo2);
            int iCnt=0;
            if(iRet==-1)
            {
                  System.out.println(-1);
            }
            else
            {
                  System.out.println(iRet);
            }   
      }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////
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
      public int check(int iValue2)
      {
            int iCnt=0;
            int iFreq=0;
            for( iCnt=0;iCnt<Arr.length;iCnt++)
            {
                  if(Arr[iCnt]==iValue2)
                  {
                      break; 
                  }
            }
            if(iCnt==Arr.length)
            {
                  return -1;
            }
            else
            {
                  return iCnt;
            }
      }
}