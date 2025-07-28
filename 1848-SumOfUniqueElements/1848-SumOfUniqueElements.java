// Last updated: 7/28/2025, 12:28:46 PM
class Solution {
    public int sumOfUnique(int[] nums) {
      ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        for(int i=0;i<a.size();i++){
            if(Collections.frequency(a,a.get(i)) == 1) b.add(a.get(i));
        }
        int sum = 0;
        for(int i=0;i<b.size();i++){
            sum += b.get(i);
        }
        return sum;
    }
}