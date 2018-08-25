package d.string.practice;

public class UseStringMethods {
    public static void main(String[] args) {

        String text = "The String class represents character strings.";
        UseStringMethods useStringMethods = new UseStringMethods();
//        useStringMethods.printWords(text);
//        useStringMethods.findString(text, "string");
//        useStringMethods.findAnyCaseString(text, "string");
//        useStringMethods.countChar(text, 's');
        useStringMethods.printContainWords(text, "ss");
    }

    public void printWords(String str) {
        String[] splitStr = str.split(" ");
        for(String data : splitStr) {
            System.out.println(data);
        }
    }

    public void findString(String str, String findStr) {

        int findString = str.indexOf(findStr);
        if (findString != -1) {
            System.out.println("string is apprared at " + findString);
        }
    }

    public void findAnyCaseString(String str, String findStr) {

        String toLowerCase = str.toLowerCase();
        int findString = toLowerCase.indexOf(findStr);
        if (findString != -1) {
            System.out.println("string is appeared at " + findString);
        }
    }

    public void countChar(String str, char c) {

        int count = 0;
        char[] countChar = str.toCharArray();
        for(char temp : countChar) {
            if(temp == c) {
                count++;
            }
        }
        System.out.println("char \'" + c + "\' count is " + count);
    }

    public void printContainWords(String str, String findStr) {

        String[] containWords = str.split(" ");
        for(String temp : containWords) {
            if(temp.contains(findStr)) {
                System.out.println(temp + " contains " + findStr);
            }
        }
    }
}
