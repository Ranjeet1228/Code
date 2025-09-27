#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
	
    char s[100];
    printf("enter the value of s:- ");
    scanf("%[^\n]%*c", &s);
      puts("Hello, World!");
       puts(s);
    return 0;
}