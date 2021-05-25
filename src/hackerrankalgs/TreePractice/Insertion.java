//package hackerrankalgs.TreePractice;
//
//import java.util.Scanner;
//
//public class Insertion {
//    import java.util.*;
//import java.io.*;
//
//    class Node {
//        Node left;
//        Node right;
//        int data;
//
//        Node(int data) {
//            this.data = data;
//            left = null;
//            right = null;
//        }
//    }
//
//    class Solution {
//
//        public static void preOrder( Node root ) {
//
//            if( root == null)
//                return;
//
//            System.out.print(root.data + " ");
//            preOrder(root.left);
//            preOrder(root.right);
//
//        }
//
// /* Node is defined as :
// class Node
//    int data;
//    Node left;
//    Node right;
//
//    */
//
//        public static Node insert(Node root, int data) {
//            Node node = new Node(data);
//
//            if(root==null){
//                return node;
//            }
//
//            Node tmp = root;
//
//            while(tmp!=null){
//                if(tmp.data > data){
//                    if(tmp.left !=null)
//                        tmp = tmp.left;
//                    else{
//                        tmp.left = node;
//                        break;
//                    }
//                }
//                else if(tmp.right !=null)
//                    tmp = tmp.right;
//                else{
//                    tmp.right = node;
//                    break;
//                }
//            }
//            return root;
//        }
//
//        public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            int t = scan.nextInt();
//            Node root = null;
//            while(t-- > 0) {
//                int data = scan.nextInt();
//                root = insert(root, data);
//            }
//            scan.close();
//            preOrder(root);
//        }
//    }
//}
