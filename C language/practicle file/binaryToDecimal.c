#include <stdio.h>
#include<math.h>
int main(){
    int num;

    printf("Enter a binary number:- ");
    scanf("%d",&num);

    int deci=0;
    int i=0;
    while(num>0){
        int rem = num%10;
        deci = deci+(rem*pow(2,i++));
        num/=10;
    }
    printf("Number in decimal :- %d",deci);
    return 0;
}