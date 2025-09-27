
public class singlycirLinkelist {
    static class node{
        int data;
        node  next;
        node(int data){
            this.data =data;
        }
    }
    node head;
    node tail;
    int size=0;

    // to add new element in linkedlist
    void add(int data){
        node temp = new node(data);
        if(head==null){ // if no node is present 
            head = temp;
            tail = temp;
            tail.next = head;
            size++;
        } else{ // otherwise connnect tail to node and node to head
            tail.next = temp;
            tail=temp;
            tail.next = head;
            size++;
        }
    }

    //display
    void display(){
        if(size==0) return;
        node temp= head;

        do { 
            System.out.print(temp.data+" ");
            temp= temp.next;
        } while (temp!=head);

        System.out.println();
    
    }

    // insert at index idx
    void insert(int data, int idx){
        
        node newNode= new node(data);
        int ind= idx%size;
        if(ind==0){
            if(head==null){
                head=newNode;
                tail = newNode;
                tail.next=head;
                
            } else{
                newNode.next =head;
                head =newNode;
                tail.next = head;
            }
            size++;
            return;
        }
        node tem=head;
    
        // traverse throgh loop
        for(int i=0;i<ind-1;i++){
            tem=tem.next;
        }

        newNode.next= tem.next;
        tem.next=newNode;
        size++;
    }

    //delete from index id
    void delete(int idx){
        if(size==0) return;
        if(head==null||head.next==head){
            head=null;
            tail=null;
            size--;
            return;
        }
        node tem = head;

        int id = idx%size;

        if(id==0){
            head=head.next;
            tail.next=head;
            size--;
            return;
        }

        for(int i=0;i<id-1;i++){
            tem=tem.next;
        }
        tem.next=tem.next.next;
        size--;

    } 
}