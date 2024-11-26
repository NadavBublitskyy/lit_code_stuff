public class rotate_array {


    public static void main(String[] args) {
        int [] nums= {-1,-100,3,99};
        rotate(nums,2);

        for (int i = 0; i < nums.length; i++) {
           System.out.println(nums[i]);
        }

    }


    public static void rotate(int[] nums, int k) {

        int[] rotated = new int[nums.length];
        int start= nums.length-k;
        int index_rotate=0;
        int original_index=0;

        for (int i = start; i < nums.length; i++) {
            rotated[index_rotate]=nums[i];
            index_rotate++;


        }


        System.out.println("start");

        for (int j = 0; j < start; j++) {

            System.out.println(nums[j]);
            rotated[index_rotate]=nums[j];
            index_rotate++;


        }

        System.out.println("end");

        for (int i = 0; i < nums.length; i++) {
            nums[i]=rotated[i];
        }

//        nums=rotated;

    }



}
