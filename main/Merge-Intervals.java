1class Solution {
2    public int[][] merge(int[][] intervals) {
3        List<int[]> res = new ArrayList<>();
4        // sort the initial values 
5        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
6        res.add(intervals[0]);
7
8        for(int[] arr : intervals) {
9            int[] last = res.get(res.size()-1);
10            if (arr[0] <= last[1])
11                res.get(res.size()-1)[1] = Math.max(last[1], arr[1]);
12            else 
13                res.add(arr);
14        }
15
16        return res.toArray(new int[res.size()][]);
17    }
18}