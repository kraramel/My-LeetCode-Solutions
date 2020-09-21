public class ReverseInteger {

    // Not fully solved. there is still the boundaries of 32 digits to do (half
    // done)
    public int reverse(int x) {

        int reversedInt = 0;
        int pop;

        while (x != 0) {

            // pop the last digit of our integer
            pop = x % 10;
            x /= 10;

            // we push it in the reversed integer
            reversedInt = (reversedInt * 10) + pop;
        }

        return reversedInt;
    }
}