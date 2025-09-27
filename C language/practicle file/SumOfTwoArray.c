#include <stdio.h>
int main(){
    int size;
    printf("Enter size of array:- ");
    scanf("%d",&size);
    int arr[size];
    int brr[size];

    for(int i=0;i<size;i++){
        printf("Enter arr[%d]:- ",i);
        scanf("%d",&arr[i]);
    }
    printf("\n");
    for(int i=0;i<size;i++){
        printf("Enter brr[%d]:- ",i);
        scanf("%d",&brr[i]);
    }

    // create a new of same size to store their sum:
    int sum[size];
    for(int i=0;i<size;i++){
        sum[i]= arr[i]+brr[i];
    }

    // print sum
    printf("New sumArray:- \n");
    for(int i=0;i<size;i++){
        printf("%d ",sum[i]);
    }

  return 0;  
}