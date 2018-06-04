import java.lang.*;
import java.util.*;
public class BasicJava {
    public static void main(String[] args){
        printNumbers();
        printOddNumbers();
        printSum();
        itterate();
        int[] input = {-3,-5,-7}; 
        int result = findMax(input);
        System.out.println("The result is " + result);
        int[] xinput = {7,10,15,2,22}; 
        result = findMax(xinput);
        System.out.println("The result is " + result);
        int[] yinput = {7,0,-1,10,-3,12,234}; 
        result = findMax(yinput);
        System.out.println("The result is " + result);
        int[] ainput = {2,10,3};
        printAvg(ainput);
        ArrayList<Integer> myarray = new ArrayList<Integer>();
        myarray = arrayOddNum();
        System.out.println("The new array is " + myarray);
        int aresult = 0;
        int[] binput = {1,3,5,7};
        aresult = greaterThanY(binput, 3);
        System.out.println("There are " + aresult + "items greater than 3");
        ArrayList<Integer> aArray = new ArrayList<Integer>();
        int[] cinput = {1,5,10,-2}; 
        aArray = squareTheValues(cinput);
        System.out.println("The squared array is " + aArray);
        ArrayList<Integer> bArray = new ArrayList<Integer>();
        int[] dinput = {1,5,10,-2};
        bArray = removeNeg(dinput);
        System.out.println("The array without negs " + bArray);
        int[] cArray = new int[3];
        int[] einput = {1,5,10,-2};
        cArray = maxMinAvg(einput);
        System.out.println("The max is " + cArray[0] + " The min is " + cArray[1] + " The average is " + cArray[2]);
        ArrayList<Integer> dArray = new ArrayList<Integer>();
        int[] finput = {1,5,10,7,-2};
        dArray = shiftLeft(finput);
        System.out.println("The shifted array is " + dArray);
    }

    public static void printNumbers(){
        for(int x = 1; x < 256; x++ ) {
            System.out.println(x);
        }
    }

    public static void printOddNumbers(){
        for(int x = 1; x < 256; x = x + 2){
            System.out.println(x);
        }
    }

    public static void printSum(){
        int sum = 0;
        for(int x = 0; x < 256; x++){
            sum = sum + x;
            System.out.println("New Number: " + x + " Sum: " + sum);
        }
    }

    public static void itterate(){
        int[] values = {1,3,5,7,9,13};
        for(int x = 0; x < values.length; x++){
            System.out.println("The value is " + values[x]);
        }
    }

    public static int findMax(int[] values){
        int[] array = values;
        int max = 0;
        for(int x =0; x < array.length; x++){
            if(array[x] > max){
                max = array[x];
            }
        }
        return max;
    }

    public static void printAvg(int[] values){
        int sum = 0;
        int avg = 0;
        for(int x = 0; x < values.length; x++){
            sum = sum + values[x];
        }
        avg = sum / values.length;
        System.out.println("The average is " + avg);
    }

    public static ArrayList arrayOddNum(){
        ArrayList<Integer> myarray = new ArrayList<Integer>();
        for(int x = 1; x < 256; x = x + 2){
            myarray.add(x);
        } 
        return myarray;
    }

    public static int greaterThanY(int[] values, int check){
        int count = 0;
        for(int x = 0; x < values.length; x++){
            if(values[x] > check){
                count = count + 1;
            }
        }
        return count;
    }

    public static ArrayList squareTheValues(int[] values){
        ArrayList<Integer> myarray = new ArrayList<Integer>();
        for(int x = 0; x < values.length; x++){
            myarray.add(values[x] * values[x]);
        }
        return myarray;
    }

    public static ArrayList removeNeg(int[] values){
        ArrayList<Integer> myarray = new ArrayList<Integer>();
        for(int x = 0; x< values.length; x++){
            if(values[x] > 0){
                myarray.add(values[x]);
            } else {
                myarray.add(0);
            }
        }
        return myarray;
    }

    public static int[] maxMinAvg(int[] values){
       int[] results = new int[3];
       int min = values[0];
       int max = values[0];
       int sum = values[0];
       for(int x = 1; x < values.length; x++){
           if(values[x] <  min){
               min = values[x];
           }
           if(values[x] > max){
               max = values[x];
           }
           sum = sum + values[x];
       }
       int avg = sum / values.length;
       results[0] = max;
       results[1] = min;
       results[2] = avg;
       return results;
    }

    public static ArrayList shiftLeft(int[] values){
        ArrayList<Integer> myarray = new ArrayList<Integer>();
        for(int x = 1; x < values.length; x++){
            myarray.add(values[x]);
        }
        myarray.add(0);
        return myarray;
    }
}