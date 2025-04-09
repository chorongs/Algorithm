#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int service = n / 10;              
    int paid_drinks = k - service;    
    int answer = (n * 12000) + (paid_drinks * 2000); 
    return answer;
}
