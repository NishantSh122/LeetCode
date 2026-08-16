//easy
import java.util.*;
class L2996{
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        int i=1;
        while(i<nums.length && nums[i] == nums[i-1]+1){
            sum+= nums[i];
            i++;
        }
        HashSet<Integer> box = new HashSet<>();
        for(int t:nums)
            box.add(t);
        while(box.contains(sum))
            sum++;
        
        return sum;
    }
    public void main(int[] nums){
        missingInteger(nums);
    }
}