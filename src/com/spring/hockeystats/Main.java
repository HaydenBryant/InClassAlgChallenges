//
// Binary trees are already defined with this interface:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }

ArrayList<Integer> list = new ArrayList<>();

        int[] traverseTree(Tree<Integer> t) {

        traveler(t);

        int[] arr = list.stream().mapToInt(i -> i).toArray();

        return arr;
        }

        void traveler(Tree<Integer> trav){
        list.add(trav.value);
        if(trav.left != null){
        traveler(trav.left);
        }
        if(trav.right != null){
        traveler(trav.right);
        }
        }
