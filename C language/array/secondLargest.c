#include <stdio.h>
#include <limits.h>
int main(){
    int n;
    printf("Enter an size of array:- ");
    scanf("%d",&n);

    int arr[n];

    printf("Enter element of an array:- \n");
    for(int i =0; i<n; i++){
        scanf("%d",&arr[i]);
    }

    int max =INT_MIN;
    int smax= INT_MIN;
    for(int i =0 ; i<n; i++){
        if(arr[i]>max){
            smax = max;
            max = arr[i];
        }
        else if(smax<arr[i]){
            smax= arr[i];
        }
    }

    printf("%d \n",smax);
        printf("%d",max);

}