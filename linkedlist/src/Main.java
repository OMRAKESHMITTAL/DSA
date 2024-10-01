class Ll {
    Node head;
    Node tail;
    int size;
    Ll(){
        this.size = 0;
    }
    public void insert(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size+=1;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
public class Main {
    public static void main(String[] args) {
        Ll list = new Ll();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();

    }
}