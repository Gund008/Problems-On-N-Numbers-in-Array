import java.util.Scanner;

/* 
Write a Java Program which Accept one array from user and  check whether that array and its elements are pallindrome or not.
Input: 11 252 387783 252  11
Output: TRUE

Input: 11 232 387783 77  11
Output: FALSE

Input: 11 252 786 252  11
Output: TRUE

Input: 11 252 786 253  11
Output: FALSE

 */

 import java.util.*;

 class MyArray
 {
     public int Arr[];
     
     public MyArray(int iSize)
     {
         Arr=new int[iSize];
     }
     public void accept()
     {
         Scanner sobj=new Scanner(System.in);
         int iCnt=0;
         for(iCnt=0;iCnt<Arr.length;iCnt++)
         {
             System.out.print("Array Elements:"+(iCnt+1));
             Arr[iCnt]=sobj.nextInt();
         }
         System.out.println("");
     }
    
    public boolean checkPallindrome()
    {
        int  iStart=0;        
        int iEnd=Arr.length-1;
        boolean bFlag=true;

        while(iStart<iEnd)
        {
            if(Arr[iStart]!=Arr[iEnd])
            {
                 bFlag=false;
                 break;
            }
            iStart++;
            iEnd--;  
        }
        return bFlag;
    }
}
     
//////////////////////////////////////////////////////////////////////////////////////////////////////////

class ArrayPallindromOrNot
{
    public static void main(String arg[])
    {
        int iNo=5;
        boolean bRet=false;
        MyArray mobj=new MyArray(iNo);
        mobj.accept();
        bRet=mobj.checkPallindrome();
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
