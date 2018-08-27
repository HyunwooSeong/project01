package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    private Hashtable<Integer, Integer> hashtable = new Hashtable<>();

    public static void main(String[] args) {
        RandomNumberStatistics sample = new RandomNumberStatistics();
        sample.getRandomNumberStatistics();
    }

    public void getRandomNumberStatistics() {
        Random random = new Random();
        int runCount = DATA_BOUNDARY * 100;
        for(int i=0; i<runCount; i++) {
            int tempNum  = random.nextInt(DATA_BOUNDARY) + 1;
            putCurrentNumber(tempNum);
        }

        printStatistics();
    }

    public void putCurrentNumber(int tempNumber) {

        if(!hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, 1);
        } else {
            hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
        }
    }

    public void printStatistics() {
        Set<Integer> tempSet = hashtable.keySet();
        for(int keySet : tempSet) {
            int count = hashtable.get(keySet);
            System.out.print(keySet + "=" + count + "\t");
            if (keySet % 10 - 1 == 0)
                System.out.println();
        }
    }
}
