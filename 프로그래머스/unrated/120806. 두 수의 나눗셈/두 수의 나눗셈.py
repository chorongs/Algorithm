def solution(num1, num2):
    if num2 == 0:  # 나눗셈이 불가능한 경우를 대비
        return "Error: num2 cannot be zero."
    else:
        result = (num1 / num2) * 1000
        return int(result)  # 정수 부분만 return
