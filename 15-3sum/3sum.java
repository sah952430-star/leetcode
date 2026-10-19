class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        int n= nums.length;
        Arrays.sort(nums);
        
        for(int i=0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
               int sum=nums[i]+nums[j]+nums[k];
                List<Integer> triplet = Arrays.asList(nums[i] , nums[j] , nums[k]);

                if(sum >0){
                    k--;
                }
                else if(sum <0){
                    j++;
                }
                else{
                    result.add(triplet);
                    j++;
                    k--;
                    while(k>j && nums[j] == nums[j-1]){
                        j++;
                    }
                }
                
            }

            
        }
        return result;
        
    }
}