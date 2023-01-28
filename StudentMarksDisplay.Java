/*
 * Write a Java Program which accept marks of N student from user and display class each student.
 * 
 * Less Than 35-Fail
 * Less Than 50-Pass class
 * Less Than 60-Second Class
 * Less Than 70-First Class
 * Greater than 70-First class With Disticntion
 * 
 * Input:67.3  45.8  88.9 77.5  55.2
 * 
 * Output:67.3   First class
 *        45.8   Pass class
 *        88.9   First class with Distinction
 *        77.5   First class with Distinction
 *        55.2   Second class
 */

 import java.util.*;

 class MyArray
 {
    public void Percentage(float arr[],int iNo)
    {
        int iCnt=0;
      
        for(iCnt=0;iCnt<iNo;iCnt++)
        {
            if((arr[iCnt]>=77.5) &&(arr[iCnt]<=100))
            {
                System.out.println(arr[iCnt]+"    First Class With Distinction");
            }
            else if((arr[iCnt]>=70.0) &&(arr[iCnt]<=77.5))
            {
                System.out.println("First Class With Distinction");
            }
            else if((arr[iCnt]>=60.0)&&(arr[iCnt]<=70.0))
            {
                System.out.println("First Class");
            }
            else if((arr[iCnt]>=50.0)&&(arr[iCnt]<=60.0))
            {
                System.out.println("Second Class");
            }
            else if((arr[iCnt]>=40.0)&&(arr[iCnt]<=50.0))
            {
                System.out.println("Pass Class");
            }     
            else if((arr[iCnt]>=30.00)&&(arr[iCnt]<=35.0))
            {
                System.out.println("Fail");
            }
            else
            {
                System.out.println("Inavalid Marks:");
            }
        }
    }
 }
 ///////////////////////////////////////////////////////////////////////////////////////////////////

class Program
{
    public static void main(String arg[])
    {
        MyArray mobj=new MyArray();
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter the Size of Array:");
        int iNo=sobj.nextInt();
        
        float Arr[]=new float[iNo];  //Array Creation

        System.out.println("Please Enter Array Elements:");
        for(int iCnt=0;iCnt<iNo;iCnt++)
        {
            Arr[iCnt]=sobj.nextFloat();
        }
        
        mobj.Percentage(Arr,iNo);
    }
}
