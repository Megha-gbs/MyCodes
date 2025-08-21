import java.util.*;
public class ENQ {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ENQ e = new ENQ();
    int []a = new int[n];
    for(int i = 0;i<n;i++){
        a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
int [][]Q = new int[m][2];
for(int i = 0;i<m;i++){
for(int j=0;j<2;j++){
    Q[i][j] = sc.nextInt();
}
}
int []p = e.range(a,Q);
for(int i =0 ;i<m;i++){
    System.out.print(p[i]+" ");
   } 
   }
   int[] Even(int []a,int n){
    int []pc = new int[n];
    if(a[0]%2 == 0){
        pc[0] = 1;
    }else{
        pc[0] = 0;
    }
    for(int i = 1;i<n;i++){
        if(a[i]%2 == 0){
        pc[i] = pc[i-1] + 1;
    }else{
        pc[i] = pc[i-1] + 0;
    }
}
    return pc;
   }
   int[] range(int []a,int [][]Q){
   int m = Q.length;
   int n = a.length;
   int pc[] = Even(a,n);
    int []ev = new int[m];
    for(int i =0;i<m;i++){
        int l = Q[i][0];
        int r = Q[i][1];
        if(l == 0){
            ev[i] = pc[r];
        }else{
            ev[i] = pc[r] - pc[l-1];
        }
    }
    return ev;
   }

}
