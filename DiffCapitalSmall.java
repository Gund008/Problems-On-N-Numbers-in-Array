/*
 * Write a Java Program which accept array of characters from user and return diffrence frequency of capital and frequency of small characters.
 * 
 * Input: b N e B R b A I O G i
 * Output:3(7-4)
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

   public int diffrence()
   {
       int iFreq1=0;
       int iFreq2=0;
       for(int i=0;i<Arr.length;i++)
       {
          if((Arr[i]>='A')&&(Arr[i]<='Z'))
           {
               iFreq1++;
           }
          else if((Arr[i]>='a')&&(Arr[i]<='z'))
          {
              iFreq2++;
          }
        }
        return iFreq1-iFreq2;
   }

}
////////////////////////////////////////////////////////////////////////////////////////////////

class Program4
{
   public static void main(String arg[])
   {
       Scanner sobj=new Scanner(System.in);

       System.out.println("Please Enter the size of Array that You want to create");
       int iSize=sobj.nextInt();  

       MyArray mobj=new MyArray(iSize);
       mobj.accept();
       int iRet=mobj.diffrence();
       System.out.println("Diffrence:"+iRet);
   }
}
