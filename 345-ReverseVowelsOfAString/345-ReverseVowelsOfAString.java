// Last updated: 7/28/2025, 12:30:26 PM
class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] res = s.toCharArray();
        int low=0,high=s.length()-1;
        while(low<=high)
        {
            if(!set.contains(res[low])) low++;
            else if(!set.contains(res[high])) high--;
            else
             {
                 char temp = res[low];
                 res[low] = res[high];
                 res[high] = temp;
                 low++;
                 high--;
             }
        }
        return new String(res);
        
    }
}