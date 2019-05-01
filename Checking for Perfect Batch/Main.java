import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int index=0;index<n;index++)
    {
      list[index]=in.nextInt();
    }
    perfectbatch(list,n);
    
  }
  public static void  perfectbatch(int list[],int n)
  {
    boolean isperfectbatch=true;
    int batchsum=list[0]+list[1]+list[2];
    for(int index=3;index<=n-1;index=index+3)
    {
      int currbatchsum=list[index]+list[index+1]+list[index+2];
      if(currbatchsum!=batchsum)
      {
        isperfectbatch=false;
      }
    }
    if(isperfectbatch==true)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}

    
