import java.util.Arrays;

public class majorityElement {


    public int c(int[] nums) {
        int n= nums.length;
        int counter=0;
        Arrays.sort(nums);

        for (int i = 0; i < n-1; i++) {
            if(nums[i]==nums[i+1])
                counter++;
            else
                counter=0;

            if (counter>n/2)
                return nums[i];


        }
        return 0;


    }
}
