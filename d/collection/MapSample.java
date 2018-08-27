package d.collection;

import java.util.HashMap;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkHashMap();
    }

    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");

        System.out.println(map.get("A"));
    }
}
