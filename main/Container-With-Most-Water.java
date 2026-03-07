1class Solution {
2    public int maxArea(int[] height) {
3        int res = Integer.MIN_VALUE;
4        int l = 0, r = height.length - 1;
5
6        while (l < r) {
7            int minHeight = Math.min(height[l], height[r]);
8            res = Math.max(res, (r - l) * minHeight);
9
10            if (height[l] < height[r]){
11                // move if values are lesser than height[l]
12                while(l < r && height[l] <= minHeight)
13                    l++;
14            }
15            else {
16                // move if values are lesser than height[r]
17                while(l < r && height[r] <= minHeight)
18                    r--;
19            }
20        }
21
22        return res;
23    }
24}