public class Linked_List {

    static class node {
        int data;
        node next;

        node(int value) {
            data = value;
            next = null;
        }
    }

    static node head;

    static void insertatbegin(int data) {
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
    }

    static void insertatend(int data) {

        node newnode = new node(data);

        if(head == null) {
            head = newnode;
            return;
        }

        node p = head;

        while(p.next != null) {
            p = p.next;
        }

        p.next = newnode;
    }

    static void printList() {

        node p = head;

        System.out.print("[");

        while(p != null) {
            System.out.print(" " + p.data + " ");
            p = p.next;
        }

        System.out.print("]");
    }

    static void deletenode(int key) {
        node temp = head;
        node prev = null;
        if (temp != null && temp.data == key)
        {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data !=key){
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
    
    }
}