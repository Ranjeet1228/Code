#include <stdio.h>
#include<limits.h>
int main(){
    int size;
    printf("Enter the size of array:- ");
    scanf("%d",&size);
    int arr[size];

    for(int i=0;i<size;i++){
        printf("Enter arr[%d]:- ",i);
        scanf("%d",&arr[i]);
    }

    int max = INT_MIN;
    int min = INT_MAX;
    for(int i=0;i<size;i++){
        if(max<arr[i]) max=arr[i];
        if(min>arr[i]) min = arr[i];
    }

    printf("Minmum value:- %d\n",min);
    printf("Maximum value:- %d",max);
  return 0;  
}