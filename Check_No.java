/*
Write Java Program Which accept N number from user and Accept one Another Number as No,Check whether No is Present or Not.

Input : N  6
        NO: 66
        Elements: 85  66 3 66 93 88
Output:TRUE

Input:  N  6
        NO:12
        Elements:85 11 3 15 11 111
Output:FALSE
        
*/

import java.lang.*;
import java.util.*;

class Program1
{
      public static void main(String arg[])
      {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Please enter the Array:");
            int iNo1=sobj.nextInt();
            
            System.out.println("Please Number enter to Check in Array:");
            int iNo2=sobj.nextInt();

            ArrayX aobj=new ArrayX(iNo1);
            aobj.accept();
            aobj.display();
            
            boolean bRet=aobj.Check(iNo2);
            if(bRet==true)
            {
               System.out.println("TRUE");
            }
            else
            {
                System.out.println("FALSE");
            }         
      }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
            int iCnt=0;
            for(iCnt=0;iCnt<Arr.length;iCnt++)
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
      
      public boolean Check(int iNo2)
      {
        int iCnt=0;
        int iFreq=0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
                if(Arr[iCnt]==iNo2)
                {
                   iFreq++;
                }
        }
        if(iFreq==0)
        {
            return false;
        }
        else
        {
            return true;
        }
      }
       
}
