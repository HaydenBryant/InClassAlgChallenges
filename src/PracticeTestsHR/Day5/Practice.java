package PracticeTestsHR.Day5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {

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

    public static void main(String[] args) {

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

//    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
//        Boolean aNull = false;
//        Boolean bNull = false;
//        SinglyLinkedListNode head;
//        SinglyLinkedListNode aCurr;
//        SinglyLinkedListNode bCurr;
//
//        if(head1.data < head2.data){
//            head = new SinglyLinkedListNode(head1.data);
//            aCurr = head1.next;
//            bCurr = head2;
//        } else {
//            head = new SinglyLinkedListNode(head2.data);
//            aCurr = head1;
//            bCurr = head2.next;
//        }
//
//        SinglyLinkedListNode hCurr = head;
//
//        while(true){
//            SinglyLinkedListNode temp;
//            if(aCurr == null && bCurr != null){
//                temp = new SinglyLinkedListNode(bCurr.data);
//                hCurr.next = temp;
//                hCurr = hCurr.next;
//                bCurr = bCurr.next;
//                continue;
//            }
//            if(bCurr == null && aCurr != null){
//                temp = new SinglyLinkedListNode(aCurr.data);
//                hCurr.next = temp;
//                hCurr = hCurr.next;
//                aCurr = aCurr.next;
//                continue;
//            }
//            if(aCurr.data <= bCurr.data){
//                temp = new SinglyLinkedListNode(aCurr.data);
//                hCurr.next = temp;
//                hCurr = hCurr.next;
//                aCurr = aCurr.next;
//                continue;
//            } else if (aCurr.data > bCurr.data){
//                temp = new SinglyLinkedListNode(bCurr.data);
//                hCurr.next = temp;
//                hCurr = hCurr.next;
//                bCurr = bCurr.next;
//                continue;
//            }
//            break;
//        }
//
//        // while(aCurr.next == null && bCurr.next == null){
//        //     SinglyLinkedListNode next;
//
//        //     if(aCurr.data < bCurr.data){
//        //         System.out.println(aCurr.data);
//        //         aCurr = aCurr.next;
//        //         continue;
//        //     } else {
//        //         System.out.println(bCurr.data);
//        //         bCurr = bCurr.next;
//        //     }
//        // }
//
//        return head;
//    }
}
