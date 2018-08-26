package d.collection.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RandomNumberMaker {

    Random radom = new Random();
    public static void main(String[] args) {

        RandomNumberMaker sample = new RandomNumberMaker();
        sample.makeRandomNumbers(10);
    }

    public HashSet<Integer> getSixNumber() {

        HashSet<Integer> randomNumber = new HashSet<>();

        while(true) {
            int tempNumber = radom.nextInt((44) + 1);
            randomNumber.add(tempNumber);
            if(randomNumber.size() == 6) break;
        }

        return randomNumber;
    }

    public void makeRandomNumbers(int count) {

        for(int i=0; i<count; i++) {
            HashSet<Integer> temp = getSixNumber();
            System.out.println(i+1 + " : " + temp);
        }
    }
}
