import java.lang.*;
public class StringManipulator {
    public String trimAndConcat(String a, String b){
        String tempA = a.trim();
        String tempB = b.trim();
        return tempA.concat(tempB);
    }

    public int getIndexOrNull(String search, char val){
        int result = search.indexOf(val);
        return result;
    }

    public int getIndexOrNull(String search, String variable){
        int result = search.indexOf(variable);
        return result;
    }

    public String concatSubstring(String a, int b, int c, String d){
        String temp = a.substring(b, c);
        return temp + d;
    }
}