#include<stdio.h>
struct student{
    int rollNo;
    float cgpa;
    char sec;
};
int main(){
    struct student ranjeet,manish;
   
ranjeet.cgpa= 8.5;
ranjeet.rollNo=14;
ranjeet.sec='b';
printf("Rollno:- %d\n",ranjeet.rollNo);
printf("Cgpa:- %.2f\n",ranjeet.cgpa);
printf("Section:- %c\n", ranjeet.sec);
printf("\n");

manish.rollNo= 13;
manish.cgpa= 5.45;
manish.sec = 'b';
printf("Rollno:- %d\n",manish.rollNo);
printf("Cgpa:- %.2f\n",manish.cgpa);
printf("Section:- %c\n", manish.sec);

return 0;

}