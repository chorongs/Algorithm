class Solution {
    public int solution(int n) {
        for (int x = 2; x < n; x++) {
            if (n % x == 1) {
                return x;
            }
        }
        return -1; // 문제의 조건에 따르면 이 라인은 도달할 수 없습니다.
    }
}
