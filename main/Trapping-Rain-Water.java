1class Solution {
2    public int trap(int[] height) {
3        // two pointer approach, just runs once comapred to three times in DP approach
4        int res = 0;
5        int l = 1; 
6        int r = height.length-2;
7        int lmax = height[0];
8        int rmax = height[height.length-1];
9
10        while (l <= r) {
11            // if edges are not the tallest there is no water trapped. 
12            if (lmax < height[l])
13                lmax = height[l++];
14            else if (rmax < height[r])
15                rmax = height[r--];
16            // when you know the walls, now calculate the max water stored. 
17            else if (lmax < rmax) 
18                res += lmax - height[l++];
19            else 
20                res += rmax - height[r--];
21        }
22
23        return res;
24    }
25}