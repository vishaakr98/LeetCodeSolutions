1public class RandomizedSet {
2       private List<Integer> nums;
3       private Map<Integer, Integer> indices;
4       private Random rand;
5
6    public RandomizedSet() {
7        nums = new ArrayList<>();
8        indices = new HashMap<>();
9        rand = new Random();
10    }
11    
12    // all are O(1) steps
13    public boolean insert(int val) {
14        if(indices.containsKey(val)){
15            return false;
16        }
17        indices.put(val,nums.size());
18        nums.add(val);
19        return true;
20    }
21
22    // all are O(1) steps  
23    public boolean remove(int val) {
24        if(!indices.containsKey(val)){
25            return false;
26        }
27
28        int index = indices.get(val);
29        int lastElement = nums.get(nums.size() - 1);
30
31        nums.set(index , lastElement);
32        indices.put(lastElement, index);
33
34        nums.remove(nums.size() -1);
35        indices.remove(val);
36
37        return true;
38    }
39    
40    public int getRandom() {
41        return nums.get(rand.nextInt(nums.size()));
42    }
43}
44
45/**
46 * Your RandomizedSet object will be instantiated and called as such:
47 * RandomizedSet obj = new RandomizedSet();
48 * boolean param_1 = obj.insert(val);
49 * boolean param_2 = obj.remove(val);
50 * int param_3 = obj.getRandom();
51 */