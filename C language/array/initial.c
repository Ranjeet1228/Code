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

    for(int i =0; i<n; i++){
        printf("%d ", arr[i]);
    }
    // int size = sizeof(arr)/ sizeof(arr[0]);
    // printf("%d",size);

    return 0;
}