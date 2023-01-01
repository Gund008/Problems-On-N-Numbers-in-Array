/*

import javax.lang.model.util.ElementScanner14;
 * Write a Java Program which accept array of characters from user and replace each capital character with its Corresponding small Character.
 * Input: b N j B R b A d G G
 * Output:b n j b r b a d g g
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

   public void arrayReplace()
   {
       int iCh=0;
       for(int i=0;i<Arr.length;i++)
       {
           if((Arr[i]>='A')&&(Arr[i]<='Z'))
           {
                Arr[iCh]=(char)(Arr[i] + 32);
                System.out.print(Arr[iCh]+"\t");
           }
           else 
           {
               Arr[iCh]=Arr[i];
               System.out.print(Arr[iCh]+"\t");
           }  
        }
   }

}
////////////////////////////////////////////////////////////////////////////////////////////////

class Program1
{
   public static void main(String arg[])
   {
       Scanner sobj=new Scanner(System.in);

       System.out.println("Please Enter the size of Array that You want to create");
       int iSize=sobj.nextInt();  

       MyArray mobj=new MyArray(iSize);
       mobj.accept();
       mobj.arrayReplace();
   }
}
