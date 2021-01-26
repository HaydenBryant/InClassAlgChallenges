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
        Stack<Integer> stack = new Stack<>();
        ListNode<Integer> t = l;

        while(t != null){
        stack.push(t.value);
        t = t.next;
        }

        t = l;

        while(t != null){
        int num = stack.pop();
        if(num != t.value){
        return false;
        } else {
        t = t.next;
        }
        }

        return true;

        }
