package d.collection;

import java.util.ArrayList;
import java.util.Stack;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
//        sample.checkArrayList();
//        sample.checkArrayList2();
//        sample.checkArrayList3();
//        sample.checkArrayList4();
        sample.checkStack();
    }

    public void checkArrayList() {
        ArrayList list1 = new ArrayList();
        list1.add(new Object());
        list1.add("ArrayListSample");
        list1.add(new Double(1));
    }

    public void checkArrayList2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

//        for(String temp : list) {
//            System.out.println(temp);
//        }
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0 ");
        list2.addAll(list);

        for(String temp : list2) {
            System.out.println("List2 " + temp);
        }
    }

    public void checkArrayList3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

//        int listSize = list.size();
//        for(int i=0; i<listSize; i++) {
//            System.out.println("list.get(" + i + ")=" + list.get(i));
//        }

        String[] tempArray = new String[5];
//        String [] strList = list.toArray(tempArray);
        String[] strList = list.toArray(new String[0]);
        for(String temp : strList) {
            System.out.println(temp);
        }
    }

    public void checkArrayList4() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("A");

//        System.out.println("Removed " + list.remove(0));

//        System.out.println(list.remove("A"));
        ArrayList<String> temp = new ArrayList<>();
        temp.add("A");
        list.removeAll(temp);

        for(int i=0; i<list.size(); i++) {
            System.out.println("list.get(" + i + ")=" + list.get(i));
        }
    }

    public void checkStack() {
        Stack<Integer> intStack = new Stack<>();
        for(int i=0; i<5; i++) {
            intStack.push(i);
            System.out.println(intStack.peek());
        }

        while(!intStack.empty()) {
            System.out.println(intStack.pop());
        }
    }
}
