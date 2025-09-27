#include<stdio.h>
struct student{
    int rollNo;
    float cgpa;
    char sec;
};
void print (struct student ranjeet){
    printf("RollNo:- %d\n",ranjeet.rollNo);
    printf("CGPA:- %.2f\n",ranjeet.cgpa);
    printf("Sec:- %c\n",ranjeet.sec);
}
void main(){
    struct student ranjeet;
    ranjeet.rollNo= 14;
    ranjeet.cgpa=12.34;
    ranjeet.sec='b';
    print(ranjeet);
}