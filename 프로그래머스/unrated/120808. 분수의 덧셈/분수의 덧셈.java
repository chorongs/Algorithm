class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 분자를 구합니다.
        int numerator = numer1 * denom2 + numer2 * denom1;
        // 분모를 구합니다.
        int denominator = denom1 * denom2;
        
        // 분자와 분모의 최대공약수를 구합니다.
        int gcd = gcd(numerator, denominator);
        
        // 분자와 분모를 최대공약수로 나누어 기약 분수로 만듭니다.
        answer[0] = numerator / gcd;
        answer[1] = denominator / gcd;
        
        return answer;
    }
    
    // 최대공약수를 구하는 함수입니다.
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
