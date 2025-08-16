import java.util.*;
public class Leaders {
    int lead(int []arr,int n){
        int a = arr[n-1];
        int count = 1;
        for(int i = n-1;i>=0;i--){
            if(arr[i] > a){
                count++;
                a = arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Leaders l = new Leaders();
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(l.lead(arr,n));
    }
}
