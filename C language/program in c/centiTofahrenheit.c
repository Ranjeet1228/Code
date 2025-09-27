#include <stdio.h>

int main() {
    float c;
    printf("Enter temperature(in c):- ");
    scanf("%f",&c);
    float f=(9*c)/5+32;
    printf("Temperature in fahrenheit:- %.2f",f);
    return 0;
}