func solution(angle int) int {
    if angle > 0 && angle < 90 {
        return 1
    } else if angle == 90 {
        return 2
    } else if angle > 90 && angle < 180 {
        return 3
    } else if angle == 180 {
        return 4
    } else {
        return -1 // 잘못된 각도가 주어진 경우 -1을 반환
    }
}
