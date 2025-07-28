// Last updated: 7/28/2025, 12:29:45 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] image)
    {  
       
        for(int i=0;i<image.length;i++)
        {
            int low=0;
            int high=image[0].length-1;
            while(low<=high)
            {
                if(image[i][low]==image[i][high])
                {
                    image[i][low]=1-image[i][low];
                    image[i][high]=image[i][low];
                }
                low++;
                high--;
            }
        }
        return image;
        
     
        
    }
}