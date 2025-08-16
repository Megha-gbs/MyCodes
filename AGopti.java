import java.util.*;
public class AGopti {
    int solve(String str){
        int count = 0;
        int add = 0;
        int n = str.length();
        for(int i = n-1 ; i >= 0 ; i--){
            if(str.charAt(i) == 'G'){
                add++;
            }
            if(str.charAt(i) == 'A'){
                count = count + add;
            }
        }
    return count;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        AGopti obj = new AGopti();
        System.out.println(obj.solve(str));

    }
}
