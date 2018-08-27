package d.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
//        sample.checkHashMap();
//        sample.checkHashMapEntry();
//        sample.checkTreeMap();
//        sample.checkProperties();
        sample.saveAndLoadProperties();
    }

    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");

//        System.out.println(map.get("A"));
//        System.out.println(map.get("B"));

        map.put("C", "c");
        map.put("D", "d");

//        Set<String> ketSet = map.keySet();
//        for(String tempKey : ketSet) {
//            System.out.println(tempKey + "=" + map.get(tempKey));
//        }

        Collection<String> values = map.values();
        for(String tempValue : values) {
            System.out.println(tempValue);
        }
    }

    public void checkHashMapEntry() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        map.remove("A");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for(Map.Entry<String, String> tempEntry : entries) {
            System.out.println(tempEntry.getKey() + "=" + tempEntry.getValue());
        }

//        System.out.println(map.containsKey("A"));
//        System.out.println(map.containsKey("Z"));
//
//        System.out.println(map.containsValue("a"));
//        System.out.println(map.containsValue("z"));
    }

    public void checkTreeMap() {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        map.put("가", "e");
        map.put("1", "f");
        map.put("a", "g");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> tempEntry : entries) {
            System.out.println(tempEntry.getKey() + "=" + tempEntry.getValue());
        }
    }

    public void checkProperties() {
        Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();
        for(Object tempObject : keySet) {
            System.out.println(tempObject + "= " + prop.get(tempObject));
        }
    }

    public void saveAndLoadProperties() {
        try {
//            String fileName = "test.properties";
            String fileName = "test.xml";
            File propertiesFile = new File(fileName);
            FileOutputStream fos = new FileOutputStream(propertiesFile);

            Properties prop = new Properties();
            prop.setProperty("Writer", "Hyunwoo, Seong");
            prop.setProperty("WriterHome", "http://www.naver.com");
//            prop.store(fos, "Basic Properties file.");
            prop.storeToXML(fos, "Basic XML Property file.");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoaded = new Properties();
//            propLoaded.load(fis);
            propLoaded.loadFromXML(fis);
            fis.close();

            System.out.println(propLoaded);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
