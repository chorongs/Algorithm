import java.lang.StringBuilder;
class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        String[] s = my_string.split("");
        for (int i = 0; i < index_list.length; i++) {
            sb.append(s[index_list[i]]);
        }
        String answer = sb.toString();
        return answer;
    }
}