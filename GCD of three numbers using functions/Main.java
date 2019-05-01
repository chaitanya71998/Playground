import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      
      int gcd1=gcd(n1,n2);
      int gcd2=gcd(gcd1,n3);
      System.out.print(gcd2);            
	}
public static int gcd(int n1,int n2)
{
  int minele;
  int gcd=0;
  
  if(n1<n2)
  {
    minele=n1;
  }
  else 
  {
    minele=n2;
  }
  while (minele>=1)
  {
    if(n1%minele==0&&n2%minele==0)
    {
      gcd=minele;
      break;
    }
    minele--;
  }
  return gcd;
}
  }