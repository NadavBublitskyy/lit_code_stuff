//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int [] nums = new int[10];
       nums= new int[]{1,1,1,2,2,3};
       System.out.println(removeDuplicates(nums));


        }


        public static int removeDuplicates(int[] nums) {
            int index=0;
            int current_element=nums[0];
            int counter_of_current_element=1;

            System.out.println("start testing in loop");
            for (int i = 1; i < nums.length; i++) {
               if (current_element==nums[i] && i<nums.length-1){
                   counter_of_current_element++;
               } else {
                   if (i==nums.length-1){
                       counter_of_current_element++;
                   }
                    if (counter_of_current_element==1){
                        nums[index]=current_element;

                   }

                   if (counter_of_current_element>1){
                       nums[index]=current_element;
                        index++;
                       nums[index]=current_element;

                   }

                   index++;
                   current_element=nums[i];
                   counter_of_current_element=1;







               }


            }


            for (int i = index+1; i < nums.length; i++) {
                nums[i]=0;

            }

            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);

            }
            System.out.println("done printing");


            return index;

        }
    }

