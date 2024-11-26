import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));

    }

    public static List<String> summaryRanges(int[] nums) {
        // i need to go throw the array using 2 pointers and each range is created by j=j+1 and when its not j=i
        // and create a new range
        int j=0;
        int prev_j=0;
        List<String> list = new ArrayList<>();
        StringBuilder s= new StringBuilder("");


        for (int i = 0; i < nums.length; i++) {
            s.append(String.valueOf(nums[i]));
//            list.add(String.valueOf(nums[i]));
            prev_j=i;
            if (i< nums.length-1)
            j=i+1;
            else {
                list.add(s.toString());
                break;
            }
            while (nums[j]== nums[prev_j]+1 && j< nums.length-1){
                prev_j++;
                j++;
            }
            if (i!=prev_j){
//                list.add("->");
                s.append("->");
                i=prev_j;
//                list.add(String.valueOf(nums[i]));
                s.append(String.valueOf(nums[i]));


            }
            list.add(s.toString());
            s= new StringBuilder("");



        }

        return list;

    }



}
