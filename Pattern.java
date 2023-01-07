import java.util.Scanner;

/*
 * Write a Java Program which accept array of  from user and display below pattern
 *   
 * Input:8 9 7 6 4 2 4
 * 
 * Output:
 *       
        *       *       *       *       *       *       *       *
        *       *       *       *       *       *       *       *       *
        *       *       *       *       *       *       *
        *       *       *       *       *       *
        *       *       *       *
        *       *
        *       *       *       *
 */

 
class MyArray
{
    public void pattern(int arr[],int iNo)
    {
        int i=0,j=0;
        int iCnt=0;

        for(i=0;i<iNo;i++)    //Travel Array(Outer Loop)
        {
             for(j=0;j<arr[i];j++)    //Inner Loop
             {
                System.out.print("\t*");
             }
            System.out.println(" ");
        }          
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{
   public static void main(String arg[])
   {
       MyArray mobj=new MyArray();
       Scanner sobj=new Scanner(System.in);
       System.out.println("Please enter the Size of Array:");
       int iNo=sobj.nextInt();

       int Arr[]=new int[iNo];

       System.out.println("Please enter the Elements of an Array:");
       {
           for(int iCnt=0;iCnt<iNo;iCnt++)
           {
               Arr[iCnt]=sobj.nextInt();
           }
       }
       mobj.pattern(Arr,iNo);
   }
}