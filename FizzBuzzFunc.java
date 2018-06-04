public class FizzBuzzFunc {
    public String determine(int val) {
        String result = " ";
        if ((val % 3) == 0 && (val % 5 == 0) ) {
            result = "FizzBuzz";
            return result;
        }
        if((val % 3) == 0){
            result = "Fizz";
        } else if((val % 5) == 0) {
            result = "Buzz";
        } else {
            result = Integer.toString(val);
        }

        return result;
    }
}