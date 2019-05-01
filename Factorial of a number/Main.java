import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int i=n;
      int mult=1;
      for (i=n;i>0;i--)
      {
        mult=i*mult;
      }
      System.out.println(mult);
     
      
	}
}