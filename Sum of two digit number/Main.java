import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
    int  fsd=n%10;
      int lsd=n/10;
      int sum=lsd+fsd;
      System.out.println(sum);
	}
}