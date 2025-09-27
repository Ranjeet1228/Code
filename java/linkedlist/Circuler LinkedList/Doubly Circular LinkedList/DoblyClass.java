
class DoblyClass<t> {
    static class node<t>{
        t data;
        node <t> next;
        node <t> prev;
        node (t data){
            this.data = data;
        }
    }
    
    node <t> head;
    node <t> tail;
    int size=0;

    //add element
    void add(t data){
        node <t> tem=new node<t>(data);
        if(head==null){ // first node case
            head=tem;
            tail=tem;
            tail.next=head;
            head.prev=tail;
        } else{
            tail.next = tem;
            tem.prev=tail;
            tail=tem;
            tail.next =head;
            head.prev =tail;
        }
        size++;
    }

 //inset element at index idx
    void insert(t data, int idx) {
    node<t> newNode = new node<>(data);

    // Case 1: Empty list
    if (head == null) {
        head = newNode;
        tail = newNode;
        head.next = head;
        head.prev = head;
        size++;
        return;
    }
    // Case 2: Insert at head
    if (idx == 0) {
        newNode.next = head;
        newNode.prev = tail;
        tail.next = newNode;
        head.prev = newNode;
        head = newNode;
        size++;
        return;
    }
    // Case 3: Insert at any index (circular wrap using mod)
    int id = idx % size;
    node<t> temp = head;
    for (int i = 0; i < id - 1; i++) {
        temp = temp.next;
    }

    newNode.next = temp.next;
    newNode.prev = temp;
    temp.next.prev = newNode;
    temp.next = newNode;
    if (temp == tail) tail = newNode; // Update tail if inserted at the end
    size++;
}


    // delete node
    void delete(int idx) {
        if (size == 0) return;

        int index = idx % size;
        node<t> temp = head;

        // Deleting the head node
        if (index == 0) {
            if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
                head.prev = tail;
            }
            size--;
            return;
        }

        // Traverse to the (index-1)th node
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        // Update tail if we're deleting the last node
        if (temp.next == tail) {
            tail = temp;
        }

        // Relink the surrounding nodes
        temp.next = temp.next.next;
        temp.next.prev = temp;

        size--;
    }



    //Display
    void display(){
        if(size==0) return;
        
        node<t> tem= head;
        
        do { 
            System.out.print(tem.data+" ");
            tem = tem.next;
        } while (tem!=head);

        System.out.println();
    }
}