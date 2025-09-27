#include <stdio.h>
int main(){
    int n;
    printf("Enter size:- ");
    scanf("%d",&n);
    int arr[n][n];
    int brr[n][n];

    // taking input from user
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            printf("Enter arr[%d][%d]",i+1,j+1);
            scanf("%d",&arr[i][j]);
        }
    }
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        printf("Enter brr[%d][%d]",i+1,j+1);
        scanf("%d",&brr[i][j]);
    }
}
    int multiplication[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            int prod =0;
            for(int k=0;k<n;k++){
                prod+=(arr[i][k]*brr[k][j]);
            }
           multiplication[i][j]=prod; 
        }
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            printf("%d ",multiplication[i][j]);
        }
        printf("\n");
    }

    return 0;
}