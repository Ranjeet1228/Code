#include <stdio.h>
int main(){
      int size;
    printf("Enter size of array:- ");
    scanf("%d",&size);

    int arr[size][size];
    int brr[size][size];

    printf("Enter the element of arr:- \n");
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    printf("Enter the element of brr:- \n");
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            scanf("%d",&brr[i][j]);
         }
    }

    
    int sum[size][size]; // new array to store addition of matrices
    int product[size][size]; // new matrices to store multiplication of matrices

    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){

            sum[i][j]= arr[i][j]+brr[i][j];

            int pro=0;
            for(int k=0;k<size;k++){
                pro+=(arr[i][k]*brr[k][j]);
            }
            product[i][j]=pro;
        }
    }

    printf("Sum of two matrices:- \n");
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            printf("%d ",sum[i][j]);
        }
        printf("\n");
    }

    printf("Product of two matrices:- \n");
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            printf("%d ",product[i][j]);
        }
        printf("\n");
    }


  return 0;  
}