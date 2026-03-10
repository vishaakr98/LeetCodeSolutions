1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int ans[] = new int[nums.length];
4        int prefix = 1;
5        
6        for(int i = 0 ; i < nums.length ; i++) {
7            ans[i] = prefix;
8            prefix = prefix * nums[i];
9        }
10
11        prefix = 1;
12        for(int i = nums.length-1 ; i >= 0 ;i--) {
13            ans[i] = prefix * ans[i];
14            prefix = prefix * nums[i];
15        } 
16        
17        return ans;
18    }
19}