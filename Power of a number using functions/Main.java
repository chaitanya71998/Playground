import java.util.Scanner;
class Main{
  public static void main(String args[]){
   Scanner in =new Scanner(System.in);
    
    int n=in.nextInt();
  int exp=in.nextInt();
pow(n,exp);
    
  }
  public static int pow(int n,int exp)
                       {
                         int mult=1;
                         while(exp>=1)
                         {
                           mult=mult*n;
                           exp--;
                         }
    System.out.print(mult);
    return mult;
                
  }
                      
}
