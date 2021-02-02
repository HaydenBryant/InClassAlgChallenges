int kthLargestElement(int[] nums, int k) {

        // TreeSet<Integer> tree = new TreeSet<Integer>();

        // for(int i = 0; i< nums.length; i++) {
        //     tree.add(nums[i]);
        // }

        // Object[] arr = tree.toArray();

        // int kthElm = Integer.parseInt(arr[arr.length - k].toString());

        // return kthElm;

        int kthElm = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int num : nums){
        if(!map.containsKey(num)){
        map.put(num, 1);
        } else {
        map.put(num, map.get(num) + 1);
        }
        }

        int count = 0;

        ArrayList<Integer> keys = new ArrayList<Integer>(map.size());
        keys.addAll(map.keySet());
        Collections.sort(keys);

        for(int i = keys.size() - 1; i >= 0; i--){
        count = count + map.get(keys.get(i));
        if(count >= k){
        kthElm = keys.get(i);
        break;
        }
        }

        return kthElm;

        }



