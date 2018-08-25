package d.lang;

public class JavaLang {
    public static void main(String[] args) {
        JavaLang sample = new JavaLang();
//        sample.numberTypeCheck();
//        sample.numberTypeCheck2();
//        sample.numberMinMaxCheck();
//        sample.IntegerMinMaxCheck();
//        sample.SystemPropertiesCheck();
//        sample.printStreamCheck();
//        sample.printNull();
//        sample.mathCheck1();
//        sample.mathCheck2();
//        sample.mathCheck3();
        sample.mathCheck4();
    }

    public void numberTypeCheck() {
        String value1 = "3";
        String value2 = "5";

        byte byte1 = Byte.parseByte(value1);
        byte byte2 = Byte.parseByte(value2);
        System.out.println(byte1 + byte2);

        Integer refInt1 = Integer.valueOf(value1);
        Integer refInt2 = Integer.valueOf(value2);
        System.out.println(refInt1 + refInt2 + "7");
    }

    public void numberTypeCheck2() {
        Integer refInt1;
        refInt1 = 100;
        System.out.println(refInt1.doubleValue());
    }

    public void numberMinMaxCheck() {
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();

        System.out.println("Byte min = " + Byte.MIN_VALUE + " || " + "Byte max = " + Byte.MAX_VALUE);
        System.out.println("Short min = " + Short.MIN_VALUE + " || " + "Short max = " + Short.MAX_VALUE);
        System.out.println("Integer min = " + Integer.MIN_VALUE + " || " + "Integer max = " + Integer.MAX_VALUE);
        System.out.println("Long min = " + Long.MIN_VALUE + " || " + "Long max = " + Long.MAX_VALUE);
        System.out.println("Float min = " + Float.MIN_VALUE + " || " + "Float max = " + Float.MAX_VALUE);
        System.out.println("Double min = " + Double.MIN_VALUE + " || " + "Double max = " + Double.MAX_VALUE);
        System.out.println("Character min = " + (int)Character.MIN_VALUE + " || " + "Character max = " + (int)Character.MAX_VALUE);

        System.out.println("Milli second = " + (System.currentTimeMillis() - startTime));
        System.out.println("Nano second = " + (System.nanoTime() - startNanoTime));
    }

    public void IntegerMinMaxCheck() {
        System.out.println("Integer BINARY min = " + Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println("Integer BINARY max = " + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Integer HEX min = " + Integer.toHexString(Integer.MIN_VALUE));
        System.out.println("Integer HEX max = " + Integer.toHexString(Integer.MAX_VALUE));
    }

    public void SystemPropertiesCheck() {
        System.out.println("java.version = " + System.getProperty("java.version"));
        System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME"));
    }

    public void printStreamCheck() {
        byte b = 127;
        short s = 32767;

        System.out.println(b);
        System.out.println(s);

        printInt(b);
        printInt(s);
    }

    public void printInt(int value) {
        System.out.println(value);
    }

    public void printNull() {
        Object obj = null;
        System.out.println(obj);
        System.out.println(obj + " is object's value");
    }

    public void mathCheck1() {
        double number1 = 45;
        double number2 = -45;

        System.out.println("Math.abs(45) = " + Math.abs(number1));
        System.out.println("Math.abs(-45) = " + Math.abs(number2));

        System.out.println("Math.signum(45) = " + Math.signum(number1));
        System.out.println("Math.signum(-45) = " + Math.signum(number2));

        System.out.println("Math.min(45, -45) = " + Math.min(number1, number2));
        System.out.println("Math.max(45, -45) = " + Math.max(number1, number2));
    }

    public void mathCheck2() {
        double[] numbers = {
                3.15, 3.62, -3.15, -3.62
        };

        for(double number : numbers) {
            System.out.println(number);
            System.out.print("Math.round()=" + Math.round(number));
            System.out.print(" Mtath.rint()=" + Math.rint(number));
            System.out.print(" Math.ceil()=" + Math.ceil(number));
            System.out.print(" Math.floor()=" + Math.floor(number));
            System.out.println();
        }
    }

    public void mathCheck3() {
        System.out.println("Math.sqrt(1) = " + Math.sqrt(1));
        System.out.println("Math.sqrt(2) = " + Math.sqrt(2));
        System.out.println("Math.cbrt(8) = " + Math.cbrt(8));
        System.out.println("Math.cbrt(27) = " + Math.cbrt(27));
        System.out.println("Math.pow(2,2) = " + Math.pow(2,2));
        System.out.println("Math.scalb(2,4) = " + Math.scalb(2,4));
        System.out.println("Math.hypot(3,4) = " + Math.hypot(3,4));
        System.out.println("Math.sqrt(Math.pow(3,2) + Math.pow(4,2)) = " + Math.sqrt(Math.pow(3,2) + Math.pow(4,2)));
    }

    public void mathCheck4() {
        double number1 = 45;
        double number2 = 90;

        double radian45 = Math.toRadians(number1);
        double radian90 = Math.toRadians(number2);

        System.out.println("Radian value 45 degree is " + radian45);
        System.out.println("Radian value 90 degree is " + radian90);

        System.out.println("Math.sin(45 degree) = " + Math.sin(radian45));
        System.out.println("Math.sin(90 degree) = " + Math.sin(radian90));

        System.out.println("Math.cos(45 degree) = " + Math.cos(radian45));
        System.out.println("Math.cos(90 degree) = " + Math.cos(radian90));

        System.out.println("Math.tan(45 degree) = " + Math.tan(radian45));
        System.out.println("Math.tan(90 degree) = " + Math.tan(radian90));
    }
}
