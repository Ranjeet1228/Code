#include<stdio.h>
void main(){
    int n;
    printf("Enter n:- ");
    scanf("%d",&n);
    int count =0;
    for(int i=2;i<=n/2;i++){
        if(n%i==0) count++;
    }
    if(count==1) printf("prime number");
    else printf("composite");
}