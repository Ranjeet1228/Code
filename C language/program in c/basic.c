#include<stdio.h>
void main(){
    int x = 3;
    int y=x++ + x++ + x++;
    printf("x=%d\t y=%d",x,y);
}