#include<stdio.h>

int main(){
    int n;
    printf("Enter an size of array:- ");
    scanf("%d",&n);

    int arr[n];

    printf("Enter element of an array:- \n");
    for(int i =0; i<n; i++){
        scanf("%d",&arr[i]);
    }

    int sum =0;
    for(int i =0; i<n; i++){
        sum+=arr[i];
    }

    printf("Sum of array:- %d", sum);
}