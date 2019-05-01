import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
Scanner in = new Scanner(System.in);
      int n= in.nextInt();
    int lsd=n%10;
  int fsd=n/100;
      int sum=lsd+fsd;
      System.out.println(sum);
    }

}