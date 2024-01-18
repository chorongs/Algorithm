import "strconv"

func solution(s string) int {
    numStr := s
    if s[0] == '-' || s[0] == '+' {
        numStr = s[1:]
    }
    
    num, _ := strconv.Atoi(numStr)
    
    if s[0] == '-' {
        num = -num
    }
    
    return num
}
