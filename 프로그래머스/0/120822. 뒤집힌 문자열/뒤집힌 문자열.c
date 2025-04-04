#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* my_string) {
    int len = strlen(my_string);
    
    // 문자열 길이 + 널문자('\0') 공간까지 확보
    char* answer = (char*)malloc(len + 1);

    // malloc 실패 예외 처리 (안전)
    if (answer == NULL) return NULL;

    // 문자열 뒤집기
    for (int i = 0; i < len; i++) {
        answer[i] = my_string[len - 1 - i];
    }

    // 널문자 추가
    answer[len] = '\0';

    return answer;
}
