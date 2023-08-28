import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet();
        for (int i: arr) {
            set.add(i);
        }
        int[] answer = new int[k];
        int index = 0;
        for (int i: set) {
            if (index >= k) {
                break;
            }
            answer[index++] = i;
        }
        while (index < k) {
            answer[index++] = -1;
        }
        return answer;
    }
}