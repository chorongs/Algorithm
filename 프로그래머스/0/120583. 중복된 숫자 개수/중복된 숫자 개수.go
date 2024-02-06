func solution(array []int, n int) int {
    count := 0
    for _, num := range array {
        if num == n {
            count++
        }
    }
    return count
}
