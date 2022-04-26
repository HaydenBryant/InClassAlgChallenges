package PracticeTestsHR.Day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Practice {

    //merge two sorted lists
    //return to this and make a recursion or iterative method with just linked lists

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException, IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode aCurr = head1;
        SinglyLinkedListNode bCurr = head2;
        List<Integer> list = new ArrayList<>();

        while(aCurr != null){
            list.add(aCurr.data);
            aCurr = aCurr.next;
        }

        while(bCurr != null){
            list.add(bCurr.data);
            bCurr = bCurr.next;
        }
        Collections.sort(list);
        SinglyLinkedListNode head = new SinglyLinkedListNode(list.get(0));
        SinglyLinkedListNode hCurr = head;

        for(int i = 1; i < list.size(); i++){
            SinglyLinkedListNode temp = new SinglyLinkedListNode(list.get(i));
            hCurr.next = temp;
            hCurr = hCurr.next;
        }

        return head;
    }

    //Queue using two stacks
    private static Stack<Integer> s1 = new Stack<>();
    private static Stack<Integer> s2 = new Stack<>();

    private static void enqueue(int num){
        s1.push(num);
    }

    private static int dequeue(){
        if(s2.size() == 0) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    private static int peek(){
        if(s2.size() == 0) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public static void mains(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

        try{
            int q = Integer.parseInt(bReader.readLine());
            for(int i = 0; i < q; i++){
                String query = bReader.readLine();
                if(query.startsWith("1")){
                    int num = Integer.parseInt(query.split(" ")[1]);
                    enqueue(num);
                } else if (query.startsWith("2")){
                    dequeue();
                } else if (query.startsWith("3")){
                    System.out.println(peek());
                }

            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }


}
