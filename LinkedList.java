package Projects;

public class LinkedList {
     static class SinglyLinkedList{
         class Node{
            private int value;
            private Node next;

            public Node(int value){
                this.value = value;
            }
        }

        private Node head;
        private Node tail;

        public void insertFront(int value){
            Node newest = new Node(value);
            if(head == null){
                head = tail = newest;
            }

            else{
                newest.next = head;
                head = newest;
            }
        }

        public void insertEnd(int value){
            Node newest = new Node(value);
            if(head == null){
                head = tail = newest;
            }

            else{
                tail.next = newest;
                tail = newest;
            }
        }

        public void printList(){
            Node current = head;
            while(current != null){
                System.out.println(current.value);
                current = current.next;
            }
        }
    }

    public static void main(String[] args){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFront(1);
        singlyLinkedList.insertEnd(2);
        singlyLinkedList.insertEnd(3);
        singlyLinkedList.printList();
    }
}
