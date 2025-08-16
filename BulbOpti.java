public class BulbOpti {
    int count(int []arr){
        int csf = 0;
        for(int i = 0;i<arr.length;i++){
            int os = arr[i];
            int cs = os;
            if(csf%2 != 0){
                cs = 1 - os;
            }
            if(cs == 0){
                csf++;
            }
        }
        return csf;
    }
    public static void main(String[] args) {
        int []arr = {1,1,0,1};
        BulbOpti b = new BulbOpti();
        System.out.println(b.count(arr));
    }
}
