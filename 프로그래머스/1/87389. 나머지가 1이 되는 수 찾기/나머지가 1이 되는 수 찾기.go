func solution(n int) int {
    for x := 2; ; x++ {
        if n%x == 1 {
            return x
        }
    }
}
