import java.util.Scanner;

public class AGpairs{
    public static void main(String[] args){
        AGpairs obj = new AGpairs();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = obj.solve(str);
        System.out.println(res);
    }
     int solve(String str){
        int ans = 0;
        for(int i = 0;i < str.length();i++){
           if(str.charAt(i) == 'A'){
             for(int j = i+1;j < str.length();j++){
                if(str.charAt(j)=='G'){
                    ans++;
                }
             }
           }
        }
     return ans;
    }
}
