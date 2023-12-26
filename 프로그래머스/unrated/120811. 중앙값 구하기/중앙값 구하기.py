def solution(array):
    array.sort()  # 리스트를 오름차순으로 정렬
    return array[len(array)//2]  # 중앙값 반환

print(solution([1, 2, 7, 10, 11]))  # 출력: 7
