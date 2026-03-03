#include <stdio.h>

int main() {

    int num, temp, sum = 0;

    printf("Enter a number: ");
    scanf("%d",&num);

    int div2 = num % 2 == 0;

    temp = num;

    while(temp != 0) {
        sum += temp % 10;
        temp /= 10;
    }

    int div9 = sum % 9 == 0;

    if(div2 && div9)
        printf("%d is divisible by 18", num);
    else
        printf("%d is not divisible by 18", num);

    return 0;
} 
