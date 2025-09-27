#include <stdio.h>
int main(){
    int n;
    printf("Enter the size of array:- ");
    scanf("%d",&n);
    int arr[n];
    printf("%d", sizeof(arr)/sizeof(int));
  return 0;  
}