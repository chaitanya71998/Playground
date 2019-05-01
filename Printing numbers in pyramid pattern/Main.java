import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    int n = in.nextInt();
      int i=1;
   for(int rownum = 1; rownum <= n; ++rownum)
   {
for(int space = 1; space <= (n- rownum); ++space)
{
    		        System.out.print(" ");
		        }
     for(int col=1;col<=rownum;col++)
     {
       System.out.print(i );
       System.out.print(" ");
       i++;
     }
   
      System.out.print("\n");
    }
    }  
}
