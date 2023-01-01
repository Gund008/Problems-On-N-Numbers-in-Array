/*
 * Write a Java Program which accept array of characters from user and return count of Vowels in  Array.(Without Considering case)
 * Input: b N e B R b A i G i 
 * Output:4(count vowels)
 *   
 */

import java.util.*;

class MyArray
{
   public char Arr[];

   public MyArray(int iSize)
   {
       Arr=new char[iSize];  //Arr char=new char[isize];
   }

   public void accept()
   {
       Scanner sobj=new Scanner(System.in);
       for(int iCnt=0;iCnt<Arr.length;iCnt++)
       {
           System.out.println("Enter the character no:"+(iCnt+1));
           Arr [iCnt]=sobj.next().charAt(0);
       }
   }

   public int arrayCountVowels()
   {
       int iCnt=0;
       for(int i=0;i<Arr.length;i++)
       {
          if((Arr[i]=='A')||(Arr[i]=='a')||(Arr[i]=='E')||(Arr[i]=='e')||(Arr[i]=='I')||(Arr[i]=='i')||(Arr[i]=='O')||(Arr[i]=='o')||(Arr[i]=='U')||(Arr[i]=='u'))
          {
              iCnt++;
          }
       }
       return iCnt;
   }

}
////////////////////////////////////////////////////////////////////////////////////////////////

class Program2
{
   public static void main(String arg[])
   {
       Scanner sobj=new Scanner(System.in);

       System.out.println("Please Enter the size of Array that You want to create");
       int iSize=sobj.nextInt();  

       MyArray mobj=new MyArray(iSize);
       mobj.accept();
       int iRet=mobj.arrayCountVowels();
       System.out.println("Count of Vowels in Array:"+iRet);
   }
}
