#include<stdio.h>
void main(){
    int a=0,b=1;
   
    int t;
    printf("Enter number of fibbonacci:- ");
    scanf("%d",&t);
    printf("%d ",a);
    while(t-1>0){
        printf("%d ",b);
        int sum = a+b;
        a=b;
        b=sum;
        t--;
    }
}