class L3069 {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0]=nums[0]; res[1]=nums[1];
        int left =0,right=1,shift=1;
        for(int i = 0; i<n-2; i++){
            if(res[left]>res[right]){
            while(shift>0){
                res[left+shift+1]=res[left+shift];
                shift=shift-1;
            }
                res[left+1] = nums[i+2];
                left=left+1;
            }else{
                res[right+1] = nums[i+2];
            }
            right=right+1;
            shift=right-left;
        }
        //IDEA 1;
        // ArrayList<Integer> m = new ArrayList<>();
        // ArrayList<Integer> k = new ArrayList<>();
        // m.add(nums[0]);
        // k.add(nums[1]);
        // for(int i = 2;i<nums.length;i++){
        //     if(m.get(m.size()-1)>k.get(k.size()-1))
        //         m.add(nums[i]); 
        //     else 
        //         k.add(nums[i]);
        // }
        // m.addAll(k);
        return res;
    }
    public void main(String[] args){
        int[] nums = {6,5,14,15};
        resultArray(nums);
    }
}