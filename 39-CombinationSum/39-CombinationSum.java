// Last updated: 7/28/2025, 12:32:53 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(candidates,0,target,new ArrayList<>(),ans);
         return ans;

    }
   static void findCombination(int [] arr,int ind,int target, List<Integer> ds ,List<List<Integer>> ans)
    {
        if(ind==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));    
            }
             return  ;
        }
        if(arr[ind]<=target){
        ds.add(arr[ind]);
        findCombination(arr,ind,target-arr[ind],ds,ans);
        ds.remove(ds.size()-1);
        }
          findCombination(arr,ind+1,target,ds,ans);

    }
}