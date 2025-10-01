public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("Linkedlist is Empty....!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = head.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.printLinkedList();
        ll.addFirst(1);
        ll.printLinkedList();
        ll.addFirst(2);
        ll.printLinkedList();
        ll.addFirst(3);
        ll.printLinkedList();
        ll.addLast(4);
        ll.printLinkedList();
        ll.addLast(5);
        ll.printLinkedList();
        ll.addIndex(2, 9);
        ll.printLinkedList();
    }
}