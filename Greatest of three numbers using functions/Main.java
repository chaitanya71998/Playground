import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      int result;
      if(n1>n2)
      {
        int a= compare(n1,n3);
        result=a;
    }
  else
      {
        int b= compare(n2,n3);
    result=b;
    }
    System.out.print(result);
    }
  public static int compare(int n1, int n2)
  {
    int result;
    if(n1>n2)
    {
      int a=n1;
      result=a;
    }
    else
    {
      int b=n2;
      result=b;
    }
    return result;
  }
}

