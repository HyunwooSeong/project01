package d.util;

import java.math.BigDecimal;

public class BigDecimalSample {
    public static void main(String[] args) {
        BigDecimalSample sample = new BigDecimalSample();
//        sample.normalDoubleCalc();
        sample.bigDecimalCalc();
    }

    public void normalDoubleCalc() {
        double value = 1.0;
        for(int i=0; i<10; i++) {
            value += 0.1;
            System.out.println(value);
        }
    }

    public void bigDecimalCalc() {
        BigDecimal value = new BigDecimal("1.0");
        BigDecimal addValue = new BigDecimal("0.1");
        for(int i=0; i<10; i++) {
            value = value.add(addValue);
            System.out.println(value);
        }
    }
}
