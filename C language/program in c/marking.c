#include<stdio.h>
void main(){
    float phy,chem,math,hin,eng;
    printf("Enter marks of physics:- ");
    scanf("%f",&phy);
    printf("Enter marks of chemistry:- ");
    scanf("%f",&chem);
    printf("Enter marks of mathematic:- ");
    scanf("%f",&math);
    printf("Enter marks of hindi:- ");
    scanf("%f",&hin);
    printf("Enter marks of english:- ");
    scanf("%f",&eng);
    float percentage=(phy+chem+math+hin+eng)/5;
    printf("percentage:- %.2f\n",percentage);
    printf("Grade:- ");
    if(percentage>90&&percentage<100) printf("A");
    else if(percentage>80&&percentage<90) printf("B");
    else if(percentage>60&&percentage<80) printf("C");
    else printf("D");
}