#include <stdio.h>
#include<stdbool.h>
int main(){
     int size;
    printf("Enter the size of array:- ");
    scanf("%d",&size);
    int arr[size];

    for(int i=0;i<size;i++){
        printf("Enter arr[%d]:- ",i);
        scanf("%d",&arr[i]);
    }

    int num;
    printf("Enter the number to be check:- ");
    scanf("%d",&num);

    bool flag = false;
    for(int i=0;i<size;i++){
        if(arr[i]==num){
            flag = true;
            break;
        }
    }

    if(flag) printf("found");
    else printf("Not found");

  return 0;  
}