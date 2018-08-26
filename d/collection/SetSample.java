package d.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();

        String[] cars = new String[] {
                "Tico", "Sonata", "BMW", "Benz",
                "Lexus", "Zeep", "Grandeure",
                "Morning", "Mini Cooper", "i30",
                "BMW", "Lexus", "Carnibal", "SM5",
                "SM7", "SM3", "Tico"
        };

        System.out.println(sample.getCarKinds(cars));
    }

    public int getCarKinds(String[] cars) {
        if(cars == null) return 0;
        if(cars.length == 1) return 1;

        HashSet<String> carSet = new HashSet<>();
        for(String car : cars) {
            carSet.add(car);
        }

        printCarSetFor(carSet);
        printCarSetIterator(carSet);
        return carSet.size();
    }

    public void printCarSetFor(HashSet<String> carSet) {
        for(String temp : carSet) {
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    public void printCarSetIterator(HashSet<String> carSet) {
        Iterator<String> iterator = carSet.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
