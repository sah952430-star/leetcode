class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result =new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            while(j<n){
                int k = j+1;
                int m = n-1;
                while(k <m){
                    long sum = (long)nums[i]+ nums[j]+ nums[k]+nums[m];
                    
                    if(sum> target){
                        m--;
                    }
                    else if(sum <target){
                        k++;
                    }
                    else{
                        result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[m]));
                        k++;
                        m--;
                        while(m>k && nums[k] == nums[k-1]){
                          k++;
                        }   
                    }    
                }
                j++;
                while( k>j && nums[j] == nums[j-1]){
                    j++;
                }
                
            }
        }
        return result;
        
    }
}