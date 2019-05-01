import java.util.Scanner;
class Main
{
  public static int sumofdigits(int n)
  {
    int sum=0;
    int i=1;
    while(i<=n)
    {
      sum=sum+i;
      i++;
    }
    return sum;
      }
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n= in.nextInt();
      int org=sumofdigits(n);
      System.out.print(org);
	}
}