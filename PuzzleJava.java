import java.lang.*;
import java.util.*;
public class PuzzleJava {
    public static void main(String[] args){
        ArrayList<Integer> aArray = new ArrayList<Integer>();
        int[] ainput = {3,5,1,2,7,9,8,13,25,32}; 
        aArray = greaterThanTen(ainput);
        System.out.println("The values greater than 10 " + aArray);

        ArrayList<String> binput = new ArrayList<>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        ArrayList<Integer> bArray = new ArrayList<Integer>();
        bArray = greaterThanFive(binput);
        System.out.println("The values greater than 5 " + bArray);

        ArrayList<String> alphabet = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        alphabetSoup(alphabet);

        randomNums();

        String result = null;
        result = randomString(alphabet);
        System.out.println("The random word generated is " + result);

        String[] results = new String[10];
        results = randomStrings(alphabet);
        System.out.println("The random word array is " + (Arrays.toString(results)));

    }

    public static ArrayList greaterThanTen(int[] values){
        int sum = 0;
        ArrayList<Integer> myarray = new ArrayList<Integer>();
        for(int x = 0; x < values.length; x++){
            sum = sum + values[x];
            if(values[x] > 10){
                myarray.add(values[x]);
            }
        }
        System.out.println("The sum in test case 1 is " + sum);
        return myarray;
    }

    public static ArrayList greaterThanFive(ArrayList<String> values){
        ArrayList<String> rtnarray = new ArrayList<String>();
        String temp = null;
        Collections.shuffle(values);
        for(int x = 0; x < values.size(); x++){
            System.out.println("The name at " + x + " is " + values.get(x));
            temp = values.get(x);
            if(temp.length() > 5){
                rtnarray.add(temp);
            }
        }
        return rtnarray;
    }

    public static void alphabetSoup(ArrayList<String> values){
        Collections.shuffle(values);
        System.out.println("After shuffle " + values);
        System.out.println("This is the first entry" + values.get(0));
        if(values.get(0) == "A" || values.get(0) == "E" || values.get(0) == "I" || values.get(0) == "O" || values.get(0) == "U"){
            System.out.println("This is a vowel");
        } else {
            System.out.println("This is not a vowel");
        }
        System.out.println("This is the last entry" + values.get(25));
    }

    public static int[] randomNums(){
        int[] results = new int[10];
        Random r = new Random();
        for(int x = 0; x < 10; x++){
            results[x] = r.nextInt(45) + 55;
        }
        return results;
    }

    public static void sortedRandomNums(){
        ArrayList<Integer> myarray = new ArrayList<Integer>();
        Random r = new Random();
        for(int x = 0; x < 10; x++){
            myarray.add(r.nextInt(45) + 55);
        }
        Collections.sort(myarray);
        System.out.println("This is the sorted array" + myarray);
        System.out.println("This is the first item" + myarray.get(0));
        System.out.println("This is the last item" + myarray.get(9));
    }

    public static String randomString(ArrayList<String> values){
        String result = " ";
        Random r = new Random();
        for(int x = 0; x < 5; x++){
            result = result + values.get(r.nextInt(26));
        }
        return result.trim();
    }

    public static String[] randomStrings(ArrayList<String> values){
        String result =  " ";
        String[] results = new String[10];
        Random r = new Random();
        for(int x = 0; x < 10; x++){
            for(int z = 0; z < 5; z++){
                result = result + values.get(r.nextInt(26));
            }
            results[x] = result.trim();
            result = " ";
        }
        return results;
    }
// end of file    
}

