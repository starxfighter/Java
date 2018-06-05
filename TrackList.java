import java.util.*;

public class TrackList {
    public static void main(String[] args){
        HashMap<String, String> trackMap = new HashMap<String, String>();
        trackMap.put("Castaway", "Easy living down in paradise");
        trackMap.put("High Without Your Love", "Go get the bartender");
        trackMap.put("The Spectre", "Can you hear me as I scream your name");
        trackMap.put("Walk on Water", "Do you believe I can walk on water");

        String title = trackMap.get("Castaway");
        System.out.println("The lyrics are as follows: " + title);

        Set<String> keys = trackMap.keySet();
        for(String key : keys){
            System.out.println(key + " : " + trackMap.get(key));
        }
    }
}