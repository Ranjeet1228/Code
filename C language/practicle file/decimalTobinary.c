#include <stdio.h>
#include<math.h>
int main(){
    int num;
    printf("Enter a number in decimal form:- ");
    scanf("%d",&num);

    int bin=0 ,i=1;
    while(num>0){
        int rem = num%2;
        bin = bin+rem*i;
        i*=10;
        num/=2;
    }
    printf("Number in binary:- %d",bin);
    return 0;
}