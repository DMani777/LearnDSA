public class RunningSumof1dArray {

public static void main(String[] args) {
   
    int[] nums = runningSum(new int[]{1,2,3,4});
    if (nums[3]==10) {
        System.out.println("Test pass");
    } else {
        System.out.println("Test fail");
    }
}

    public static int[] runningSum(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            nums[i+1]=nums[i+1]+nums[i];
        }
          return nums;
  }
}
