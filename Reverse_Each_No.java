import java.util.Scanner;

/*
 * Write a Java Program  which accept array from user and display revrse each number of that array
 * Input: 89 687 56 549 87 9
 * 
 * Output:98 786 65 945 78 9
 * 
 */

 class MyArray
 {
    public int Arr[];

    public MyArray(int iValue)
    {
        Arr=new int[iValue];
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
    }
    public void revrse()
    {
        int iDigit=0;
        int iCnt=0;
        int iRev=0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
            while(Arr[iCnt]!=0)
            {
                iDigit=Arr[iCnt] % 10;
                iRev=(iRev * 10)+ iDigit;
                Arr[iCnt]=Arr[iCnt] / 10;
            }
            System.out.print("\t"+iRev);
            iRev=0;
        }
    }
 }
 ////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 class Program1
 {
    public static void main(String arg[])
    {
        int iNo=6;
        MyArray mobj=new MyArray(iNo);
        mobj.accept();
        mobj.revrse();
    }
 }
