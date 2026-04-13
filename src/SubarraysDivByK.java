import java.util.Scanner;
public class SubarraysDivByK {
    public static int subarraycount(int[] arr, int k){
                  int[] freq=new int[k];
                  int prefix =0;
                  int count=0;
                  freq[0]=1;
                 for (int i=0;i<arr.length;i++){
                       prefix=prefix+arr[i];
                       int remainder= prefix%k;
                       if(remainder<0)
                               remainder=remainder+k;
                       count=count+freq[remainder];
                       freq[remainder]=freq[remainder]+1;
                       }
               return count;
           }
  public static void main(String[] args){
               Scanner sc =new Scanner(System.in);
               
               int n = sc.nextInt();
               int k= sc.nextInt();
               int[] arr= new int[n];
               System.out.println();
               for(int i=0;i<arr.length;i++){
                  arr[i]=sc.nextInt();
                }
               System.out.println(subarraycount(arr,k));
             }
                        
                    
            
    
}
