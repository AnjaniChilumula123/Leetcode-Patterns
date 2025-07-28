// Last updated: 7/28/2025, 12:30:56 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        // int nums1 =-1 ,nums2=-1;
        // int count1 = 0 ,count2=0;
        // int ele1=Integer.MIN_VALUE;
        // int ele2=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if( count1==0 && ele1!=nums[i]){
        //         ele1=nums[i];
        //         count1=1;
        //     }
        //     else if(count2==0 && ele2!=nums[i] ){
        //         ele2=nums[i];
        //         count2=1;
        //     }
        //     else if(ele1==nums[i]) count1++;
        //     else if(ele2==nums[i]) count2++;
        //     else {
        //         count1--;
        //         count2--;
        //     }
        // }
        // count1=0;
        // count2=0;
        // for(int i=0;i<nums.length;i++){
        //     if(ele1==nums[i]) count1++;
        //     if(ele2==nums[i]) count2++;
        // }
        // int mini=(int)(nums.length/3)+1;
        // if(ele1==ele2 && count1>=mini){ 
        //     ans.add(ele1);
        //     return ans;
        //     }
        // if(count1>=mini) ans.add(ele1);
        // if(count2>=mini) ans.add(ele2);
        int mini=(int)(nums.length/3)+1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);

            if(map.get(nums[i])==mini) ans.add(nums[i]);
            
        }
        

        return ans;

    }
}