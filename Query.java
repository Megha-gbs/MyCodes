import java.util.*;
public class Query {
    public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   int n = sc.nextInt();
      Query q = new Query();
    int []a = new int[n];
    for(int i = 0;i<n;i++){
        a[i] = sc.nextInt();
    }
    int m = sc.nextInt();
    int [][]Q = new int[m][2];
    for(int i = 0;i < m;i++){
        for(int j =0;j < 2;j++){
         Q[i][j] = sc.nextInt();
        }
    }
    int []p = q.solve(a,Q,n);
    for(int i=0;i<Q.length;i++){
        System.out.print(p[i]+" ");
    }

    }
    int[] prefix(int []a,int n){
        int []ps = new int[n];
        ps[0] = a[0];
      for(int i = 1;i<n;i++){
       ps[i] = ps[i-1]+a[i];
      }
    return ps;
    }
    int[] solve(int []a,int [][]Q,int n){
        int []ps = prefix(a,n);
        for(int i = 0;i<Q.length;i++){
        int l = Q[i][0];
        int r = Q[i][1];
        if(l == 0){
            ps[i] = ps[r];
        }else{
            ps[i] = ps[r] - ps[l-1];
        }
        }
        return ps;
    }
}
