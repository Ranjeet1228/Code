#include <stdio.h>
#include <stdlib.h>
int main(){
    int n;
    printf("Enter number:- ");
    scanf("%d",&n);
    int* arr = (int*) malloc(n*sizeof(int));
    int * ptr= arr;
    printf("Enter element of array:- ");
    for(int i=0;i<n;i++){
        scanf("%d",arr++);
    }

    for(int i=0;i<n;i++){
        printf("%d\t",*ptr++);
    }
    
  return 0;  
}