package d.util;

import java.util.StringTokenizer;

public class StringTokenizerSample {
    public static void main(String[] args) {
        StringTokenizerSample sample = new StringTokenizerSample();
        String data = "This is a basic java book.";
//        sample.parseString(data);
        sample.parseStringWithSplit(data);
    }

    public void parseString(String data) {
        StringTokenizer st = new StringTokenizer(data);
        while(st.hasMoreElements()) {
            String tempData = st.nextToken();
            System.out.println("[" + tempData + "]");
        }
    }

    public void parseStringWithSplit(String data) {
        String[] splitString = data.split("\\s");
        for(String tempString : splitString) {
            System.out.println("[" + tempString + "]");
        }
    }
}
