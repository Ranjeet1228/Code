#include <stdio.h>
#include<limits.h>
int main(){
    int size;
    printf("Enter the size of array:- ");
    scanf("%d",&size);
    int arr[size];

    for(int i=0;i<size;i++){

        scanf("%d",&arr[i]);
    }

    for(int i=0;i<size;i++){
        printf("%d",arr[i]);
    }
    return 0;
} 