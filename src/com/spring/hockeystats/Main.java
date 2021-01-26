boolean containsCloseNums(int[] nums, int k) {
        Hashtable<Integer, Integer> table = new Hashtable<>();


        for(int i = 0; i < nums.length; i++){
        if(!table.containsKey(nums[i])){
        table.put(nums[i], i);
        } else {
        if(Math.abs(table.get(nums[i]) - i) <= k){
        return true;
        } else {
        table.put(nums[i], i);
        }
        }
        }


        return false;
        }
