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
        scanf("%d",ptr++);
    }
    ptr = arr;

    for(int i=0;i<n;i++){
        printf("%d\t",arr[i]);
    }
    printf("\n");
    free(ptr);
    ptr = (arr=NULL);
    printf("After free");
    if(ptr==NULL) printf("null");


    
  return 0;  
}