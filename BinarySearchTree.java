package EECS2011;
import java.util.*;

public class BinarySearchTree {
    class Node{
        int value;
        Node left, right;

        public Node(int value){
            this.value = value;
            left = right = null;
        }
    }

    public Node root;
    public Node current;
    public ArrayList<Node> nodes;

    public BinarySearchTree(){
        root = null;
        nodes = new ArrayList<>();
    }

    public void insert(int value){
        nodes.clear();
        root = insertRec(root, value);
    }

    Node insertRec(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insertRec(node.left, value);
        }

        if(value > node.value){
            node.right = insertRec(node.right, value);
        }
        return node;
    }

    public void inOrder(){
        inOrderRec(root);
    }

    public void inOrderRec(Node node){
        if(node != null){
            inOrderRec(node.left);
            nodes.add(node);
            inOrderRec(node.right);
        }
    }

    public boolean isEmpty(){
        if(root != null){
            return false;
        }
        return true;
    }

    public int iterMax(){
        if(isEmpty()){
            return 0;
        }
        Node max = root;
        while(max.right != null){
            max = max.right;
        }
        return max.value;
    }

    public int recMax(){
        if(isEmpty()){
            return 0;
        }
        return recMaxHelper(root);
    }

    public int recMaxHelper(Node node){
        if(node.right == null){
            return node.value;
        }
        return recMaxHelper(node.right);
    }

    public int getNext(){
        inOrder();
        Node temp;
        int index = 0;
        if(current == null){
            current = nodes.get(0);
        }
        else{
            for(int i = 0; i < nodes.size(); i++){
                if(current.value == nodes.get(i).value){
                    index = i;
                    break;
                }
            }
            index += 1;
            if(index == nodes.size()){
                current = nodes.get(0);
            }
            else{
                current = nodes.get(index);
            }
        }
        temp = current;
        nodes.clear();
        return temp.value;
    }

    public void reset(){
        current = null;
    }

    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(20);
        System.out.println(tree.getNext());
        System.out.println(tree.getNext());
        System.out.println(tree.getNext());
        System.out.println(tree.getNext());
        System.out.println(tree.root.value);
    }
}
