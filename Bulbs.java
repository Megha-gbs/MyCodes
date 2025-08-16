public class Bulbs {
    int count(int []arr,int n){
        int c = 0;
        for(int i = 0;i<n;i++){
         if(arr[i] == 0){
            c++;
            for(int j = i;j<n;j++){
                if(arr[j] == 0){
                    arr[j] = 1;
                }else{
                    arr[j] = 0;
                }
            }
         }
        }       
         return c;
    }
    public static void main(String[] args) {
        int []arr = {1,1,0,1};
        int n = arr.length;
        Bulbs b = new Bulbs();
        System.out.println(b.count(arr,n));
    }
}
