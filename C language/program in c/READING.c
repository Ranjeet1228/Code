#include<stdio.h>
void main(){
    // FILE*ptr = fopen("prime.c","r");
    // char ch[10000];
    // while(fgets(ch,2,ptr)!=NULL){
    //     printf("%s",ch);
    // }
    FILE* ptr = fopen("RANjeet.c","w");
    char str[] = "Ranjeet is good";
    fputs(str,ptr);
    fclose(ptr);
}