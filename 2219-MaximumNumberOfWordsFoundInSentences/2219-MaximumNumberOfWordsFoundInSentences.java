// Last updated: 7/28/2025, 12:28:33 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        int max=0,x;
        
       /* for(String i : sentences)
        {
         count=0;
           for (int j=0;j<i.length();j++)
           {
             if(i.charAt(j)==' ') count++;
           }
             max=Math.max(max,count); 
        }
        
        return max+1;*/
        for(String str : sentences)
        {
            String a[] = str.split(" ");
            max = Math.max(a.length , max);
        }
        return max;
    }
}