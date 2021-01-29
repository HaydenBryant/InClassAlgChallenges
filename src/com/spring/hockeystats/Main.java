// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
boolean isListPalindrome(ListNode<Integer> l) {

        ListNode<Integer> previous = null;
        ListNode<Integer> current = l;
        ListNode<Integer> following = l;
        Boolean isPal = true;

        while (current != null) {
        following = following.next;
        current.next = previous;
        previous = current;
        current = following;
        }

        ListNode<Integer> t = l;
        ListNode<Integer> tr = previous;

        while(t != null && tr != null){
        if(t.value != tr.value){
        isPal = false;
        break;
        } else {
        t = t.next;
        tr = tr.next;
        }
        }



        return isPal;

        }
