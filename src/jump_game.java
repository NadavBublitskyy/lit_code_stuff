public class jump_game {




    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }




    public static boolean canJump(int[] nums) {

        int current_index=0;
        while (true) {


            if (current_index+nums[current_index]>= nums.length){
                return true;
            }

            else {
                int max_index=current_index;
                int counter_add_to_index=0;
                for (int j = current_index+1; j <= nums[current_index] ; j++) {
                    if (nums[j]+counter_add_to_index>nums[max_index]){
                        max_index=j;
                    }
                    counter_add_to_index++;




                }
                if (current_index==max_index)
                    return false;
                current_index=max_index;
            }


        }
//        return false;

    }






}
