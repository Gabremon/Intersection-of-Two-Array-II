import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> helper = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i: nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (int i: nums2) {
            if(map.containsKey(i) && map.get(i) > 0) {
                helper.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        int[] answer = new int[helper.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = helper.get(i);
        } 
        
        return answer;
    }
}