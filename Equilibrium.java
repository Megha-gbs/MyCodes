import java.util.Scanner;

public class Equilibrium {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Equilibrium e = new Equilibrium();
    int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = e.equiinarr(arr);
        System.out.print(count);    
    }
    int[] prefix(int []arr,int n){
        int []ps = new int[n];
        ps[0] = arr[0];
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1]+arr[i];
        }
        return ps;
    }
    int equiinarr(int []arr){
        int n = arr.length;
        int []ps = prefix(arr,n);
        int c = 0;
        for(int i = 1 ;i<n;i++){
          if(ps[i-1] == ps[n-1]-ps[i]){
            c++;
          }
        }
        return c;
    }
}
