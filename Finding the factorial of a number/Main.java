import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	  Scanner in = new Scanner(System.in);
	  int base = in.nextInt();
	  System.out.print(power_of_a_number(base));
	}
	public static int power_of_a_number(int x)
	{
	  int i,j=1,k,l;
      for(i=1;i<=x;i++)
      {
        j=j*i;
      }
      return j;
	}
}