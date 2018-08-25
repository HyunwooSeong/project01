package d.generic;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
//        sample.callWildcardMethod();
//        sample.callBoundedWildcardMethod();
        sample.callGenericMethod();
    }

    public void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardMethod(wildcard);

        WildcardGeneric<Integer> wildcard2 = new WildcardGeneric<Integer>();
        wildcard2.setWildcard(2);
        wildcardMethod(wildcard2);
    }

//    public void wildcardMethod(WildcardGeneric<String> c) {
//        String value = c.getWildcard();
//        System.out.println(value);
//    }

    public void wildcardMethod(WildcardGeneric<?> c) {
        Object value = c.getWildcard();
        if(value instanceof String) {
            System.out.println("String value :: " + value);
        } else if(value instanceof Integer) {
            System.out.println("Integer value :: " + value);
        }
    }

    public void callBoundedWildcardMethod() {
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        wildcard.setWildcard(new Car("BMW"));
        boundedWildcardMethod(wildcard);

        WildcardGeneric<Bus> wildcard2 = new WildcardGeneric<Bus>();
        wildcard2.setWildcard(new Bus("Bongo"));
        boundedWildcardMethod(wildcard2);
    }

    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Car value = c.getWildcard();
        System.out.println(value);
    }

    public <T> void genericMethod(WildcardGeneric<T> c, T addValue) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }

    public void callGenericMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        genericMethod(wildcard, "DATA");
    }
}
