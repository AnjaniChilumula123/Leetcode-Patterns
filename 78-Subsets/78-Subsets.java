// Last updated: 7/28/2025, 12:32:24 PM
class Solution {
     
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ds = new ArrayList<List<Integer>>();
         List<Integer> ans= new ArrayList<>();
         func(0,nums,ans,ds);
         return ds;
    }
    void func(int ind , int [] nums,List<Integer> ans,List<List<Integer>> ds){
        if(ind == nums.length)
        {
            ds.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[ind]);
        func(ind+1,nums,ans,ds);
        ans.remove(ans.size()-1);
        func(ind+1,nums,ans,ds);
    }
}