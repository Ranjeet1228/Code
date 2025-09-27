#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    (n%400==0|| n%4==0)? printf("Leap year"): printf("Not a leap year");
}