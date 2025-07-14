class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] diff = new int[nums.length];
      
        for(int i =0; i<nums.length; i++){
        List<Integer> prefix = new ArrayList<>();
        List<Integer> suffix = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                if(prefix.contains(nums[j]) == false){
                    prefix.add(nums[j]);
                }
            }
            for(int k =i+1; k<nums.length; k++){
                if(suffix.contains(nums[k]) == false){
                    suffix.add(nums[k]);
                }
            }
            diff[i] = prefix.size() - suffix.size();
            
        }
        return diff;
    }
}
