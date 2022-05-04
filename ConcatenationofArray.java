class ConcatenationofArray{
    public static void main(String[] args) {
        
        int[] answer = getConcatenation(new int[]{1,2,3});
        if(answer[0]==answer[3] && answer[2]==answer[5]){
        System.out.println("Test passed");
        }else{
            System.out.println("Test Failed" + answer);
        }
    }

    public static int[]  getConcatenation(int[] nums) {
        
        int[] ans =new int[2*nums.length];
        
        for(int i=0;i<nums.length;i++){
            
           ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
          
            
        }
        return ans;
    }
}