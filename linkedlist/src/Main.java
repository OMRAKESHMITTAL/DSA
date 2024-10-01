class Ll {
    Node head;
    Node tail;
    int size;
    Ll(){
        this.size = 0;
    }
    public void insertfirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size+=1;
    }

    public void inserttail(int value){
        if(tail==null){
            insertfirst(value);
        }else{
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        }
        size++;
    }

    public void insert(int value,int index){
        Node node = new Node(value);
        Node temp = head;
        for(int i=1;i<index-1;i++){
            if(temp.next == null){
                return;
            }
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

    }

    public void deletefirst(){
        head = head.next;
        size--;
    }
    public void deletetail(){
        Node temp = head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }
    public void delete(int index){
        Node temp = head;
        int i = 1;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        Node temp2 = temp.next;
        temp.next = temp2.next;

        size--;
    }


    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println();

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
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insert(10,2);
        list.inserttail(18);
        list.display();
        list.deletefirst();
        list.deletetail();
        list.display();
        list.delete(2);
        list.display();
    }
}