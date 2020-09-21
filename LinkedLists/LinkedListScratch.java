public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");

        LinkedList list = (new LinkedList(new Node(5))).addNode(4).addNode(1);

        System.out.println(LinkedList.transformArray(new int[]{1,2,3,4}).toString());

        System.out.println(LinkedList.transformArray(new int[]{1,2,3,4}).isSorted());


     }
}

// this class is mandatory to keep track of the head of linked list. We can assume that head is fixed and does not change position.
class LinkedList{

    // changes only by the contructor !!!
    private Node head;



    public LinkedList(Node node){
        this.head= node;
    }


    // add a node to the front of the linked list
    // time complexity O(1)
    public LinkedList addNode(int d){
        Node newNode= new Node(d);
        newNode.next = head;
        //System.out.println(head.data);

        return new LinkedList(newNode);
    }


    // stringfy a linked list
    // time complexity O(n)
    public String toString(){
        String st = "";

        Node nodeIterator= this.head;

        while(nodeIterator != null){
            st += nodeIterator.data +" -> ";
            nodeIterator= nodeIterator.next;
        }
        System.out.println("out");

        return st;
    }


    // get length of a linked list
    // time Complexity O(n)
    public int getLength(){
        int counter= 0;
        Node nodeIterator = this.head;

        while(nodeIterator != null){
            System.out.println(head.data);
            counter++ ;
            nodeIterator= nodeIterator.next;
        }

        return counter;


    }


    // check if the linked list is sorted
    // Time Complexity O(n)
    public boolean isSorted(){

        Node currentNode= head;

        while((currentNode.next != null) && (currentNode.data < currentNode.next.data)){
            currentNode= currentNode.next;
        }

        return currentNode.next == null;
    }


    // transform array to a linked list
    // time Complexity O(length_array)
    public static LinkedList transformArray(int[] array){

        int length = array.length;

        // we traverse the array starting from the tail.

        LinkedList linkedList = new LinkedList(new Node(array[length -1]));

        int i = length -2;

        while(i>=0){
            linkedList = linkedList.addNode(array[i]);
            i--;
        }

        return linkedList;

    }
}

// simple class of node DS
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
