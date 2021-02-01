int kthLargestElement(int[] nums, int k) {

        TreeSet<Integer> tree = new TreeSet<Integer>();

        for(int i = 0; i< nums.length; i++) {
        tree.add(nums[i]);
        }

        Object[] arr = tree.toArray();

        int kthElm = Integer.parseInt(arr[arr.length - k].toString());

        return kthElm;

        }
