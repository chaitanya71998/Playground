import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	     // Type your code here
      Scanner in=new Scanner(System.in);
       int n=in.nextInt();
      int i=1;
      System.out.println(i);
      for(i=2;i<=n;i++)
      {
        if(i%2!=0)
        {
          System.out.println(i);
        }
      }
	}
}