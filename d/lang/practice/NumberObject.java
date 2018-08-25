package d.lang.practice;

public class NumberObject {
    public static void main(String[] args) {

        NumberObject numberObject = new NumberObject();
        numberObject.parseLong("1024");
        numberObject.parseLong("r1024");
        numberObject.printOtherBase(1024);
    }

    public void parseLong(String data) {

        long number = -1;
        try {
            number = Long.parseLong(data);
            System.out.println(number);
        } catch (NumberFormatException ne) {
            System.out.println(data + " is not a number.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printOtherBase(long value) {

        System.out.println("Original : " + value);
        System.out.println("Binary : " + Long.toBinaryString(value));
        System.out.println("Hex : " + Long.toHexString(value));
        System.out.println("Octal : " + Long.toOctalString(value));
    }
}
