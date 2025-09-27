#include  <stdio.h>

int main(){
    // int n= 1;
    // int * ptr= & n;
    // printf("%d", n);
    // printf("%d\n", *ptr);
    // printf("%p\n", ptr);
    // printf("%u\n", ptr);


    int size;
    printf("Enter size of an array:- ");
    scanf("%d",&size);

    int arr[size];

    printf("Enter element of array:- \n");
    for(int i=0; i<size; i++){
        scanf("%d",&arr[i]);
    }

    int* ptr= arr;
    for(int i =0; i<size; i++){
        printf("%d ",*(ptr+i));
    }

    return 0;
}