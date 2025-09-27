#include<iostream>
using namespace std;

class node{
public:
    int data;
    node* next;
    node(int data){
        this->data= data;
        next = nullptr;
    }
};

class linkedlist{
    public:
    node* head;
    node* tail;
    int size =0;

    linkedlist(){
        head = nullptr;
        tail = nullptr;
    }

    public:
    void add(int data){
        node* tem = new node(data);
        if(head == nullptr){
            head = tem;
            tail = tem;
        } else {
            tail->next = tem;
            tail = tem;
        }
        size++;
    }

    public:
    void display(){
        node *tem = head;

        cout<<"\nThe element of node"<<endl;
        while(tem!=nullptr){
            cout<<tem->data<<" ";
            tem= tem->next;
        }
        cout<<"\n"<<endl;
    }

   void remove(int val){
        node*tem = head;
        while(tem->next->data!=val){
            tem = tem->next;
        }
        tem->next = tem->next->next;
        size--;
   }


   void insert_at(int idx, int val){

        if(idx==0){
            add(val);
            return;
        }

        int i =0;
        node* tem = head;

        node* item = new node(val);
        while(tem!=nullptr && i!=idx-1){
            tem=tem->next;
            i++;
        }
        if(tem==nullptr){
            cout<<"Out of Index"<<endl;
            return;
        }
        item->next = tem->next;
        tem->next =item;
        size++;
    }
};


int main(){
    linkedlist ll;

    ll.add(3);
    ll.add(4);

    ll.display();

    ll.add(45);

    ll.display();
    ll.remove(45);
    
    ll.display();
    cout<<"size of linkelist:- "<<ll.size<<endl;

    ll.insert_at(2,34);
    ll.display();
    return 0;
}
