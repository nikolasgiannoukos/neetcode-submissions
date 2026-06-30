class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || k < 1) {
            return new int[0];
        }

        Map<Integer, Integer> freqmap = new HashMap<>();

        for (int num : nums) {
            freqmap.put(num, freqmap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freqmap.entrySet());

        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}

// 1334445555