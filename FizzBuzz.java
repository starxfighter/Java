public class FizzBuzz {
    public static void main(String [] args){
        FizzBuzzFunc fz = new FizzBuzzFunc();
        System.out.println("The result for 3 " + fz.determine(3));
        System.out.println("The result for 5 " + fz.determine(5));
        System.out.println("The result for 15 " + fz.determine(15));
        System.out.println("The result for 2 " + fz.determine(2));
    }
}