#include<stdio.h>
int main(){
    int n;
    printf("Enter a number:- ");
    scanf("%d",&n);

    int sp=n-1;
    int st =1;
    for(int i =1; i<=2*n; i++){

        for(int j=1; j<=sp;j++ ){
            printf("  ");
        }

        for(int j =1;j<= st; j++){
            printf("* ");
        }

        if(i<=n-1){
            st+=2;
            sp--;
        }
        if(i>n){
            st-=2;
            sp++;
        }
          printf("\n");
      
    }
    return 0;
}