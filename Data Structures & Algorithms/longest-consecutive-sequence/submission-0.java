class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int longest_streak = 0;
        
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentnumber = num;
                int current_streak = 1;
                
                while (set.contains(currentnumber + 1)) {
                    currentnumber += 1;
                    current_streak++;
                }
                
                longest_streak = Math.max(longest_streak, current_streak);
            }
        }
        
        return longest_streak;
    }
}