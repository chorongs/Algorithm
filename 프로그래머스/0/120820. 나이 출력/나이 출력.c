#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int age) {
    int answer = 0;
    int year = 2022;
    int birth = year - age + 1;
    answer = birth;
    return answer;
}