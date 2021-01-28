int kthLargestElement(int[] nums, int k) {
        int elm = k - 1;
        int prev = nums[0];
        int kthElm = 0;

        for(int i = 1; i < nums.length; i++){
        if(nums[i] == prev){
        continue;
        } else {
        prev = nums[i];
        k--;
        }
        if(k == 0){
        kthElm = prev;
        break;
        }
        }
        return kthElm;
        }