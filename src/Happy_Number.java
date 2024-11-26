public class Happy_Number {

    public static void main(String[] args) {
       System.out.println(isHappy(19));
    }


    // kind of loop that goes throw all the digits of the number and summing the squre of them
    public static boolean isHappy(int n) {
        if(n==1)
            return true;
        if (n<=9 && n%2==0)
            return false;

        return isHappy(sum_of_digits_squred(n));

    }

    public static int sum_of_digits_squred(int n){
        int sum=0;
        while (n!=0){
            int digit=n%10;
            sum= (int) (sum+ Math.pow(digit,2));
            n=n/10;
        }
        return sum;
    }

}
