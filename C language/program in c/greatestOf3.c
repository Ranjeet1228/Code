#include<stdio.h>
void main(){
   int a,b,c;
   printf("Enter first number:- ");
   scanf("%d",&a);
   printf("Enter second number:- ");
   scanf("%d",&b);
   printf("Enter third number:- ");
   scanf("%d",&c);
   if(a>b){
    if(a>c){
        printf("first is greatest");
    } else if(a<c){
        printf("third is greatest");
    } else{
        printf("first and third is greatest and equal");
    }
   } else if(b>a){
    if(b>c){
        printf("second is greatest");
    } else if(c>b){
        printf("third is greatest");
    } else{
        printf("second and third are equal and greatest");
    }
   } else{
    if(c>a){
        printf("third number is greatest");
    } else if(c<a){
        printf("first and second are greatest and equal");
    } else{
        printf("All are equal");
    }
   } 
}