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
     int greater=0;
     for(int i=0;i<=arrsize-1;i++)
     {
       if(arr[i]>greater)
       {
         greater=arr[i];
       }
     }
  System.out.println(greater);
   }
}

     