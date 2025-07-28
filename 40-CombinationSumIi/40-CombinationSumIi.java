// Last updated: 7/28/2025, 12:32:52 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        fcom(0,target,new ArrayList<>(),candidates,ans);
        return ans;
        
    }
    static  void fcom(int ind , int target ,List<Integer> ds ,int []arr , List<List<Integer>> ans)
    {   
        
           if(target==0)
           {
               ans.add(new ArrayList<>(ds));
               return ;
           }
        for(int i=ind ; i<arr.length;i++ )
        {
            if(i>ind&&arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            fcom(i+1,target-arr[i],ds,arr,ans);
            ds.remove(ds.size()-1);
        }
        
        
    } 
}