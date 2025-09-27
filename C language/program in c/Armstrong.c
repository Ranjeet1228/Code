#include<stdio.h>
#include<math.h>
int main(){
    for(int i=1;i<=100;i++){
        int tem=i;
        int count=0;
        while(tem>0){
            tem/=10;
            count++;
        }
        int temp=i;
        int num=0;
        while(temp>0){
            int rem=temp%10;
            num+=(int)pow(rem,count);
            temp/=10;
        }
        if(num == i) printf("%d\t",i);
    }
    return 0;
}