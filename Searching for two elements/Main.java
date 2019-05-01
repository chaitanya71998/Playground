import java.util.Scanner;
class Main{
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arrsize = in.nextInt();
      int arr[] = new int[arrsize];
    
      for(int idx = 0; idx <= arrsize - 1; idx++)
      {
         arr[idx] = in.nextInt();
      }
      int n1=in.nextInt();
     int n2=in.nextInt();
   
     int index=0;
     for(int i=0;i<=arrsize-1;i++)
     {
       if((arr[i]==n1))
       {
         index=i;
       }
     }
     if(index>=0)
         System.out.println(index);
         else
         {
           System.out.print("-1");
         }
     int inde=0;
     for(int i=0;i<=arrsize-1;i++)
     {
       if((arr[i]==n2))
       {
         inde=i;
       }
     }
     if(inde>0)
         System.out.println(inde);
         else
           System.out.print("-1");
     
     }
   }

