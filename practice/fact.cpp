#include<iostream>

int fact(int n){
    if(n==0|| n==1) return 1;

    int fac = fact(n-1);
    return fac*n;
}
using namespace std;
int main(){

    cout<<"the factorial of 5:- ";
    cout<<fact(5)<<endl;
    return 0;
}