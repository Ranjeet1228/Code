#include<stdio.h>
void main(){
    int n;
    printf("enter n:- ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter element:- ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int su=0;
    for(int i=0;i<n;i++){
    su+=arr[i];
    }
    printf("%d",su);
}