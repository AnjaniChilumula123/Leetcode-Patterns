// Last updated: 7/28/2025, 12:32:42 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> ds = new ArrayList<>();
         boolean [] map = new boolean[nums.length];
         help(nums,map,ds,ans);
         return ans;

    }
    void help( int[] nums ,boolean[] map, List<Integer> ds , List<List<Integer>> ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0;i<nums.length;i++)
        {
            if(!map[i])
            {
                map[i]=true;
                ds.add(nums[i]);
                help(nums,map,ds,ans);
                map[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
}