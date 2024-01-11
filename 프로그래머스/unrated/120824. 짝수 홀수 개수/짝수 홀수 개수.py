def solution(num_list):
    even_count = 0  # 짝수 개수를 저장하는 변수
    odd_count = 0  # 홀수 개수를 저장하는 변수
    
    for num in num_list:  # 리스트의 각 원소를 순회하면서
        if num % 2 == 0:  # 짝수일 경우
            even_count += 1  # 짝수 개수를 1 증가시킴
        else:  # 홀수일 경우
            odd_count += 1  # 홀수 개수를 1 증가시킴
    
    return [even_count, odd_count]  # 짝수 개수와 홀수 개수를 담은 배열을 반환합니다.
