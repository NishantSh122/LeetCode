import java.util.*;

class L3471 {
    public void largestInteger() {
        int[] nums = {0,0};
        int k =1;
        int t= 0;
        int res = 0;
        int m = 2147483647;
        int[] n = new int[10];
        int l = nums.length;
        for(int i = 0; i<=l-k; i++){
            n[nums[i]] = (nums[i]==0)?n[nums[i]]-1:n[nums[i]]+1;
            for(int j = i+1; j<i+k; j++){
                System.out.print(nums[j]+ " ");
                n[nums[j]]++;
            }
            System.out.println();
            
            System.out.println(Arrays.toString(n));
        }
        //[3,9,2,1,7]
        for(int d: n){
            if(d!=0){
                if(d<m || d==m){
                    m=d;
                    res = t;
                    System.out.println("m = " + m);
                    System.out.println("res = " + res);
                }
            }
            System.out.println("m = " + m);
            System.out.println("res = " + res);
            t++;
        }
        System.out.println(res);
    }
    public void main(){
        largestInteger();
    }
}