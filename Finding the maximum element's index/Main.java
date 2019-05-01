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
    int maxidx;
    if(list[0]>list[1])
    {
      maxidx=0;
    }
    else
    {
      maxidx=1;
    }
    for(int idx=2;idx<=n-1;idx++)
    {
      if(list[maxidx]<list[idx])
        maxidx=idx;
    }
    System.out.println(maxidx);
  }
}
