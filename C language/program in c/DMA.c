#include<stdio.h>
#include<stdlib.h>
int main(){
    int num;
    int *num2 = (int*) malloc(sizeof(int));
    if(num2!= NULL)
    printf("Memory allocated sucessfully: \n");
    else
    printf("Fail");


    free(num2); // use to deallocate the memory
    num2 =NULL; // to avalid dangling pointer
    if(num2!= NULL)
    printf("Memory allocated sucessfully: ");
    else
    printf("Fail");

    return 0;
}