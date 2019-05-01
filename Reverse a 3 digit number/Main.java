import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int f1= num/100 ;
    int f2= (num/10)%10 ;
    int f3= num%10;
   int rev=f3*100+f2*10+f1;
    System.out.println(rev);
   
    
  }
}