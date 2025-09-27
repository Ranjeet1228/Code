#include <stdio.h>
int main(){
    int row, col;
    printf("Enter no of row array:- ");
    scanf("%d",&row);

    printf("Enter no of column of an array:- ");
    scanf("%d",&col);

    int arr[row][col];

    printf("Enter the element of arr:- \n");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    
    int SOD =0;

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(i==j) SOD+=arr[i][j];
        }
    }

    printf("Sum of diagonal:- %d",SOD);
  return 0;  
}