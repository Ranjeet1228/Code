
public class basic {
    static class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data = data;
        }
    }

    // if head is given
    static void display1(node head){
        node tem = head;
        while(tem!=null){
            System.out.print(tem.data+" ");
            tem = tem.next;
        }
        System.out.println();
    }


    // if tail is given
    static void display2(node tail){
        node tem = tail;
        while(tem!=null){
            System.out.print(tem.data+" ");
            tem = tem.prev;
        }
        System.out.println();
    }

    // if random node is given
    static void display3(node rand){
        node tem = rand;
        while(tem.prev !=null){
            tem= tem.prev;
        }
        display1(tem);
    }

    public static void main(String[] args){
        // 12<-->14<-->34<-->16<-->58
        node a= new node(12);
        node b = new node(14);
        node c = new node(34);
        node d = new node(16);
        node e = new node (58);
        a.next = b;

        b.next =c;
        b.prev = a;

        c.next = d;
        c.prev = b;

        d.prev = c;
        d.next =e;
        
        e.prev = d;

        display1(a); // if head is given
        display2(e); // if tail is given
        display3(c); // if random element is given

        //  insert an element
        node f = new node(78);

        a.next.prev = f; //connect f with a in prev
        f.next = a.next; // connect f with b in next
        a.next = f; // connect a with f in next
        f.prev = a; // connect f with a in reverse
        display1(a);

    }
}