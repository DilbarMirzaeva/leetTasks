class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;

       for(int i=0;i<height.length;i++){
          int a=height[left];
          int b=height[right];

          int distance=right-left;;
          int area=distance*Math.min(b,a);

          if(maxArea<area){
            maxArea=area;
          }

          if(a<=b){
            left++;
          }else{
            right--;
          }
       }
       
       return maxArea;
    }
}