package hackerrank.tests.DevsTest1;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTreeSearch {

    public static void main(String[] args) {
        ArrayList<Integer> treeList = new ArrayList<>(Arrays.asList(20, 10, 30, 8, 12, 25, 40, 6, 11, 13, 23));

        BinaryTree bt = createBinaryTree(treeList);
        Node root = bt.root;

        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(20, 12, 40, 13, 33, 100, 5000));

        for(int num : testList){
            System.out.println(doesValueExist(num, root));
        }

        System.out.println("----------------------");

        for(int num : testList){
            System.out.println(doesValueExistRecursive(num, root));
        }
    }

    public static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    public static class BinaryTree{

        Node root;

        public Node addRecursive (Node current,int value){
            if (current == null) {
                return new Node(value);
            }

            if (value < current.value) {
                current.left = addRecursive(current.left, value);
            } else if (value > current.value) {
                current.right = addRecursive(current.right, value);
            } else {
                // value already exists
                return current;
            }

            return current;
        }

        public void add ( int value){
            root = addRecursive(root, value);
        }
    }

    public static BinaryTree createBinaryTree(ArrayList<Integer> list) {
        BinaryTree bt = new BinaryTree();

        for(int num : list){
            bt.add(num);
        }

        return bt;
    }

    public static int doesValueExist(int val, Node root){
        Node trav = root;

        while(trav != null){
            if(trav.value == val){
                return 1;
            }
            if(val > trav.value){
                trav = trav.right;
                continue;
            } else {
                trav = trav.left;
                continue;
            }
        }

        return 0;
    }

    public static int doesValueExistRecursive(int val, Node curr){
        if(curr == null){
            return 0;
        }
        if(val == curr.value){
            return 1;
        }

        if(val > curr.value){
            return doesValueExistRecursive(val, curr.right);
        } else {
            return doesValueExistRecursive(val, curr.left);
        }
    }


}
