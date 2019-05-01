import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int ind=0;ind<n;ind++)
      {
        arr[ind]=in.nextInt();
      }
      int sum=in.nextInt();
      equalsum(arr,n,sum);
    }
 public static void equalsum(int arr[],int n,int sum)
 {
   int temp=0;
   for(int i=0;i<n;i++)
   {
     for(int j=i;j<n;j++)
     {
       temp=arr[i]+arr[j];
       if(temp==sum)
       {
         System.out.println(arr[i]+","+" "+arr[j]);
       }       
     }
     
   }
 }
}
       
    
