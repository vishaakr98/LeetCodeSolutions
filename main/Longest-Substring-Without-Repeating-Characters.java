1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        // An array to store the last seen index of each character.
4        // We use an array of size 128 to cover all standard ASCII characters.
5        // Initialize all values to 0.
6        int[] lastSeen = new int[128];
7        
8        int maxLength = 0;
9        int start = 0; // The starting index of the current window.
10        
11        // Iterate through the string with the 'end' pointer.
12        for (int end = 0; end < s.length(); ++end) {
13            char currentChar = s.charAt(end);
14            
15            // Get the last seen index of the current character.
16            // Note: We add 1 to the start index because the array stores 1-based indices.
17            start = Math.max(start, lastSeen[currentChar]);
18            
19            // Calculate the length of the current window.
20            maxLength = Math.max(maxLength, end - start + 1);
21            
22            // Update the last seen index of the current character for the next iteration.
23            // We store the 1-based index (end + 1) to correctly handle the start position.
24            lastSeen[currentChar] = end + 1;
25        }
26        
27        return maxLength;
28    }
29}