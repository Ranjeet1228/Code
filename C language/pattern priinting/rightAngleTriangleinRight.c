#include<stdio.h>
int main(){
    int n;
    printf("Enter a number:- ");
    scanf("%d",&n);

    int sp =n-1;
    for(int i =1; i<= n; i++){

        for(int i =1; i<= sp;i++){
            printf("  ");
        }
        sp--;

        for(int j =1; j<=i;j++ ){
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}