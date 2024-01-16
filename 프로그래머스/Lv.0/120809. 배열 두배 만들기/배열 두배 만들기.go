func solution(numbers []int) []int {
    for i, num := range numbers {
        numbers[i] = num * 2
    }
    return numbers
}
