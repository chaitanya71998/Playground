import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      int lsd=n%10;
      int fsd=10;
      while(n>10)  
      {
        fsd=n/10;
      n=n/10;
      }
      sum=lsd+fsd;
	System.out.print(sum);
    }
}
