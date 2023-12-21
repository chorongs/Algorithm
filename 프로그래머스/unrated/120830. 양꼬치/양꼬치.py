def solution(n, k):
    # 양꼬치 1인분 가격
    yangkochi_price = 12000 

    # 음료수 1개 가격
    drink_price = 2000 

    # 서비스로 받는 음료수 수
    service_drinks = n // 10 

    # 실제로 지불해야 하는 음료수 수
    real_drinks = max(0, k - service_drinks) 

    # 총 지불 금액 계산
    total_price = n * yangkochi_price + real_drinks * drink_price 

    return total_price
